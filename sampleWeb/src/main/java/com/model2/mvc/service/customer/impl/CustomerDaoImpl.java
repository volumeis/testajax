package com.model2.mvc.service.customer.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.model2.mvc.service.customer.CustomerDao;
import com.model2.mvc.service.domain.Customer;


//==> ȸ������ DAO CRUD ����
@Repository("customerDaoImpl")
public class CustomerDaoImpl implements CustomerDao{
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public CustomerDaoImpl() {
		System.out.println(this.getClass());
	}

	///Method
//	public void addUser(User user) throws Exception {
//		sqlSession.insert("UserMapper.addUser", user);
//	}

	public Customer getCustomer(String customerTel) throws Exception {
		Customer customer = sqlSession.selectOne("CustomerMapper.getCustomer", customerTel);
		System.out.println(customer);
		return customer;
	}
//	
//	public void updateUser(User user) throws Exception {
//		sqlSession.update("UserMapper.updateUser", user);
//	}
//
//	public List<User> getUserList(Search search) throws Exception {
//		return sqlSession.selectList("UserMapper.getUserList", search);
//	}
//
//	// �Խ��� Page ó���� ���� ��ü Row(totalCount)  return
//	public int getTotalCount(Search search) throws Exception {
//		return sqlSession.selectOne("UserMapper.getTotalCount", search);
//	}
}