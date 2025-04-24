package display;


import java.awt.Color;

import javax.swing.JFrame;

public class GameWindow {
	
	
	public GameWindow () {
		JFrame window = new JFrame("Pong game");
		
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        
        window.add(new DividingLine());
		
		window.setVisible(true);
	}
}
