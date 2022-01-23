 package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        System.out.println(i); // 7 출력
// ++i 는 ; 전에 계산
// i++ 는 ; 후에 계산
	}

}
