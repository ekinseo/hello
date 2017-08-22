package ssw.ekinseo;

public class ThreadTest2 implements Runnable{

	@Override
	public void run() {
		for(int i =0 ; i < 100000 ; i++) {
			System.out.println("Thread B Operation");
		}
		
	}

}
