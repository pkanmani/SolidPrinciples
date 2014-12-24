package com.OpenClosed.Sample2;

public class GraphicModifier {

	public void drawShape(Shape s)
	{
		s.draw();
	}
	
}
abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}
	
}