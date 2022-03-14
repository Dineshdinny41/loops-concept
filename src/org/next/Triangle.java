package org.next;

public class Triangle {
	public static void main(String[] args) {
		int odd=1;
		int spaces=3;
		for(int i =1;i<=4;i++)
		{ 
			int k=0;
			for(int j=1; j<=spaces;j++)
			{
				System.out.print(" ");
			
			}
			for(int j=1; j<=odd;j++)
	 	{
				if(j<=i)
				{
					k=k+1;
				}
				else 
				{
					k=k-1;
				}
				System.out.print(k);
			}
			System.out.println();
			odd = odd+2;
			spaces = spaces-1;
			
			
			
		}
		

}
}
