import java.util.Scanner;

public class arrayoperations {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("enter elements of the array");
        for (int i = 0; i < size; i++) {
            System.out.printf("enter %d element of the array", i + 1);
            a[i] = sc.nextInt();
        }
        switchcase(a, size);
    }

    public static void switchcase(int a[], int size) {
        System.out.println("-----Array operations------\n1.display\n2.insertion\n3.deletion\n4.minimum and maximum elements\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice:");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("------array display-----");
                arraydisplay(a, size);
                break;
            case 2:
                System.out.println("array element insertion\nenter the element to insert:");
                int insert = sc.nextInt();
                System.out.print("enter the position to insert:");
                int position = sc.nextInt();
                arrayinsertion(a, insert, position, size+1);
                break;
            case 3:
                System.out.println("array element deletion\nenter element to delete:");
                int trash = sc.nextInt();
                int re = arraydeletion(a, trash, size);
                break;
            case 4:
                System.out.println("fetching array minimum and maximum elements...");
                minmax(a,size);
                break;
            default:
                System.out.println("choice out of range");
        }
    }

    public static void arraydisplay(int[] a, int size) {                          //function 1
        System.out.print("performing array display operation...\n [ ");           //array display method
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
        continue_operation(a,size);
    }

    public static void arrayinsertion(int[] a, int insert, int position, int size) {            //function 2
        size++;                                                                             //array insertion method
        if (position < size) {
            System.out.println("performing array insertion operation...");
            int temp = a[position - 1];
            a[position-1] = insert;
            a[size - 1] = temp;
            System.out.println("array insertion operation completed");
        } else
            System.out.println("position exceeded array size");
        continue_operation(a,size);
    }

    public static int arraydeletion(int[] a, int trash, int size) {            //function 3
        System.out.println("performing element deletion...");               //array deletion method
        for (int i = 0; i < size; i++) {
            if (a[i] == trash) {
                a[i] = a[size - 1];
                size--;
                System.out.printf("deleted %d form the array\n",trash);
                continue_operation(a,size);
                return 0;
            }
        }
        System.out.println("entered element not found in the array\n");
        continue_operation(a,size);
        return -1;
    }

    public static void minmax(int a[],int size) {                          //function 4
        int min = a[0];
        int max = 0;                                                      //array min and max elements fetching method
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
        }
        System.out.printf("minimum element in the array is : %d\nmaximum element in the array is : %d\n", min, max);
        continue_operation(a,size);
    }

    public static void continue_operation(int a[],int size) {
        System.out.println("press one(1) to continue or press zero(0) to exit ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 0) {
            System.out.println("Thank you");
        }
        else
            switchcase(a,size);
    }
}
