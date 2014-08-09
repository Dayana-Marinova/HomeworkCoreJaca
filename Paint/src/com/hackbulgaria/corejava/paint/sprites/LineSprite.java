package com.hackbulgaria.corejava.paint.sprites;

import java.awt.Color;
import java.awt.Graphics;

public class LineSprite extends Sprite{
	
	private int xx;
	private int yy;
	
	public LineSprite(int x, int y, int xx, int yy, int size, Color color) {
        super(x, y, size, color);
        this.xx = xx;
        this.yy = yy;
    }

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(color);
        graphics.drawLine(x, y, xx, yy);
	}

}
