package test_p47;
public class Sample6_4 
{
	public static void main(String[]args)
	{
		Car car1=new Car("1号车");
		car1.start();

		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("正在进行main()的处理工作");
			}
			catch(InterruptedException e)
			{
			}
		}	
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
