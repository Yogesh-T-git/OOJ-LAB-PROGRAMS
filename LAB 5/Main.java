import java.util.Scanner;
abstract class Shape{
int d1,d2;
Shape(){}
Shape(int a,int b)
{
d1=a;
d2=b;
}
abstract void printArea();
}
class Rectangle extends Shape{
Rectangle(int a,int b)
{
super(a,b);
}
void printArea()
{
System.out.println("The area of the Rectangle is : "+(d1*d2));
}
}
class Triangle extends Shape{
Triangle(int a,int b)
{
super(a,b);
}
void printArea()
{
System.out.println("The area of the Triangle is : "+(0.5*d1*d2));
}
}
class Circle extends Shape{
Circle(int r)
{
d1=r;
}
void printArea()
{
System.out.println("The area of the Circle is : "+(3.14*d1*d1));
}
}
public class Main {
public static void main(String args[])
{
Scanner scr = new Scanner(System.in);
System.out.println("Enter radius of the Circle : ");
int a = scr.nextInt();
Circle c = new Circle(a);
System.out.println("Enter the dimensions of the Rectangle : ");
a = scr.nextInt();
int b= scr.nextInt();
Rectangle r = new Rectangle(a,b);
System.out.println("Enter the dimensions of the Triangle : ");
a = scr.nextInt();
 b = scr.nextInt();
Triangle t = new Triangle(a,b);
c.printArea();
r.printArea();
t.printArea();
}
}
