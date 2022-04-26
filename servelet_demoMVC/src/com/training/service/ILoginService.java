package com.training.service;

import java.sql.SQLException;

public interface ILoginService {

	boolean validateUser(String uname, String pword) throws ClassNotFoundException, SQLException;
}
