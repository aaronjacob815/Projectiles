package projectilesGame;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile {
	
	private int x;
	private int y;
	private int dx;
	private int dy;
	
	public final int SIZE = 20;
	
	
	public Projectile(int x, int y, int dx, int dy) {
		super();
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
	}

	public void updatePos() {
		x = x + dx;
		y = y + dy;
		
		//temp edit
		
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	
	

}
