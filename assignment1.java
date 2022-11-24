//assignment 1:
//Q1.) Write a program to find sum of digits and the reverse of the given number (Take input using command line arguments)
class MyFirstProg {
public static void main (String[] args)
{
int a = Integer.parseInt(args[0]);
int b = 0, ans = 0;
while (a != 0)
{
int temp = a % 10;
b = 10 * b + temp;
ans += temp;
a /= 10;
}
System.out.println("Sum = " + ans); System.out.println("Reversed = " +b);
}
}

//Q2.) Write a program to find real roots of the quadratic equation ax2 + bx + c, where a, b, c are constants
import java.lang.Math;
class MyFirstProg {
public static void main(String[] args)
{
int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]), c =
Integer.parseInt(args[2]);
double ans1 = 0.0D, ans2 = 0.0D;
int d = b * b - 4 * a * c;
if (d < 0)
{
System.out.println("Imaginary roots");
}
else if (d == 0)
{
ans1 = -1.0D * b / 2 * a;
System.out.println("Roots are equal. Root =\n" + ans1);
}
else
{
ans1 = (-1.0D + Math.sqrt(d)) / 2 * a; ans2 = (-1.0D -
Math.sqrt(d)) / 2 * a;
System.out.println("Roots =\n" + ans1 + "\n" + ans2);
}
}
}

/*Write a program to determine sum of the following series for
given value of n (Take input using command line arguments).
1 + 1/2 + 1/3 + 1/4 + … +
1/n
CODE:*/
class MyFirstProg {
public static void main(String[] args)
{
int n = Integer.parseInt(args[0]);
double ans = 0.0D;
while (n > 0)
{
ans += (1.0D / n); n--;
}
System.out.println("Sum = " + ans);
}
}

/*Write a program to calculate the GCD of 2 integers.
CODE:*/
class MyFirstProg {
public static void main(String[] args)
{
int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]);
while(true)
{
if (a % b == 0)
{
System.out.println("GCD is " + b);
break;
}
else
{
int temp = b; b = a % b;
a = temp;
}
}
}
}
