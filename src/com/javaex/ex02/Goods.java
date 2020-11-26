package com.javaex.ex02;

public class Goods {

	private String name;
	private int price;

	public Goods() {}	//삭제된 기본생성자를 추가
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	//private void setName(String name) { //private수정
	public void setName(String name) {  
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}
	
}








