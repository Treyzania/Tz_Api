package com.treyzania.api.games;

import java.awt.Image;
import java.awt.Paint;
import java.awt.Shape;
import java.awt.image.ImageObserver;

/**
 * A very work-in-progress class to be used to have support for all canvasses, but developers would have to do a bit of initial work.
 * Android doesn't have native support for "java.awt.Graphics2D". (Is that the right package?)
 * 
 * @author Trey
 *
 */
public interface IDrawable {

	public void draw(Shape s);
	
	public void drawARGB(int a, int r, int g, int b);
	public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle);
	public void drawLine(float x1, float y1, float x2, float y2);
	public void drawCircle(float cx, float cy, float radius, Paint paint);
	public void drawOval(int x, int y, int width, int height);
	
	public void drawImage(Image img, int x, int y, int width, int height, ImageObserver observer);
	
}
