package com.NguyenToan.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.NguyenToan.model.User;
import com.NguyenToan.service.UserDao;
import com.NguyenToan.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserDao service;
@RequestMapping("/home")
public String test()
{
	User user=new User(2, "NguyenToan1", "123@123");
	service.insert(user);
	return "test";
	}
}
