import java.util.*;
class Sortb
{
	public static void main(String[] args) 
	{
		int []a=new int[5];
		int i,j,temp;
		System.out.println("\n\n Enter Any 5 Elements of Array :");
		Scanner scan =new Scanner(System.in);
		for (i=0;i<5 ;i++ ) 
		{
			a[i]=scan.nextInt();
		}
		for (i=0;i<4 ;i++ ) 
		{
			for (j=0;j<4 ;j++ ) 
			{
				if (a[j]>a[j+1]) 
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
		}
		System.out.println("\n\n Array Elements After Sorting:");
		for (i=0;i<5 ;i++ ) 
		{
			System.out.println(" "+a[i]);
		}

	}
}