package om.multithreading.synchronization;

public class Counter {
	
	int counter = 0;
	
	synchronized void increment() {
		counter++;
	}
	
	int getCount() {
		return counter;
	}
}
