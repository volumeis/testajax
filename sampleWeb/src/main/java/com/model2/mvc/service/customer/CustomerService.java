package com.model2.mvc.service.customer;

import com.model2.mvc.service.domain.Customer;


//==> ȸ���������� ������ ���� �߻�ȭ/ĸ��ȭ�� Service  Interface Definition  
public interface CustomerService {
	
//	// ȸ������
//	public void addUser(User user) throws Exception;
	
	// ������Ȯ�� / �α���
	public Customer getCustomer(String customerTel) throws Exception;
	
//	// ȸ����������Ʈ 
//	public Map<String , Object> getUserList(Search search) throws Exception;
//	
//	// ȸ����������
//	public void updateUser(User user) throws Exception;
//	
//	// ȸ�� ID �ߺ� Ȯ��
//	public boolean checkDuplication(String userId) throws Exception;
	
}