package projectilesGame;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile {
	
	public int x;
	public int y;
	public int dx;
	public int dy;
	
	
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
	
	
	

}
