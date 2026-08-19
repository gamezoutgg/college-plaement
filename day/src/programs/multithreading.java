

	package programs;

	public class multithreading extends Thread {

	    public void run() {
	        System.out.println("Child Thread is running");
	    }

	    public static void main(String[] args) {

	        multithreading t = new multithreading();

	        t.start();

	        System.out.println("Main Thread is running");
	    }
	}
