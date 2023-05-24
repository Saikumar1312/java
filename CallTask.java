package MyTask;

public class CallTask implements Task,Task1 {
	
	public void task() {
		System.out.println("Entered Into Task Interface Method" + t);
	}
	
	public void task1() {
		
		System.out.println("Entered Into Task1 Interface Method" + T);
	}
}
