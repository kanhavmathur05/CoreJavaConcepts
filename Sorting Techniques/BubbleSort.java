import java.util.Scanner;
class BubbleSort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int sizeOfArray,i,j,temp;
		System.out.println("Enter the size of array:");
		sizeOfArray=sc.nextInt();
		int arr[]=new int[sizeOfArray];
		System.out.println("Enter the elements in array:");
		for(i=0;i<sizeOfArray;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<sizeOfArray;i++)
		{
			for(j=0;j<sizeOfArray-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(i=0;i<sizeOfArray;i++)
		{
			System.out.println(arr[i]);
		}
	}
}