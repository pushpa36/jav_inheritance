import java.util.Scanner;

class A {
    static Scanner sc = new Scanner(System.in);

    static int m1(String a) {
        System.out.println(a);
        return sc.nextInt();
    }

    byte m2(double a) {
        System.out.println(a);
        return sc.nextByte();
    }
}

class B extends A {
    char m3(int a) {
        System.out.println(a);
        return sc.next().charAt(0);
    }
}

class C extends A {
    short m4(float b) {
        System.out.println(b);
        return sc.nextShort();
    }
}

class D {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println("Enter a string for m1:");
        System.out.println(A.m1(A.sc.next()));
        System.out.println("Enter a double for m2:");
        System.out.println(obj.m2(A.sc.nextDouble()));
        System.out.println("Enter an integer for m3:");
        System.out.println(obj.m3(A.sc.nextInt()));
        C ob = new C();
        System.out.println("Enter a float for m4:");
        System.out.println(ob.m4(A.sc.nextFloat()));
    }
}
