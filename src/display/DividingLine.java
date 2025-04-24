package display;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DividingLine extends JPanel{

	private static final long serialVersionUID = 1L;
	
	
	public DividingLine() {
		setOpaque(false);
	}

	protected void paintComponent(Graphics g) {
	    super.paintComponent(g); 
	    

	    g.setColor(Color.WHITE);
	    int rectWidth = 10;
        int rectHeight = 30;
        int x = (getWidth() ) / 2;
        int y = 8;
        
        while (y + rectWidth < getHeight()) {
        	g.fillRect(x, y, rectWidth, rectHeight);
        	y += rectHeight + 8;
        }
        
        
        
	}
}
