This chamges done by likhitha

/* Create a java application where we need to satisfy hybrid inheritance */


import java.util.Scanner;
class First
{
	static Scanner sc = new Scanner(System.in);
	String M1(float a)
	{
		System.out.println(a*5);
		return sc.next();
	}
	char M2(int a)
	{
		System.out.println(a);
		return sc.next().charAt(0);
	}
}
class Second extends First
{
	float M3()
	{
		System.out.println(M1(sc.nextFloat() * 5));
		System.out.println(M2(sc.nextInt()));
		return sc.nextFloat();
		
	}
}
class Three extends Second
{
	Scanner sc = new Scanner(System.in);
	int M4(String a)
	{
		System.out.println(a);
		System.out.println(M3());
		return sc.nextInt();
	}
}
class Four extends Three
{
	float M5(int a)
	{
		System.out.println(a);
		System.out.println(M4(sc.next()));
		return sc.nextFloat();
	}
}
class Five extends Three
{
	double M6(char a)
	{
		System.out.println(a);
		Three x = new Three();
		System.out.println(x.M4(sc.next()));
		return sc.nextDouble();
	}
}
class User 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Four x = new Four();
		Five x1 = new Five();
		System.out.println(x1.M6(sc.next().charAt(0)));
		System.out.println(x.M5(sc.nextInt()));
	}
}