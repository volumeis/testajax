package com.model2.mvc.service.customer;

import com.model2.mvc.service.domain.Customer;


//==> CustomerDao�������� CRUD �߻�ȭ/ĸ��ȭ�� DAO Interface Definition
public interface CustomerDao {
	
//	// INSERT
//	public void addUser(User user) throws Exception ;

	// SELECT ONE
	public Customer getCustomer(String customerTel) throws Exception ;

//	// SELECT LIST
//	public List<User> getUserList(Search search) throws Exception ;
//
//	// UPDATE
//	public void updateUser(User user) throws Exception ;
//	
//	// �Խ��� Page ó���� ���� ��üRow(totalCount)  return
//	public int getTotalCount(Search search) throws Exception ;
	
}