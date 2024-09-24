
public class Main
{
   public static void main(String[] args) 
   {
     BankAccount acct1 = new BankAccount(1000, -1000);
     System.out.println(acct1.getBalance());
     BankAccount acct2 = new BankAccount(1000, -1000);
     System.out.println(acct2.getBalance());
     acct2.transfer(acct1, 500);
     System.out.println(acct1.getBalance());
     System.out.println(acct2.getBalance());
     acct1.transfer(acct2, 1600);
     System.out.println("money has been tranfered from Bob to Lisa");
   
   	Rectangle rec1 = new Rectangle (3,4);
	Rectangle rec2 = new Rectangle (6,4);
	rec1.doubleRec();
	System.out.println("Length of first rectangle is:" + rec1.getLength());
	
	System.out.println("Width of first rectangle is:" + rec1.getWidth());
	
	System.out.println("Area of first rectangle is:" + rec1.calcArea());
	
	System.out.println("Area of second rectangle is:" + rec2.calcArea());
	
	System.out.println("Perimeter of first rectangle is:" + rec1. calcPerimeter());
	
	System.out.println("Perimeter of second rectangle is:" + rec2. calcPerimeter());
	
	rec2.draw();
	
	Circle circ1 = new Circle (12.55);
	Circle circ2 = new Circle (15.67);
	
	System.out.println("Area of first circle is:" + circ1.area());
	System.out.println("Area of second circle is:" + circ2.area());
	
	Volcano Fuji = new Volcano ("Fugi", 10);
	Volcano Kili = new Volcano ("Kilimanjaro", 5);
	
	Kili.add(2200);
	   
	int random;
	
	for (int i = 0; i< 7; i++)
	{
	  	random = (int)(Math.random()*(2001));
		Fuji.add(random);
	}
	
	Fuji.fix(4, 1700);

	Fuji.print();
	Kili.print();
	
	System.out.println(Fuji.toString());
	System.out.println(Kili.toString());
	
	System.out.println(Fuji.maxUnder(5000));
	
	System.out.println(Fuji.average());
	
	Fuji.delete(3);
	Fuji.print();
	
	Fuji.deleteAll();
	Fuji.print();
	


   }
}
