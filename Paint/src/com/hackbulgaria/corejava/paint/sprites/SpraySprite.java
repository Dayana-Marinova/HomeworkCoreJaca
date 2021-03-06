package com.hackbulgaria.corejava.paint.sprites;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class SpraySprite extends Sprite {

	private int radius;
    private ArrayList<Integer> xxx = new ArrayList<Integer>();
    private ArrayList<Integer> yyy = new ArrayList<Integer>();
    
    public SpraySprite(int x, int y, int size, int radius, Color color) {
        super(x, y, size);
        this.radius = radius;
        getPoints();
    }

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(color);
        graphics.fillOval(x, y, size, size);
        for (int i = 0; i < xxx.size(); i++) {
            graphics.fillOval(xxx.get(i), yyy.get(i), size, size);
        }
	}
	
	private void getPoints() {
        Random rd = new Random();
        int chance;
        for (int i = -this.radius; i < this.radius; i++) {
            for (int j = -this.radius; j < this.radius; j++) {
                chance = rd.nextInt(100) - Math.abs(i - j) - Math.abs(i + j) - Math.abs(i) - Math.abs(j) + radius;
                if (chance >= 50) {
                    xxx.add(x + i);
                    yyy.add(y + j);
                }
            }
        }
    }

}
