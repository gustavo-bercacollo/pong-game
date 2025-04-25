package display;


import java.awt.Color;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
    private static final long serialVersionUID = 1L;

    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;
    public static final Color BACKGROUND_COLOR = Color.BLACK;

    public GameWindow() {
        setTitle("Pong Game");  
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(BACKGROUND_COLOR);
        setResizable(false);

        
        int paddleY = (((SCREEN_HEIGHT - Paddle.HEIGHT)) / 2) - Paddle.HEIGHT / 4;

        Paddle leftPaddle = new Paddle();
        leftPaddle.setBounds(10, paddleY, Paddle.WIDTH, Paddle.HEIGHT);

        Paddle rightPaddle = new Paddle();
        rightPaddle.setBounds(SCREEN_WIDTH - Paddle.WIDTH - 20, paddleY , Paddle.WIDTH, Paddle.HEIGHT);

        DividingLine dividingLine = new DividingLine();
        dividingLine.setBounds(0, 0, SCREEN_WIDTH, SCREEN_HEIGHT);

        setLayout(null);
        add(dividingLine);
        add(leftPaddle);
        add(rightPaddle);

        setVisible(true);
    }
}