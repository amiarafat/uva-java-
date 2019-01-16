import java.util.Scanner;
import java.math.BigInteger;

class UVA424
{
	public static void main(String arg[])
	{
		BigInteger n,sum=BigInteger.ZERO;
		Scanner in=new Scanner(System.in);

		while(in.hasNext())
		{
			n=in.nextBigInteger();
			if(n.compareTo(BigInteger.valueOf(0))==0)
			break;
			sum=sum.add(n);
		}

		System.out.println(sum);
	}
}