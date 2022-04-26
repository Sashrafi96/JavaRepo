package com.training.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.dao.LoginDao;
import com.training.model.user1;

public class LoginService implements ILoginService{

	@Override
	public boolean validateUser(String uName,String password) throws ClassNotFoundException, SQLException {
		
		List<user1> listUsers = new ArrayList<>();
		boolean found = false;
		
		LoginDao ld = new LoginDao();
		listUsers = ld.getUsers();
		
		for(user1 us:listUsers){
			if(uName.equalsIgnoreCase(us.getUserName()) && password.equals(us.getPassword())) {
				found = true;
				break;
			}
		}
		return found;
		
	}
}
