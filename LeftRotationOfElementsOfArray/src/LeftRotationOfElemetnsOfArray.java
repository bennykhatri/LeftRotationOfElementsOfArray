import java.util.Scanner;


public class LeftRotationOfElemetnsOfArray 
{

	public static void main(String[] args) 
	{
		LeftRotationOfElemetnsOfArray lr = new LeftRotationOfElemetnsOfArray();
		lr.work();
	}
	
	static void work()
	{
		System.out.println("Enter The No. Of Element Of Array");
		Scanner s=new Scanner(System.in);
		int len=s.nextInt();
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++)
		{
			arr[i] += i;
		}
		
		System.out.println("Enter The Number Of Rotations To Perform");
		int r=s.nextInt();
		
		int newindex = 0;
		int[] newarr = new int[len];
		
		for(int i=0;i<len;i++)
		{
			newindex = (i + r) % len;
			newarr[i] = arr[newindex];
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(newarr[i]);
		}
	
	}

}
