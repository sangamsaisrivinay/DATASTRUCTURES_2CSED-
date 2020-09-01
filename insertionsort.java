import java.io.*;
import java.util.Scanner;

public class insertionsort{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array:");
	int size=sc.nextInt();
	System.out.println("enter array elements:");
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	a[i]=sc.nextInt();
	System.out.println("array before sort is");
	display(a);
	insertsort(a);
	System.out.println("\narray after sort is");
	display(a);
	}
	private static void display(int a[]){
	for(int i:a)
	System.out.print(i+" ");
	}
	private static void insertsort(int a[]){
	for(int i=0;i<a.length;i++){
	for(int j=i;j>=0;j--){
	if(a[j]>a[i]){
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}
	}
	}
}
