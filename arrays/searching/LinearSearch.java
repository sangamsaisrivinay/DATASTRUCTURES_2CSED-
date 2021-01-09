import java.util.Scanner;
public class LinearSearch{
public static void main(String args[]){
int pos,a[],size,key;
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
size=sc.nextInt();
a=new int[size];
System.out.println("enter array elements:");
for(int i=0;i<size;i++){
a[i]=sc.nextInt();
}
System.out.println("enter search element");
key=sc.nextInt();
for(int i=0;i<a.length;i++){
if(a[i]==key){
pos=i+1;
break;
}
else
pos=-1
}
if(pos==-1)
System.out.println("element not found");
else
System.out.println(key+"found at position"+pos+1);
}
}
