// Design a class to implement stack concept with all necessary
// methods.
stack.java
import java.util.Scanner;
public class Stack
{
int top = -1, size;
int[] a;
Scanner scanner = new Scanner(System.in);
void createarray()
{
System.out.println("Enter the size of the array");
this.size = scanner.nextInt();
a = new int[size];
}
void pop()
{
if (top == -1)
{
System.out.println("The stack is empty.");
}
else
{
top--;
}
}
void push()
{
if (top == size - 1)
{
System.out.println("The stack is full.");
}
else
{
int element;
System.out.println("Enter the element to insert in
the array");
element = scanner.nextInt();
a[++top] = element;
}
}
void display()
{
if (top == -1)
{
System.out.println("No elements in the array
present");
}
else
{
System.out.println("Displaying the stack
elements");
for (int i = 0; i <= top; i++)
{
System.out.println(a[i]);
}
}
}
}
 main.java
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
Stack stack = new Stack();
Scanner scanner = new Scanner(System.in);
int choice = 0;
while (choice != 5)
{
System.out.println("Press 1.CreateStack 2.Push
3.Pop 4.Display 5.Exit");
choice = scanner.nextInt();
switch (choice)
{
case 1:
stack.createarray();
System.out.println("The stack is
created");
break;
case 2:
stack.push();
break;
case 3:
stack.pop();
break;
case 4:
stack.display();
break;
case 5:
System.out.println("Thank you");
break;
default:
System.out.println("Please enter valid
choice");
}
}
scanner.close();
}
}
