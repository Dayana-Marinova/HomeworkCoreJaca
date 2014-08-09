package com.hackbulgaria.corejava.paint.sprites;

import java.awt.Color;
import java.awt.Graphics;

public class DotSprite extends Sprite{
	
	public DotSprite(int x_, int y_, int size_, Color color_) {
		super(x_, y_, 5, color_);
	}

	@Override
    public void draw(Graphics graphics) {
        if (color != null) {
            graphics.setColor(color); //set Color to use for FUTURE draw and fill calls
        }
        graphics.fillOval(x, y, size, size);
    }
}
