import java.util.Scanner;
class s1
{
 static Scanner sc=new Scanner(System.in);
 String s=sc.next();
 static String m1(int a)
 {
   System.out.println(a);
   return sc.next();
 }
 float m2(long a)
 {
   System.out.println(a);
   System.out.println(this.a);
   return sc.nextFloat();
 }
}
class s11 extends s1
{
  double a=sc.nextDouble();
  int m3(float a)
  {
   System.out.println(a);  
   System.out.println(this.a);
  }
  public static void main(String [] args)
  {
    System.out.println(s1.m1(sc.nextInt()));
    s11 ob=new s11();
    System.out.println(ob.m2(sc.nextLong()));
    System.out.println(ob.m3(sc.nextFloat()));
  }
}
