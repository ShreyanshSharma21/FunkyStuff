package hellonew;
import java.util.*;


class tpo
{
	public static void main(String [] args) 
	{
		Scanner obj = new Scanner(System.in);
		
		int T,N, Q,XX,YY;
		T=obj.nextInt();
		for(int i = 0;i<T;i++)
		{
			N=obj.nextInt();
			Q=obj.nextInt();
			String str[] = new String[Q];
			int X[] = new int[N*3];
			String S[] = new String[N*3];
			String L[] = new String[N*3];
			
			for(int j=0;j<N*3;j++)
			{
				X[j]=obj.nextInt();
				S[j]=obj.next();
				L[j]=obj.next();				
			}
			for(  int k = 0 ; k<Q ; k++)
			{
				XX=obj.nextInt();
				YY=obj.nextInt();
				int var=0;
				for(int j=0;j<N*3;j++)
				{
					if(X[j]==XX && YY==1 && L[j].equalsIgnoreCase("Y"))
					{
						System.out.println(S[j]);break;
						
					}
					if(X[j]==XX && YY==2 && L[j].equalsIgnoreCase("N"))
					{
						if(L[j+1].equalsIgnoreCase("N")  )
							var=j+1;
						if(L[j+2].equalsIgnoreCase("N") && var != j+1)
							var=j+2;
						
						if(S[j].compareTo(S[var])<0)
							System.out.println(S[j]);
						else
							System.out.println(S[var]);
						break;
							
					}
					if(X[j]==XX && YY==3 && L[j].equalsIgnoreCase("N"))
					{
						if(L[j+1].equalsIgnoreCase("N") )
							var=j+1;
						if(L[j+2].equalsIgnoreCase("N") && var != j+1)
							var=j+2;
						if(S[j].compareTo(S[var])<0)
							System.out.println(S[var]);
						else
							System.out.println(S[j]);
						break;
					}
				
			}
		}
		}
		obj.close();
		}
}