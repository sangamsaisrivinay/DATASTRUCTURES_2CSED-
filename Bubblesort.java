import java.io.*;
import java.util.Scanner;

class Bubblesort{
public static void main(string a[]){
int a[],size;
Scanner sc=new Scanner(System.in);
size=sc.nextInt();
a=new int[size];
System.out.println("enter size of array");
for(int i=0;i<size;i++)
a[i]=sc.nextInt();
System.out.println("unsorted array...\n");
for(int i:a)
System.out.print(i+" ");
System.out.println("\nsorted array...\n");
sort(a);
for(int i:a)
System.out.print(i+" ");
}
public static void sort(int a[]){
for(int i=0;i<a.length;i++){
forint j=0;j<n-i-1;j++){
if(a[j]>a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
}
}
