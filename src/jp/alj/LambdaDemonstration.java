package jp.alj;

import jp.alj.common.MyRunnnableImpl;

public class LambdaDemonstration {

	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////
		// Instance a runnable object in old school way
		//////////////////////////////////////////////////////
		Runnable myRunnableInstance1 = new MyRunnnableImpl();
		myRunnableInstance1.run();
		
		//////////////////////////////////////////////////////
		// Do it with an anonymous function 
		//////////////////////////////////////////////////////
		Runnable myRunnableInstance2 = new Runnable(){
		  @Override
		  public void run(){
		    System.out.println("Hello world from my anonymous function  !");
		  }
		};
		myRunnableInstance2.run();
		
		//////////////////////////////////////////////////////
		// With lambda (available from JDK >= 1.8)
		// Only works  with functional interface (with 1 method)
		//////////////////////////////////////////////////////
		Runnable myRunnableInstance3 = () -> System.out.println("Hello world two!");
		myRunnableInstance3.run();
		
	}
	

}
