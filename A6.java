// Take a string from keyboard and convert into character array
// (new one).
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Please enter a string : ");
String str = s.next();
char[] str1 = new char[str.length()];
for (int i = 0; i < str.length(); i++) {
str1[i] = str.charAt(i);
}
System.out.println("The new character array : \n");
for (int i = 0; i < str.length(); i++) {
System.out.println(i + " : " + str1[i]);
}
}
}

// Take a string from keyboard and a char array (filled up to length
// 5). Now append the string to that char array. Show the char array.
import java.util.*;
public class Main
{
public static void main(String[] args)
{
Scanner scanner =new Scanner(System.in);
String str;
System.out.println("Enter a string");
str=scanner.next();
System.out.println("Enter the character array");
char[] a=new char[5];
for(int i=0;i<5;i++)
{
a[i]=scanner.next().charAt(0);
}
System.out.println("String after concatenating the
array");
String s=" ";
for(int i=0;i<5;i++)
{
s=s+a[i];
}
System.out.print(s+" "+str);
scanner.close();
}
}
//  Find length of a string taken from keyboard and also find the
// length of that string except front and end spaces.
 import java.util.Scanner;
public class Main{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Please enter a string : ");
String str = s.nextLine();
System.out.println("Length of the string : " +
str.length());
System.out.println("Length of the string without
spaces : " + str.trim().length());
}
// }
//Check if "Tech" presents in "University of Technology" or not. If
// yes return its position.
                   public class Main {
public static void main(String[] args) {
String mainWord = "University of Technology";
String toSearch = "Tech";
if (mainWord.contains(toSearch)) {
System.out.println("Found at position : " +
mainWord.indexOf(toSearch));
}
else {
System.out.println("Word not found");
}
}
// }
//                    Write a program to take a sentence and convert it into string
// arrays and sort the words using any sorting technique.
                     import java.util.Scanner;
import java.util.Arrays;
public class Main{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter a sentence(max 10 words) :
");
String line = s.nextLine();
String[] words = line.split(" ", 10);
Arrays.sort(words);
System.out.println("Words in sorted order:");
for (int i = 0; i < words.length; i++) {
System.out.println(i + " : " + words[i]);
}
}
}
                   
//                    Generate password from initials of one’s first_name,
// middle_name, last_name and with last four digit of your roll_no (if
// middle name is not present, it won't come).
import java.util.Scanner;
public class Main{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter your full name : ");
String temp = s.nextLine();
String[] name = temp.split(" ", 3);
System.out.println("Enter your roll");
String roll = s.next();
if (name.length != 3 || roll.length() < 4) {
System.out.println("Password can't be generated");
}
else {
String password = "";
password += name[0].charAt(0);
password += name[1].charAt(0);
password += name[2].charAt(0);
password += roll.substring(roll.length() - 4);
System.out.println("Password : " + password);
}
}
}
                   
//                    Write a program in Java which will read a string and rewrite it in
// the alphabetical order. For example, the word STRING should be
// written as GINRST.
                   import java.util.*;
public class Main{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
String str;
System.out.println("Enter a string you want");
str=scanner.next();
char[] s=new char[str.length()];
for(int i=0;i<str.length();i++)
{
s[i]=str.charAt(i);
}
Arrays.sort(s);
System.out.println("The sorted array is");
for(int i=0;i<str.length();i++)
{
System.out.print(s[i]);
}
scanner.close();
}
// }
//                    Write a program in Java to extract a portion of a character string
// and print the extracted string. Assume that m characters are extracted,
// starting with the n-th character. The method signature will be like:
// void extract(String str, int n, int m).
  import java.util.*;
public class Main{
public static void extract(String str,int n,int m)
{
System.out.println("The extracted substring is : ");
for(int i=n-1;i<=(m+n-2);i++)
{
System.out.print(str.charAt(i));
}
}
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a string");
String str=scanner.next();
System.out.println("Enter the value of n");
int n=scanner.nextInt();
System.out.println("Enter the value of m");
int m=scanner.nextInt();
extract(str, n, m);
scanner.close();
}
}
