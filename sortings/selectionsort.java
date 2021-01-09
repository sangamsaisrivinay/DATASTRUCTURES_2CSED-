import java.io.*;
import java.util.Scanner;

public class selectionsort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<size;i++)
		a[i]=sc.nextInt();
		System.out.println("array before modification:");
		for(int i:a)
		System.out.print(i+" ");
		sort(a);
		System.out.println("array after modification");
		for(int i:a)
		System.out.print(i+" ");
}
public static void sort(int a[]){
		for(int i=0;i<a.length;i++){
		int temp=i;
		for(int j=i+1;j<a.length;j++){
		if(a[j]<a[temp])
		temp=j;
}
if(temp!=i){
int temp1=a[temp];
a[temp]=a[i];
a[i]=temp1;
}
}
}
}
