// Illustrate use of start() method 
package basic;

public class ThreadClass1 implements Runnable {
public void run()
{
	for( int i=1;i<=3;i++)
	{
		try {
		      Thread.sleep(1000);
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	System.out.println(i);
}
}
public static void main(String []args)
{
	Thread t = new Thread(new ThreadClass1(),"t");
	Thread t1 = new Thread(new ThreadClass1(),"t1");
	t.start();
	t1.start();
	
}
}
