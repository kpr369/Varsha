package Test.Varsha;

public class ArrayMax {

	public static void main(String[] args) {
		
		
		int a[] = {25,32,15,24,12};
		
		int max=0,max1=0;

		for(int b: a)
		{
			
			if(max<b)
			{
				max1=max;
				max=b;
			}else if(max1<b)
			{
				max1=b;
			}
		}
		
		System.out.println(max+":"+max1);
	}
}
