package Test.Varsha;

public class ArrayPractices {

	
	public static void main(String[] args) {
		
		
		int a[] = {25,32,15,24,12};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
						{
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
			}
		}
		
		for(int c:a)
		{
			System.out.println(c);
		}
	}
}
