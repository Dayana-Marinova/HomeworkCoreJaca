package com.hackbulgaria.corejava.paint.controller;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;

import com.hackbulgaria.corejava.paint.sprites.DotSprite;
import com.hackbulgaria.corejava.paint.sprites.LineSprite;
import com.hackbulgaria.corejava.paint.sprites.SpraySprite;
import com.hackbulgaria.corejava.paint.sprites.Sprite;
import com.hackbulgaria.corejava.paint.tools.EnumTools.Tool;
import com.hackbulgaria.corejava.paint.view.PaintWindow;

public class PaintController {
	public class Mouse extends MouseAdapter{
		
		int x;
		int y;
		
		@Override
        public void mouseClicked(MouseEvent e) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                Sprite sprite = null;
                Tool currentTool = null;
				if (currentTool == Tool.SPRAY) {
                    super.mouseClicked(e);
                    sprite = new SpraySprite(e.getX(), e.getY(), 1, 100, Color.WHITE);
                } else if (currentTool == Tool.DOT) {
                    sprite = new DotSprite(e.getX(), e.getY(), 100, Color.WHITE);
                }
                if (sprite != null) {
                    PaintWindow window = null;
					extracted(window).addSprite(sprite);
                    extracted(window).repaint();
                }
            }
        }
		
		@Override
        public void mousePressed(MouseEvent e) {
            Component window = null;
			Tool currentTool = null;
			if (e.getButton() == MouseEvent.BUTTON1 && currentTool == Tool.LINE) {
                x = e.getX();
                y = e.getY();
            } else {
				if (e.getButton() == MouseEvent.BUTTON2) {
				    ((PaintWindow) extracted1(extracted1(window))).removeSprites();
				    extracted1(window).repaint();
				} else if (e.getButton() == MouseEvent.BUTTON3) {
				    ((PaintWindow) extracted1(extracted1(window))).undoSprites();
				    extracted1(window).repaint();
				}
			}
        }

		private Component extracted1(Component window) {
			return window;
		}

		@Override
        public void mouseReleased(MouseEvent e) {
            Tool currentTool = null;
			if (e.getButton() == MouseEvent.BUTTON1 && currentTool == Tool.LINE) {
                Sprite sprite = new LineSprite(x, y, e.getX(), e.getY(), 10, Color.CYAN);
                PaintWindow window = null;
				extracted(window).addSprite(sprite);
                extracted(window).repaint();
            }
        }

		private PaintWindow extracted(PaintWindow window) {
			return window;
		}
	}
	
	public class MouseWheel implements MouseWheelListener {

        public void mouseWheelMoved(MouseWheelEvent e) {
            int notches = e.getWheelRotation();
            if (notches > 0) {
                if (currentTool == Tool.DOT) {
                    currentTool = Tool.SPRAY;
                } else if (currentTool == Tool.SPRAY) {
                    currentTool = Tool.LINE;
                } else {
                    currentTool = Tool.DOT;
                }
            } else {
                if (currentTool == Tool.SPRAY) {
                    currentTool = Tool.DOT;
                } else if (currentTool == Tool.LINE) {
                    currentTool = Tool.SPRAY;
                } else {
                    currentTool = Tool.LINE;
                }
            }
        }

	
	private PaintWindow window;
	private Tool currentTool;
	
	public void PaintController() {
        this.window = new PaintWindow();
        window.setTitle("Paint!");
        currentTool = Tool.DOT;
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setFocusable(true);
        window.setVisible(true);
        window.setSize(800,600);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        window.addMouseMotionListener(new MouseMotionAdapter(){});
        window.addMouseWheelListener(new MouseWheel());
    	}
	}
}

