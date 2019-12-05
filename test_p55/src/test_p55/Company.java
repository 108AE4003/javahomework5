package test_p55;

public class Company
{
	private int sum=0;
	public synchronized void add(int a)
	{
		int tmp =sum;
		System.out.println("目前的合计金额是"+tmp+"元");
		System.out.println("赚到"+a+"元了。");
		tmp=tmp+a;
		System.out.println("合计金额是"+tmp+"元");
		sum=tmp;
	}
}
class Driver extends Thread
{
	private Company comp;
	public Driver(Company c)
	{
		comp=c;
	}
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			comp.add(50);
		}
	}
}
