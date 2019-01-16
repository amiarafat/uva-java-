import java.util.Scanner;
import java.math.BigInteger;

class UVA10523
{
	public static void main(String arg[])
	{
		int  t,n,m,i;
	BigInteger a,sum,x,z;
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			n=in.nextInt();
			a=in.nextBigInteger();
			x=BigInteger.ONE;
			sum=BigInteger.ZERO;
			for(i=1;i<=n;i++)
			{
				x=a.pow(i);
				z=x.multiply(BigInteger.valueOf(i));

				sum=sum.add(z);
			}

			System.out.println(sum);
		}
	}
}