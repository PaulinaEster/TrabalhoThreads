package paulina.so.services;

public class HelloWord extends Thread {
	
	private String texto;
	private String name;
	public HelloWord(String texto, String threadName) {
		this.texto = texto;
		this.name = threadName;
	}
	public void run() {
		System.out.println(this.name + " iniciada. ");
		for(int i = 0; i < 100; i++) {
			System.out.println(this.texto + " executando " + (i+1) + " vezes ("+this.name+")");
		}
	}
	
	public static void main(String args[]) throws InterruptedException {
		HelloWord thread1 = new HelloWord("abacate", "Thread 1");
		thread1.start(); 
		(new HelloWord("laranja", "Thread 2")).start();
		(new HelloWord("=== THREAD 3 ========", "Thread 3")).start();
		(new HelloWord("====== THREAD 4 =====", "Thread 4")).start();
		(new HelloWord("========= THREAD 5 ==", "Thread 5")).start(); 
		
	}
}