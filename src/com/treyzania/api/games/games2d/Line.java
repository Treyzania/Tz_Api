package com.treyzania.api.games.games2d;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Work in progress.
 * 
 * @author Trey
 *
 */
public class Line extends Line2D {

	private Point p1;
	private Point p2;
	
	@Override
	public Rectangle2D getBounds2D() {
		return new Rectangle(p1.x, p1.y, p2.x, p2.y);
	}

	@Override
	public Point2D getP1() {
		return p1;
	}

	@Override
	public Point2D getP2() {
		return p2;
	}

	@Override
	public double getX1() {
		return p1.x;
	}

	@Override
	public double getX2() {
		return p2.x;
	}

	@Override
	public double getY1() {
		return p2.x;
	}

	@Override
	public double getY2() {
		return p2.y;
	}
	
	/**
	 * 
	 * See Javadocs.  Casts to int.
	 * 
	 */
	@Override
	public void setLine(double x1, double y1, double x2, double y2) {
		p1 = new Point((int) x1,(int) y1);
		p2 = new Point((int) x2,(int) y2);
	}

}
