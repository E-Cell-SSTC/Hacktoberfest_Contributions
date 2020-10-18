/*
        Java program to calculate the area of different shapes namely circle, rectangle,
        and triangle using the concept of method overloading. 


*/
import java.util.Scanner;
import java.lang.Math;

public class MethodOverloading{

    void area(float r)
    {
        System.out.println("Area: "+3.14*r*r);
    }

    void area(float l,float b)
    {
        System.out.println("Area: "+l*b);
    }

    void area(float a,float b,float c)
    {
        float s=(a+b+c)/2;
        System.out.println("Area: "+ Math.sqrt(a*(s-a)*(s-b)*(s-c)));
    }
    public static void main(String[] args)
    {
        MethodOverloading ar=new MethodOverloading();
        float r,l,b,h,a,c;
        Scanner scanner=new Scanner(System.in);

        System.out.print("\nFor circle,\n Enter the radius:");
        r=scanner.nextFloat();
        ar.area(r);
        System.out.print("\nFor rectangle,\n Enter the length: ");
        l=scanner.nextFloat();
        System.out.print("Enter the breadth: ");
        b=scanner.nextFloat();
        ar.area(l,b);
        System.out.print("\nFor Triangle,\n Enter the length of first side: ");
        a=scanner.nextFloat();
        System.out.print("Enter the length second side: ");
        b=scanner.nextFloat();
        System.out.print("Enter the length third side: ");
        c=scanner.nextFloat();
        ar.area(a,b,c);
        
    }
}


