// Write a program to find surface area and volume of cylinder
// using constructors by taking command line arguments
// CODE:
class AreaVolume
{
int radius;
int height;
double area;
double volume;
AreaVolume(int radius, int height)
{
this.radius = radius;
this.height = height;
}
void getSurfaceArea()
{
area = 2 * Math.PI * radius * (radius + height);
}
void getVolume()
{
volume = Math.PI * radius * radius * height;
}
void display()
{
System.out.println("Surface Area of Cylinder is: " + area);
System.out.println("Volume of Cylinder is: " + volume);
}
}
class cylinder{
public static void main(String[] args)
{
int radius = Integer.parseInt(args[0]);
int length = Integer.parseInt(args[1]);
AreaVolume c = new AreaVolume(radius, length);
c.getSurfaceArea();
c.getVolume(); c.display();
}
}

// Create a class named First ,make instance variable int x, instance
// method void show() and put main method inside that class and use
// the instance variable and method from main
// CODE:
class Main
{
int x;
Main(int x)
{
this.x = x;
}
void show()
{
System.out.println("x is: " + x);
}
}
class ExMain {
public static void main(String[] args)
{
Main p = new Main(Integer.parseInt(args[0]));
p.show();
}
}

// Write a program to find surface area and volume of cone using constructors by
// taking command line arguments
// CODE:
class AreaVolume
{
int radius;
int height;
double area;
double volume;
double slant;
AreaVolume(int radius, int height)
{
this.radius = radius;
this.height = height;
}
void calculate()
{
slant=Math.sqrt(radius*radius+height*height);
area = Math.PI * radius * (radius + slant);
volume = Math.PI * radius * radius * (height/3);
}
void display()
{
System.out.println("The Surface Area of the cone is: " + area);
System.out.println("The Volume of the cone is: " + volume);
}
}
class cone
{
public static void main(String[] args)
{
int radius = Integer.parseInt(args[0]);
int length = Integer.parseInt(args[1]);
AreaVolume c = new AreaVolume(radius, length);
c.calculate();
c.display();
}
}
