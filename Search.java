import java.util.*;
class Search
{
	public static void main(String args[])
	{
		int []a=new int[5];
		int search,i,flag=0;
		System.out.print("\n\n Enter Any 5 Elements of Array :");
		Scanner scan=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			a[i]=scan.nextInt();	
		}
		System.out.println("\n\n Enter the Element to be Searched :");
		search=scan.nextInt();
		for(i=0;i<5;i++)
		{
			if(a[i]==search)
			{
				flag=1;	
				break;
			}
			
		}
		if(flag==1)
			System.out.println("\n\n Element Found ");
		else
			System.out.println("\n\n Element Not Found ");
	
	}
}