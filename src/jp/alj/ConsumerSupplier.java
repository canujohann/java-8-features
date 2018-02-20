package jp.alj;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSupplier {

	public static void main(String[] args) {
		
		List<Integer> integerList=Arrays.asList(new Integer(1), 
                new Integer(10), new Integer(200));
		
		// In using Default Consumer interface, you don't need to create a functional interface for using lambda 
		Consumer<Integer> consumer= i-> System.out.println(" "+i);
		
		for(Integer integer:integerList){
		    consumer.accept(integer);
		}
		
		// An other way to do it is using the double colon
		Consumer<Integer> consumer2= ConsumerSupplier::printNames;
		
		for(Integer integer:integerList){
			consumer2.accept(integer);
		}
		
	}

	private static void printNames(Integer val) {
			System.out.println(val);
	}

}