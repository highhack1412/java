package com.test.ch06;

public class Car {
	private String company = "현대자동차";
	private String model = "그랜저";
	private String color = "검정";
	private int maxSpeed = 350;
	private int speed;
	private int price;
	private String[] dueDate;
	private String realDate;
	static int count = 0;
	

	public String[] getDueDate() {
		return dueDate;
	}

	public void setDuedate(String[] dueDate) {
		
		//옛날 방식, 외부 순환
		for(int i = 0; i < dueDate.length; i++) {
			String value = dueDate[i];
		}
		
		switch(count) {
			case 1:
				this.realDate = dueDate[0];
				break;
			case 2:
				this.realDate = dueDate[1];
				break;
			case 3:
				this.realDate = dueDate[2];
				break;
			case 4:
				this.realDate = dueDate[3];
				break;
			case 5:
				this.realDate = dueDate[4];
				break;
		}
		
		//최근 방식, 내부 순환
		for(String value : dueDate) {
			// 10명이 요청
			//dueDate 늦어
			// 1명 : 제일 빠른 날짜
		}
		this.dueDate = dueDate;
	}

	public Car() {
		count ++;
	}
	
	public Car(String company) {
		this.company = company;
		count ++;
	}
	
	public Car(String company, String model) {
		this.company = company;
		this.model = model;
		count ++;
	}
	
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
		count ++;
	}
	
	public Car(String company, String model, String color, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.price = price;
		count ++;
	}
	
	
	public String toString() {
		String returnVal = "";
		returnVal += "company : " + this.company + "\n"
					+ "model : " + this.model  + "\n"
					+ "color: " + this.color + "\n"
					+ "maxSpeed : " + this.maxSpeed + "\n"
					+ "speed : " + this.speed + "\n"
					+ "price : " + this.price + "\n"
					+ "count : " + this.count;
		return returnVal;
	}
	
	public String getCompany() {
		return this.company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		
		//speed에 따라서 가격 책정
		decisionPriceCase(maxSpeed);

		this.maxSpeed = maxSpeed;
	}
	
	private void decisionPrice(int maxSpeed) {
		if(maxSpeed < 150) {
			this.price = 1000;
		}else if(maxSpeed < 200) {
			this.price = 2000;
		}else if(maxSpeed < 250) {
			this.price = 3000;
		}else {
			this.price = 0;
		}
	}
	
	private void decisionPriceCase(int maxSpeed) {
		switch(maxSpeed){
			case 100:
				this.price = 500;
				break;
			case 150:
				this.price = 1000;
				break;
			case 200:
				this.price = 1500;
				break;
			case 250:
				this.price = 2000;
				break;
			case 300:
				this.price = 2500;
				break;
			default:
				this.price = 0;
				break;
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}