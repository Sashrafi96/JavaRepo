package com.training.dao;

import java.sql.SQLException;
import java.util.List;

import com.training.model.user1;

public interface ILoginDao {

	public List<user1> getUsers() throws ClassNotFoundException, SQLException;
}
