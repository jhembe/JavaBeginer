import java.util.Scanner;

class AddNum
{
	public static void main(String args[]){
		Scanner s=new  Scanner(System.in);
		int a,b,c;

		a = s.nextInt();
		b = s.nextInt();
		c = a+b;

		System.out.println("The sum is : " + c);
	}
}
