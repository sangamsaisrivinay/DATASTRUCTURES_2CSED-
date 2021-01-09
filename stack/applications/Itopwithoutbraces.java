import java.util.Scanner;
public class Itopwithoutbraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an infix expression without any braces");
		Scanner sc=new Scanner(System.in);
		String in;
		in=sc.nextLine();
		System.out.println("corresponding postfix is:\n");
		post(in);
	}
	public static boolean prior(char a,char b) {
		//priority order ('*'='/')>('+'='-')
		if(a=='^' && b=='^')
			return true;
		else if(a=='^' && b!='^')
			return false;
		else if(a=='*' && (b=='+' || b=='-' || b=='/'))
			return true;
		else if(a=='/' && (b=='+' || b=='-' || b=='*'))
			return true;
		else if(a=='+' && b=='-')
			return true;
		else if(a=='-' && b=='+')
			return true;
		return false;
	}
	public static void post(String s) {
		char stk[],ch;
		String out="";
		int top=0;
		stk=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			if(Character.isLetter(ch) || Character.isDigit(ch)) {
				out+=ch;
			}
			else if(ch=='+' || ch=='-' || ch=='/' || ch=='*') {
				if(top==0)
					stk[++top]=ch;
				else {
					if(prior(stk[top],ch)) {
						while(prior(stk[top],ch))
							out+=stk[top--];
						stk[++top]=ch;
					}
					else
						stk[++top]=ch;
				}
			}
		}
		while(top!=0)
			out+=stk[top--];
		System.out.println(out);
	}

}
