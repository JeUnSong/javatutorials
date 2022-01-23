package org.opentutorials.javatutorials.method;

public class MethodDemo2 {
	public static void numbering(int limit) {//매개변수parameter
		int i = 0;
		while(i<limit) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		numbering(100);//인자argument

	}

}
