
public class Rectangle 
{
	private int length;
	private int width;
	
	public Rectangle (int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	public int getLength() 
	{
		return this.length;
	}
	
	public int getWidth() 
	{
		return this.width;
	}
	
	public void setLength2(int length) 
	{
		this.length = this.length * 2 ;
	}
	
	public void setWidth2(int width) 
	{
		this.width = this.width * 2 ;
	}
	
	public void doubleRec()
	{
		this.width = this.width * 2;
		this.length = this.length * 2;
	}
	
	
	public int calcArea()
	{
		return this.length * this.width;
	}
	
	public int calcPerimeter()
	{
		return this.length * 2 + this.width * 2;
	}
	
	public int scale(int factor)
	{
		return (this.length + this.width) * factor;
	}
	
	public void draw()
	{
		 for (int i = 0; i < this.length; i++) {
	            for (int j = 0; j < this.width; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}

}
