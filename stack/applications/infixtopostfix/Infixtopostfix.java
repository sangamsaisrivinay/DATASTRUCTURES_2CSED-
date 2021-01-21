import java.util.Scanner;

public class Infixtopostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an infix expression");
		String in=sc.nextLine();
		System.out.println("corresponding postfix is:\n");
		post(in);
	}
	public static void post(String s) {
		char stk[],ch;
		int top=0;
		String out="";
		stk=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			//int i=(int)ch;
			if(Character.isLetter(ch) || Character.isDigit(ch))
				out+=ch;
			else {
				if(ch=='(' || ch=='+' || ch=='-' || ch=='*' || ch=='/')
					stk[++top]=ch;
				else if(ch==')') {
					while(stk[top]!='(') {
						out+=stk[top--];
					}
					top--;
				}
			}
		}
		System.out.println(out);
	}
}
