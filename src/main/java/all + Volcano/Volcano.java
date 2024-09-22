
public class Volcano 
{
	private int[] degrees;
	private int count;
	private String name;
	
	public Volcano (String n,int size)
	{
		name = n;
		degrees = new int [size];
		count = 0;
	}
	
	public Volcano (Volcano volc)
	{
		name = volc.name;
		count = volc.count;
		this.degrees = new int [volc.degrees.length];
		for(int i = 0; i <volc.count; i++)
		{
			degrees[i] = volc.degrees[i]; 
		}
	}
	
	public int getCount()
	{
		return this.count;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public boolean add(int deg)
	{
		if (degrees[this.count] == 0)
		{
			degrees[count] = deg;
			count += 1;
			return true;
		}
	return false;
	}
	
	public void delete(int dex)
	{
		for (int i = dex; i<count; i++)
		{
			degrees[i] = degrees[i+1];
		}
		degrees[count] = 0;
	}
	
	public void deleteAll()
	{
		for (int i = 0; i<degrees.length; i++)
		{
			degrees[i] = 0;
		}
		degrees[count] = 0;
	}
	
	public void fix(int f, int meas)
	{
	    degrees[f] = meas;
	}
	
	public double average()
	{
		double avg;
		int sumDeg = 0;
		for (int i = 0; i< this.count; i++)
		{
			sumDeg += degrees[i];
		}
		
		avg =(double) sumDeg/count;
		return avg;
	}
	
	public int maxUnder(int X) 
	{
		int c = 0;
		int max = -1;
		for (int i = 0; i < count; i ++)
		{
			if (degrees[i] < X & degrees[i] > max)
			{
				max = degrees[i];
				c = i;
			}
		}
		return c;
	}
	
	public void print()
	{
		int countLine = 1;
		for (int i = 0; i< this.count; i++)
		{
			System.out.println(countLine + ")" + degrees[i]);
			countLine += 1;
		}
	}
	
	public String toString()
	{
		return "there are: " + this.count + " measurements in the " + this.name + " mountain," + "and the size is: " + degrees.length; 
	} 

}











