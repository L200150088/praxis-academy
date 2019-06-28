
public class MyThread {
	 public MyThread(String name) {
	        super();
	    }
	 
	    public void run() {
	        System.out.println("Executing thread "+Thread.currentThread().getName());
	    }
	     
	    public static void main(String[] args) throws InterruptedException {
	        MyThread myThread = new MyThread("myThread");
	        myThread.start();
	    }

		private void start() {
			// TODO Auto-generated method stub
			
		}
	}

