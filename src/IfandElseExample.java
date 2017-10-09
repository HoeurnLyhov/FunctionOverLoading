import java.util.Scanner;


public class IfandElseExample {
	int arg=0;
	public static void main(String[] args) {
		IfandElseExample ie=new IfandElseExample();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		ie.arg=s.nextInt();
		if(ie.arg>=18)
		{
			System.out.println("Hello world");
		}
		else
		{
			System.out.println("Hello Lyhov");
		}
		
	}

}
