// Write a program to swap call by value.
class Prog
{
static void swap(int x,int y)
{
int t; t=x;x=y;y=t;
}
public static void main(String[] args)
{
int a,b; a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
System.out.println("Values before swap\t"+"a="+a+"\t"+"b="+b);
swap(a,b);
System.out.println("Values after swap\t"+"a="+a+"\t"+"b="+b);
}
}

// Write a Program to swap using call by reference.
public class Swap
{
public static void main(String[] args)
{
IntWrapper a = new IntWrapper(25);
IntWrapper b = new IntWrapper(30);
System.out.println("Before swapping, a = " + a.a + " and b = "+
b.a);
swapFunction(a, b);
System.out.println("After swapping, a = " + a.a + " and b is "+
b.a);
}
public static void swapFunction(IntWrapper a, IntWrapper b)
{
IntWrapper c = new IntWrapper(a.a);
a.a = b.a;
b.a = c.a;
}
}
class IntWrapper
{
public int a;
public IntWrapper(int a){ this.a = a;}
}

// Develop a method in java to show how a
// method returns an object.
class Flag {
public static void main(String[] args)
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
Animal y = new Animal();
Animal x = set(y, a, b);
System.out.println("The age is" + " " + x.age);
System.out.println("The weight is" + " " + x.weight);
}
static Animal set(Animal d, int a, int b)
{
Animal c = new Animal();
c = d;
c.age = a;
c.weight = b;
return c;
}
}
class Animal
{
int age, weight;
}

// Write a java program to make a student class attributes like
// roll,name,college,grade now construct 2 students and show their
// information.
public class Parijat {
public static void main(String[] args) {
Student student = new Student(29, "Parijat", "IEM", "A");
Student student2 = new Student(11, "Aman", "IEM", "B");
student.display();
student2.display();
}
}
class Student {
int roll;
String name, college, grade;
Student(int roll, String name, String college, String grade) {
this.roll = roll;
this.name = name;
this.college = college;
this.grade = grade;
}
void display() {
System.out.println("Roll of the student is" + this.roll);
System.out.println("Name of the student is" + this.name);
System.out.println("College name of student is" + this.college);
System.out.println("The grade obtained by the student is" +
this.grade);
}
}
