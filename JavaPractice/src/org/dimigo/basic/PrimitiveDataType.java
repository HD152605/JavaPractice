/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |_ PrimitiveDataType
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * 
 * @author          :김민선
 * @version         : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<아이유 프로필>>\n");
		String name = "아이유";
		System.out.println("이름 : "+ name);
		boolean isMale = false;
		if(isMale==false) System.out.println("성별 : 여자");
		else System.out.println("성별 : 남자");
		int age = 25;
		System.out.println("나이 : "+ age);
		double height = 161.8;
		System.out.println("키 : "+ height);
		float weight = 44.3f;
		System.out.println("몸무게 : "+ weight+"kg");
		char bloodType = 'A';
		System.out.printf("혈액형 :  %s형", bloodType);
		
	
        

	}

}
