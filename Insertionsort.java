import java.io.*;
import java.util.Scanner;

public class Insertionsort{
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
		System.out.println("\narray after modification:");
		sort(a);
		for(int i:a)
		System.out.print(i+" ");
}
public static void sort(int a[]){
	for(int i=1;i<a.length;i++){
		for(int j=i-1;j>=0;j--){
			if(a[j]>a[j+1]){
			int temp=a[j+1];
			a[j+1]=a[j];
			a[j]=temp;
}
}
}
}
}
