import java.util.Scanner;
class Swap
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("\n after Swap="+a +" " +b);
}
}
