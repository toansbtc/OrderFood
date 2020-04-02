package com.NguyenToan.service;

import org.hibernate.tool.hbm2ddl.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.OptimisticLocking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.NguyenToan.model.User;


@Service
@EnableTransactionManagement
@Transactional
public class UserService implements UserDao{
	@Autowired
	public SessionFactory factory;
	
	public void insert(User user) {
		// TODO Auto-generated method stub
		factory.getCurrentSession().saveOrUpdate(user);
		
	}

	public void config() {
		// TODO Auto-generated method stub
		factory.getCurrentSession().beginTransaction();
		factory.
	}
}
