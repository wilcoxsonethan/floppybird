package floppybird;

import java.awt.*;
import javax.swing.*;

public class Window {
	private static void createWindow() {
		JFrame frame = new JFrame("Simple GUI");
		// Creates and names the new window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Causes program to end when the window is closed
		JLabel textLabel = new JLabel("This is where the game will go", SwingConstants.CENTER);
		// Adds the graphics centered on the screen
		textLabel.setPreferredSize(new Dimension(700, 900));
		// Sets the size of the window
		frame.getContentPane().add(textLabel, BorderLayout.CENTER); 
		// Adds the label to be printed in the center of the frame
		frame.pack();
		// Ensures the percentage size of the window is 100%
		frame.setLocationRelativeTo(null);
		// Set the Location on the screen
		frame.setVisible(true); 
		// Makes the window visible when the program is run
	}
	
	public static void main(String[] args) {
			createWindow();
			// Launches the window
	}
	
}
