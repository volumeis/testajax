package com.model2.mvc.service.domain;

//==>ȸ�������� �𵨸�(�߻�ȭ/ĸ��ȭ)�� Bean
public class Customer {
	
	///Field
	// private String customerNo; //db������ ���̴� �⺻Ű
	private String customerTel; //��ȭ��ȣ
	private String password;	//��й�ȣ
	
	public Customer() {
	}
	
	public String getCustomerTel() {
		return customerTel;
	}
	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Customer [customerTel=" + customerTel + ", password=" + password + "]";
	}
}