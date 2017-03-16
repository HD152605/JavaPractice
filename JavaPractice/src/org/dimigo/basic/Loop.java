/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *    |_ Loop
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 * 
 *
 * @author          :김민선
 * @version         : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	     
		boolean a = true;
		Scanner scan =new Scanner(System.in);
		int choice ;
		int attack = 100;
		int b;
		String[] men={"마법사", "영주" , "기사", "농민"};
		do {
		System.out.println("------------------");
		System.out.println("<<게임 메뉴>>");
		System.out.println("1. 공격력 증가\n2. 공격력 감소\n3. 캐릭터 설정\n9. 종료");
		System.out.println("------------------");
		System.out.printf("메뉴 입력=> ");
		choice = scan.nextInt();
		
		switch(choice){
		case 1:
			attack+=10;
			System.out.println("공격력이 증가되었습니다. 현재 공격력 :"+attack);
		break;
		case 2:
			attack-=10;
			System.out.println("공격력이 감소되었습니다. 현재 공격력 :"+attack);
		break;
		case 3:
			b = new Random().nextInt(4);
			System.out.println(men[b]+"(으)로 선택되었습니다.");
			break;
		case 9:
			System.out.println("이제 공부합시다!!");
			break;
		default:
			System.out.println("없는 메뉴입니다.");
			
			}
		}while(choice !=9);
	}

}
