/**
 * 
 */
package org.dimgo.oop;

/**
 * <pre>
 * org.dimgo.oop
 *    |_ Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 *
 * @author          :김민선
 * @version         : 1.0
 */
public class Car {
	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price = 50000000;

	//private으로 필드를 선언한 경우 외부의 클래스에서 값을 가져오려면?
	//클래스 메소드 선언
	//getter 메소드
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getPrice() {
		return price;
	}

	//setter(바꾸는 거임) 메소드 선언
	public void setCompany(String newCompany) {
		company = newCompany;
		
	}
	public void setModel(String newModel) {
		model = newModel;
		
	}
	public void setColor(String newColor) {
		color = newColor;
		
	}
	public void setMaxSpeed(int newMaxSpeed) {
		if(newMaxSpeed >= 1) {
    	 maxSpeed = newMaxSpeed;
		}	
	} 
	public void setPrice(int newPrice) {
		if(newPrice >= 1) {
    	 price = newPrice;
		}	
	} 
	

}
