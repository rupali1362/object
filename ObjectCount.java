class ObjectCount
{
	static int count=0;
	ObjectCount()
	{
		count++;	
	}
	public static void main(String args[])
	{
		ObjectCount c1=new ObjectCount();
		ObjectCount c2=new ObjectCount();
		ObjectCount c3=new ObjectCount();
		ObjectCount c4=new ObjectCount();
		ObjectCount c5=new ObjectCount();
		System.out.println("\n\n Number of Objects Created Are :"+count);
	}
	
}