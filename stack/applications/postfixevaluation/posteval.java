import java.util.Scanner;
import java.lang.Math;
class evaluate{
	Scanner sc=new Scanner(System.in);
	String inp;
	double stack[],result=0;
	int top=0;
	public evaluate() {
		System.out.println("enter a postfix expression");
		inp=sc.next();
		int MAX=inp.length();
		stack=new double[MAX];
		for(int i=0;i<inp.length();i++) {
			char character=inp.charAt(i);
			if(Character.isDigit(character)) {
		/*_**************_*/stack[++top]=(double)character-'0';	//***************************
			}
			else if(Character.isAlphabetic(character)) {
				System.out.println("invalid data...alphabets are not allowed");
				break;
			}
			else {
				/*-********-*/double operand2=stack[top--];
				/*-*******-*/double operand1=stack[top--];
				stack[++top]=operation(character,operand1,operand2);
			}
		}
		System.out.println(stack[top--]);
	}
	private static double operation(char operator,double operand1,double operand2) {
		double a=operand1;
		double b=operand2;
		switch(operator) {
		case '+':return a+b;
		case '-':return a-b;
		case '*':return a*b;
		case '/':return a/b;
		case '^':return Math.pow(a,b);
		}
		return 0;
	}
}
public class posteval{
	public static void main(String args[]) {
		new evaluate();
	}
}