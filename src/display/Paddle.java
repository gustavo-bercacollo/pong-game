package display;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Paddle extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 20;
    public static final int HEIGHT = 80;
    
    private int y;

	
	public Paddle(int x, int y) {
		setOpaque(false);
		setBounds(x, y, WIDTH, HEIGHT);
		this.y = y;
	}

	@Override
	protected void paintComponent(Graphics g) {
	    super.paintComponent(g); 

	   
	    g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);
	}
	
	
	 public void moveUp() {
	        if (y > 0 ) {
	            y -= 10; 
	            setBounds(getX(), y, WIDTH, HEIGHT); 
	        }
	}
	 
	 public void moveDown() {
		    if (y < GameWindow.SCREEN_HEIGHT - HEIGHT) {  
		        y += 10;
		        setBounds(getX(), y, WIDTH, HEIGHT);
		    }
		}

}
