/**
 * 
 */
package org.dimigo.oop;

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
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;

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
	
	public Car3(String company, String model, String color, int maxSpeed, int price) {  
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	public Car3(String company, String model, String color, int maxSpeed) {  
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	public Car3(String company, String model, String color) {  
		this.company = company;
		this.model = model;
		this.color = color;
	}
	/*
	 * public void setCompany(String newCompany) {
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
	} */
	

}
