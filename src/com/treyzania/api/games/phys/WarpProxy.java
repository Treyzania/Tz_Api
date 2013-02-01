package com.treyzania.api.games.phys;

public class WarpProxy implements IWarpable2D, IWarpable3D {

	public double sx = 0;
	public double sy = 0;
	public double sz = 0;
	
	public double ex = 0;
	public double ey = 0;
	public double ez = 0;
	
	public WarpProxy(double shrinkX, double shrinkY, double expandX, double expandY) {
		
		this.sx = shrinkX;
		this.sy = shrinkY;
		
		this.ex = expandX;
		this.ey = expandY;
		
	}
	
	public WarpProxy(double shrinkX, double shrinkY, double shrinkZ, double expandX, double expandY, double expandZ) {
		
		this(shrinkX, shrinkY, expandX, expandY);
		
		this.sz = shrinkZ;
		this.ez = expandZ;
		
	}
	
	@Override
	public double getShrinkX() {
		return sx;
	}
	@Override
	public double getShrinkY() {
		return sy;
	}
	@Override
	public double getShrinkZ() {
		return sz;
	}
	@Override
	public double getExpandX() {
		return ex;
	}
	@Override
	public double getExpandY() {
		return ey;
	}
	@Override
	public double getExpandZ() {
		return ez;
	}
	
}
