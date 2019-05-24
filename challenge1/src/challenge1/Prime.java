package challenge1;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Prime implements messageListener{
	
	class Number{
		int i;
		boolean isPrime;
		Number(int i,boolean isPrime){
			this.i = i;
			this.isPrime=isPrime;
			
		}
	}
	
	onMessage(Message m){
		List<Integer> numbers = m.get();  //not implemented
		Queue<Number> q = new LinkedList<>();
		for(Integer i: numbers) {
			boolean isPrime = PrimeValidate(i);
			Number n = new Number(i,isPrime);
			q.add(n);
			Messgesent(q); //not implemented
		}
		
	}
	
	private boolean PrimeValidate(Integer n) {
		 for(int i=2;2*i<n;i++) {
		        if(n%i==0)
		            return false;
		    }
		    return true;
	}

}
