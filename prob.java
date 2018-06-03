/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
int num[]=new int[n];
for(int i=0;i<n;i++)
num[i]=sc.nextInt();
int c1=0,c2=0;
for(int i=0;i<n;i++)
{
if(a==num[i])
  c1++;
if(b==num[i])
c2++;
}
float sum=0;
sum=(float)c1*c2/(n*n);
System.out.println(sum);
t--;
}
	}
}

