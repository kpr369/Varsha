package Test.Varsha;

public class ArrayMaxMin {

	
	public static void main(String[] args) {
		
int a[] = {75,32,15,24,100};
		
		int max=a[0],min=0;

		for(int b: a)
		{
			if(b<max)
			{
				max =b;	
			}
		}
		
		System.out.println(max);
}

}