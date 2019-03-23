package Test.Varsha;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestNG {

	public static WebDriver driver;
	public static WebDriver driver1;

	@Test
	public void kk() {
		
		System.out.println("Enter Array Size");
		
		Scanner sc = new Scanner(System.in);
		
		int size =sc.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]= sc.nextInt();
		}
		 
		int c =0;
		int e = a.length-1;
		int temp =0;
		System.out.println(a.length/2);
		
		for(int l=a.length-1;l>=0;l--)
		{
			System.out.print(a[l]);
		}
		for(int j=0;j<a.length/2;j++)
		{
			
			temp =a[e];
			a[e]=a[c];
			a[c]=temp;
			
			c++;
			e--;
		}
		
		for(int k:a)
		{
			System.out.println(k);
		}
		
	}
	
	void testconflitcs()
	{
		
	}
	
	@Test
	
	void buildtest()
	{
		
	}
}