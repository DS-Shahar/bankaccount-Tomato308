
public class Circle 
{
	private double radius;
	
	public Circle (double radius)
	{
		this.radius = radius;
	}
	
	public void setRadius(double r)
	{
		this.radius = r;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public double area()
	{
		double r = this.radius;
		double a = r*r ;
		return Math.PI * a;
	}
}
