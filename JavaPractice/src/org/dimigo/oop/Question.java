package org.dimigo.oop;
import java.util.Scanner;

/**
 * 
 */

/**
 * <pre>
 * 
 *    |_ Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 * 
 *
 * @author          :김민선
 * @version         : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] questions = {"1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?", "3. 가장 좋아하는 과목은?"};
		String[] answers = {"하이라이트","공유","수학"};
		 
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println(questions[i]);
			String sc=scanner.nextLine();
			if(answers[i].equals(sc)) {
				System.out.println("정답입니다!");
			}
			else{
				System.out.println("틀렸습니다!");
			}
		}
	}

}
