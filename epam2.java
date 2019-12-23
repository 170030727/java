import java.io.*;
import java.util.Scanner;
class Array
{
public static void main(String[]args)
{


 int min=99999,max=0;
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] arr;

  arr = new int[n];
   int i=sc.nextInt();
  for(i=0;i<n;i++)
 {

   if(arr[i]>max)
{
    max=arr[i];
}
}
for(i=0;i<n;i++)
{
if(arr[i]<min)
{
min=arr[i];
}
}

System.out.println(" the max number:"+max);
System.out.println(" the min number:"+min);
}
}
