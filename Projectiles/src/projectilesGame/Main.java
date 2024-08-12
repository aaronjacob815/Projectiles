package projectilesGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
	
	//temp edit
	
public class Main extends JFrame implements KeyListener{
	
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 800;
	
	private JLabel title;
	
	public Display display;
	public Projectile ball;
	
	public static void main(String[] args) {
		new Main();
	}
	
	// Initialise UI
	public Main() {
		// Initialise and add title
		title = new JLabel("Projectiles", JLabel.CENTER);
		title.setFont(new Font("SansSerif", Font.PLAIN, 30));
		this.add(title, BorderLayout.NORTH);
		
		// Add the display
		display = new Display();
		this.add(display, BorderLayout.CENTER);
		
		// Initialise the window (JFrame)
		this.setVisible(true);
		this.setSize(WIDTH, HEIGHT);
		this.setTitle("Projectiles");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
