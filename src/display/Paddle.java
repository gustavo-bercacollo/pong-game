package display;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Paddle extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 20;
    public static final int HEIGHT = 80;
	
	public Paddle() {
		setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
	    super.paintComponent(g); 

	   
	    g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);
	}
	
}
