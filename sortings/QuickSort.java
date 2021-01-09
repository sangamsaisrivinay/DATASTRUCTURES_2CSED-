import java.util.*;

public class QuickSort
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int n; 			
		int a[],i;	

		System.out.println("Enter the size");
		n = sc.nextInt();

		a = new int[n];

		System.out.println("Enter elements...");
		for(i=0;i<n;i++)
		  a[i] = sc.nextInt();
	
		System.out.println("Before Sorting....");
		for(i=0;i<n;i++)
		System.out.print(a[i]+"  ");

		quickSort(a,0,n-1);
	
		System.out.println("\nAfter Sorting....");
		for(i=0;i<n;i++)
		System.out.print(a[i]+"  ");
		
	}	
	public static void quickSort(int a[], int left, int right)
	{
		int pivot, l,u,temp;

		l= left;
		u = right;
		pivot = left; 

		while(left!=right)
		{
			while((a[right] >= a[pivot] ) && (left!=right)) // R to L
			right--;

			if(left!=right)	// swap
			{
				temp = a[pivot];
				a[pivot] = a[right];
				a[right] = temp;
	
				pivot = right;
			}
		
			while(( a[left]<=a[pivot] ) && (left!=right))// L to R
			left++;
		
			if(left!=right)	// swap
			{
				temp = a[pivot];
				a[pivot] = a[left];
				a[left] = temp;
		
				pivot = left; 
			}
		} 
	
		if(l<pivot) 
		 quickSort(a,l,pivot-1);

		if(pivot<u)	
	 	 quickSort(a,pivot+1,u);
	}
}
