import java.util.Scanner;

public class AreaCalculator
{
	public static void main(String[] args)
	{
		System.out.println("| Area Calculator |");
		System.out.println();
		System.out.println("1. Circle");
		System.out.println("2. Triangle");
		System.out.println("3. Rectangle");
		System.out.println();
		System.out.println("Type desired number");
		Scanner in = new Scanner(System.in);
			String input = in.next();
			switch(input)
			{
				case "1":
					System.out.println("What is the radius of the circle?");
					int x = Integer.parseInt(in.next());
					if(x>0)
						System.out.println("The area of the circle is " + Math.pow((x),2)*Math.PI);
					else
						System.out.println("Failed consistency check!");
					break;
				case "2":
					System.out.println("What is the base of the triangle?");
					int b = Integer.parseInt(in.next());
					if(b>0)
					{
						System.out.println("What is the height of the triangle?");
						int h = Integer.parseInt(in.next());
						if(h>0 && (b%2==1 || h%2==1))
							System.out.println("The area of the triangle is " + .5*b*h);
						else
							System.out.println("Failed consistency check!");
					}
					else
						System.out.println("Failed consistency check!");
					break;
				case "3":
					System.out.println("What is the base of the rectangle?");
					b = Integer.parseInt(in.next());
					if(b>0)
					{
						System.out.println("What is the height of the rectangle?");
						int h = Integer.parseInt(in.next());
						if(h>0 && b!=h)
							System.out.println("The area of the rectangle is " + b*h);
						else
							System.out.println("Failed consistency check!");
					}
					else
						System.out.println("Failed consistency check!");
					break;
				default:
				System.out.println("Invalid choice!");		
			}
			in.close();
	}
}
