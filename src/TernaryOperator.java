
public class TernaryOperator {
	public static void main(String[] arg)
	{
		int a=10,b=20,c=25,d;
		d=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("NUmber: "+d);
	}
}
 