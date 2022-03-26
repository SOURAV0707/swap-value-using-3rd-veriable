import java.util.*;
class Swap
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int n3;
System.out.println("enter n1:");
int n1=obj.nextInt();
System.out.println("enter n2:");
int n2=obj.nextInt();
n3=n1;
n1=n2;
n2=n3;
System.out.println("after swapping the value of n1="+n1);
System.out.println("after swapping the value of n2="+n2);
}
}
