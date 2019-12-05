package test_p48;

public class Sample6_5 
{
	public static void main(String[]args)
	{
		Car car1=new Car("1号车");
		car1.start();

		try
		{
			car1.join();
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("结束main()的处理工作:");
	}
}
class Car extends Thread
{
	private String name;

	public Car(String nm)
	{
		name=nm;
	}

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("正在进行"+name+"的处理工作");
		}
	}
}
