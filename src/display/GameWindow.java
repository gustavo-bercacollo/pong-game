package display;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
    private static final long serialVersionUID = 1L;

    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;
    public static final Color BACKGROUND_COLOR = Color.BLACK;

    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private DividingLine dividingLine;

    public GameWindow() {
        setupWindow();
        setupLeftPaddle();
        setupRightPaddle();
        setupDividingLine();
        setupLayout();
    }

    private void setupWindow() {
        setTitle("Pong Game");
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(BACKGROUND_COLOR);
        setResizable(false);
        setFocusable(true);
        setupKeyListener();

    }

    private void setupLeftPaddle() {
        int paddleY = (SCREEN_HEIGHT - Paddle.HEIGHT) / 2;
        leftPaddle = new Paddle(10, paddleY);
    }

    private void setupRightPaddle() {
        int paddleY = (SCREEN_HEIGHT - Paddle.HEIGHT) / 2;
        rightPaddle = new Paddle(SCREEN_WIDTH - Paddle.WIDTH - 20, paddleY);
    }

    private void setupDividingLine() {
        dividingLine = new DividingLine();
        dividingLine.setBounds(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    private void setupLayout() {
        setLayout(null);
        add(dividingLine);
        add(leftPaddle);
        add(rightPaddle);
        setVisible(true);
    }

    private void setupKeyListener() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();

                if (keyCode == KeyEvent.VK_W) {
                    leftPaddle.moveUp();
                } else if (keyCode == KeyEvent.VK_S) {
                    leftPaddle.moveDown();
                }

                if (keyCode == KeyEvent.VK_UP) {
                    rightPaddle.moveUp();
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    rightPaddle.moveDown();
                }

                repaint(); 
            }
        });
    }
}
