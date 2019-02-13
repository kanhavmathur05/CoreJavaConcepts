import java.util.Scanner;
class selectionSort
{
	public static void main(String args[])
	{
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		int sizeOfArray;
		System.out.println("Enter the size of array:");
		sizeOfArray=sc.nextInt();
		int arr[]=new int[sizeOfArray];
		System.out.println("Enter the elements in array:");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		//Algorithm for selection Sort
		
		for(i=0;i<arr.length-1;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		System.out.println("After sorting:");
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}