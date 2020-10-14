import java.util.Scanner;
class stackoperations{
    final int max=4;
    int stk[]=new int[max];
    int top=0;
    //push
    public void push(int e){
        if(isFull()){
            System.out.println("stackoverflow!!");
            return;
        }
        else
        {
            stk[++top]=e;
        System.out.println(e+" pushed into stack");
        }
    }
    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stackunder flow!!");
            return -1;
        }
        else{
            int temp=stk[top--];
            System.out.println("popped");
            return temp;
        }
    }
    //peek
    public int peek(){
        return stk[top];
    }
    //isFull
    public boolean isFull(){
        return((top==max-1)?true:false);
    }
    //isEmpty
    public boolean isEmpty(){
        return ((top==0)?true:false);
    }
    //viewStack
    public void viewStack(){
        for(int i=top;i>=0;i--)
            System.out.println(stk[i]);
    }

}
public class stack{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        stackoperations obj=new stackoperations();
        System.out.println("stack size: 4");
        obj.push(5);
        obj.push(5);
        obj.push(5);
        obj.push(5);
        obj.push(5);
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        

    }
}