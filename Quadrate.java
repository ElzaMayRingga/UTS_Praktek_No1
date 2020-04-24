/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsprakteksoal1;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Quadrate {
public static void main(String[] args) {
//Ask user for coefficients
Scanner input = new Scanner(System.in);
System.out.println("Enter the value of coefficient a: ");
double a = input.nextDouble();
System.out.println("Enter the value of coefficient b: ");
double b = input.nextDouble();
System.out.println("Enter the value of coefficient c: ");
double c = input.nextDouble();
//Create object
QuadraticEquation quad = new QuadraticEquation(a,b,c);
double discriminant = quad.getDiscriminant();
//dispay the roots
        if (discriminant > 0) {
            System.out.println("The equation has two roots, they are " + quad.getRoot1()
                    + " and " + quad.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has one root  " + quad.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
}
}
//class
class QuadraticEquation
{
private double a,b,c;

public QuadraticEquation(double a,double b,double c)
{
this.a=a;
this.b=b;
this.c=c;
}

public double getDiscriminant()
{
return b*b-4*a*c;
}

public double getRoot1()
{
double discriminant = getDiscriminant();
if (discriminant<0)
return 0;
else
return (-b-Math.sqrt(discriminant))/(2*a);
}

public double getRoot2()
{
double discriminant = getDiscriminant();
if (discriminant<0)
return 0;
else
return (-b+Math.sqrt(discriminant))/(2*a);
}

public double getA()
{
return a;
}

public double getB()
{
return b;
}

public double getC()
{
return c;
}

public String toString()
{
return a+"x^2+"+b+"x+"+c+"=0";
}

public double xFunctionAt(double x)
{
return a*x*x+b*x+c;
}

}