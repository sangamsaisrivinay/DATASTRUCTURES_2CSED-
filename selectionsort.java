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
		sort(a,size);
	}
	public static void sort(int a[],int size){
		int b[]=new int[a.length];
		for(int i=0;i<size;i++)
		b[i]=a[i];
		for(int i=0;i<size;i++){
			int initialindex=i;
			int finalindex=compare(a,i);
			if(initialindex!=finalindex){
				int temp=b[initialindex];
				b[initialindex]=b[finalindex];
				b[finalindex]=temp;
			}
		}
		System.out.println("\narray after modification:");
		for(int i:b)
		System.out.print(i+" ");
	}
	public static int compare(int a[],int i){
		for(int j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
				i=j;
				compare(a,i);
			}
		}
		return i;
	}
}
