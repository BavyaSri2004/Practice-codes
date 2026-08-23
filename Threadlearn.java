package package1;
class CookingThread extends Thread{
	private String task;
	public CookingThread(String task) {
		this.task=task;
	}
	public void run() {
		System.out.println(task+" Currently Thread "+Thread.currentThread().getName());
	}
}
public class Threadlearn {
	public static void main() {
		CookingThread t1=new CookingThread("Pasta");
		CookingThread t2=new CookingThread("burger");
		CookingThread t3=new CookingThread("laddoo");
		t1.start();
		t2.start();
		t3.start();
	}
}