/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |_ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 * 
 *  
 * @author          :김민선
 * @version         : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	    int salary = 1700000;
	    int men = 3;
	    int store = 1500;
	    
		System.out.println("<<디미벤 연간 인건비>>\n");
		System.out.println("월 평균 급여 : " + String.format("%,d", salary)+"원");
		System.out.println("연간 인건비 : "+men+"명");
		System.out.println("연간 인건비 : "+store+"개");
		System.out.println("연간 인건비 : "+String.format("%,d",(long)salary*12*men*store)+"원");

	}

}
