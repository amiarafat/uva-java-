import java.util.Scanner;
import java.math.BigInteger;

class UVA568
{
	public static void main(String arg[])
	{
		int  t,n,m,i;
		char ab;
	BigInteger sum,x,z;
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			n=in.nextInt();
			x=BigInteger.ONE;

			for(i=1;i<=n;i++)
			x=x.multiply(BigInteger.valueOf(i));


			String A=x.toString();

			char[] a=A.toCharArray();

			for(i=A.length()-1;i>=0;i--)
			{
				if(a[i]!='0')
				{

					System.out.printf("%5d -> %c\n",n,a[i]);
					break;
				}
			}

		}
	}
}