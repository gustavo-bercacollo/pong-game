package display;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DividingLine extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 8;
    public static final int HEIGHT = 25;
	
	public DividingLine() {
		setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
	    super.paintComponent(g); 
	    

	    g.setColor(Color.WHITE);
	
        int x = (getWidth()) / 2;
        int y = 8;
        
        while (y + WIDTH < getHeight()) {
        	g.fillRect(x, y, WIDTH, HEIGHT);
        	y += HEIGHT + 8;
        }
        
        
        
	}
}
