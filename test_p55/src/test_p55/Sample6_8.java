package test_p55;

public class Sample6_8 
{
	public static void main(String[]args)
	{
		Company cmp=new Company();

		Driver drv1=new Driver(cmp);
		drv1.start();

		Driver drv2=new Driver(cmp);
		drv2.start();
	}
}