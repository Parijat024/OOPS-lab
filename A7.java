// Write a program to handle the ArithmeticException
import java.util.Scanner;
public class Main {
public static void main(String[] args)
{
try
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the Dividend");
int x=scanner.nextInt();
System.out.println("Enter the divisor");
int y=scanner.nextInt();
int z=x/y;
System.out.println("The Quotient is "+z);
scanner.close();
}
catch(ArithmeticException e)
{
System.out.println("We can not divide by 0");
}
}
}

// Write a program for multiple catch to fire
// ArrayIndexOutOfBoundsException and
// StringIndexOutOfBoundsException both.
import java.util.Scanner;
public class Ex {
public static void main(String[] args)
{
try
{
Scanner scanner=new Scanner(System.in);
int n;
System.out.println("Enter the array size");
n=scanner.nextInt();
int[] arr=new int[n];
System.out.println("Enter the array elements");
for(int i=0;i<=n;i++)
{
int x;
x=scanner.nextInt();
arr[i]=x;
}
scanner.close();
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("The array index is out od
bound");
}
}
}
//String COde:
                   import java.util.Scanner;
public class Ex {
public static void main(String[] args)
{
try
{
Scanner scanner=new Scanner(System.in);
int n;
System.out.println("Enter the string size");
n=scanner.nextInt();
String x="";
for(int i=0;i<n;i++)
{
char a;
a=scanner.next().charAt(0);
x=x+a;
}
System.out.println("Displaying the string");
System.out.println();
for(int i=0;i<=x.length();i++)
{
System.out.print(x.charAt(i));
}
System.out.println();
scanner.close();
}
catch(StringIndexOutOfBoundsException e)
{
System.out.println("You are accessing string index
as out of bound");
}
}
}
                   
//                    Write a program to fire the NegativeArraySize exception
                   import java.util.Scanner;
public class Main {
public static void main(String[] args) {
try {
Scanner scanner = new Scanner(System.in);
int n;
System.out.println("Enter the array size");
n = scanner.nextInt();
int[] a = new int[n];
for (int i = 0; i < n; i++) {
int x;
x = scanner.nextInt();
a[i] = x;
}
System.out.println("The array is: ");
for (int i = 0; i < n; i++) {
System.out.print(a[i]);
}
scanner.close();
} catch (NegativeArraySizeException e) {
System.out.println("The array can not be of
negative size");
}
}
}
                   
//                    Define an object reference and initialize it to null. Try to call a
// method through this reference. Now wrap the in a try-catch clause to
// catch the exception.
                   import java.util.Scanner;
class Cat
{
void call()
{
System.out.println("Cat calls meow");
}
}
public class Main {
public static void main(String[] args)
{
try
{
Cat cat=null;
cat.call();
}
catch(NullPointerException e)
{
System.out.println("The null pointer can not call
a method");
}
}
}
                   
//                    Write a program in Java to create a user defined exception named
// PayOutOfBoundsException (provided the monthly salary of a person
// is less than Rs. 10,000 /) and fire the exception.
// CODE:
                   import java.util.Scanner;
class PayOutOfBounds extends Exception {
public PayOutOfBounds(double salary)
{
}
}
public class Main {
public static void main(String[] args)
{
try
{
double salary;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the salary");
salary=scanner.nextDouble();
if(salary>10000)
{
throw new PayOutOfBounds(salary);
}
System.out.println("Salary is "+salary);
scanner.close();
}
catch(PayOutOfBounds e)
{
System.out.println("Your salary should be less
than 10000");
}
}
}
                   
//                    Create a class with two methods, f( ) and g( ). In g( ), throw an exception
// of a new type that you define. In f( ), call g( ), catch its exception and, in the
// catch clause, throw a different exception (of a second type that you define).
// Test these methods from and within main( ).
                   public class Main{
static void f()
{
try
{
throw new NullPointerException("demo");
}
catch(NullPointerException e)
{
System.out.println("Caught inside f().");
throw e;
}
}
static void g(){
try
{
throw new ArrayIndexOutOfBoundsException("demo2");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Caught inside g().");
throw e;
}
}
public static void main(String args[]){
try
{
f();
}
finally
{
try
{
g();
}
catch(NullPointerException e)
{
System.out.println("Caught in main.");
}
catch(ArrayIndexOutOfBoundsException f)
{
System.out.println("Caught in main.");
}
}
}
}
                   
//                    Write a program that takes one string and two integers as command
// line argument and prints the reverse of the substring of the string
// specified by the two numbers. The program should handle all possible
// exception that may arise due to bad input.
                   public class Subclass{
public static void main(String[] args)
{
try{
String s=args[0];
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
String str="";
for(int i=b;i<=c;i++)
{
str=str+s.charAt(i);
}
String p="";
for(int i=0;i<str.length();i++)
{
p=p+str.charAt(i);
}
System.out.println("The reversed substring is
"+p);
}
catch(Exception e)
{
System.out.println("Please check your inserted
string or given indexes");
}
}
}
                   
//                    Write a demo program to illustrate the restrictions of using ‘throws’
// clause in method overriding with regard to superclass-subclass concept.
                   class SuperClass {
void method() {
System.out.println("SuperClass");
}
}
class Main extends SuperClass {
void method() throws ArithmeticException {
System.out.println("SubClass");
}
public static void main(String args[]) {
SuperClass s = new Main();
s.method();
}
}
