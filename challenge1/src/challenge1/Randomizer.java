package challenge1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Randomizer implements messageListener{
	
	public Queue numberGenerator() {
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i =0;i<10;i++) {
			Random r = new Random();
			int number = r.nextInt()& Integer.MAX_VALUE;
			queue.add(number);
			Messgesent(q);//not implemented
		}
		return queue;		
	}
	
	onMessage(Message m){
		List<Number> numbers = m.get();  //not implemented
		for(Number n : numbers) {
			if(n.isPrime==true) {
				System.out.println(n+"is prime");
			}				
			else {
				System.out.println(n+"is not prime");
			}
		}
		
		
	}
	
}
