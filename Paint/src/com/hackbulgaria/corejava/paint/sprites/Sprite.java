package com.hackbulgaria.corejava.paint.sprites;
import java.awt.Color;
import java.awt.Graphics;

public abstract class Sprite {
	protected int x;
	protected int y;
	protected int size;
	protected Color color;
	
	public Sprite(int x_, int y_, int size_){
		this.x = x_;
		this.y = y_;
		this.size = size_;
		this.color = Color.BLACK;
	}
	
	public Sprite(int x_, int y_, int size_, Color color_){
		this.x = x_;
		this.y = y_;
		this.size = size_;
		this.color = color_;
	}
	
	public abstract void draw(Graphics graphics);
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public Color getColor(){
		return this.color;
	}
	
	public void setX(int x_){
		this.x = x_;
	}
	
	public void setY(int y_){
		this.y = y_;
	}
	
	public void setSize(int size_){
		this.size = size_;
	}
	
	public void setColor(Color color_){
		this.color = color_;
	}
}
