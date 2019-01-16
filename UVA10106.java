import java.util.Scanner;
import java.math.BigInteger;
class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			BigInteger a=in.nextBigInteger();
			BigInteger b=in.nextBigInteger();
			BigInteger big= BigInteger.ONE;
			big=a.multiply(b);
			System.out.println(big);
		}
	}
}