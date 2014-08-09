package com.hackbulgaria.corejava.paint.view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.hackbulgaria.corejava.paint.sprites.Sprite;

import javax.swing.JFrame;

public class PaintWindow extends JFrame{
	private static final long serialVersionUID = 1L;
	private final List<Sprite> sprites = new ArrayList<Sprite>();
	
	@Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK); //set color
        g.fillRect(0, 0, getWidth(), getHeight()); //fill the whole window with black

        for (Sprite sprite : sprites) {
            sprite.draw(g);
        }
    }
	
	public void addSprite(Sprite sprite){
        this.sprites.add(sprite);
    }
    
    public void removeSprites(){
        this.sprites.clear();
    }
    
    public void undoSprites(){
        if(!sprites.isEmpty()) {
            this.sprites.remove(sprites.size()-1);
        }
    }
}
