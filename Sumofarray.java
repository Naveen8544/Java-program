import java.util.Scanner;
class Sumofarray
{
public static void main(String arg[])
{
int arr[]=new int[] {1,2,3,4,5};
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements num");

for(int i=0; i<5; i++)
{
arr[i]=sc.nextInt();

sum=arr[i]+sum;
}
System.out.println("\n sum of all element "+sum);
}
}  
