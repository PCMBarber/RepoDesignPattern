package org.qa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.qa.automotives.Vehicle;

public interface Dao<T extends Vehicle> {
	
	T modelFromResultSet(ResultSet resultSet) throws SQLException;

	List<T> readAll();
	
	T readByID(int id);
	
	T readLatest();

	T create(T t);

	T update(T t);

	int delete(long id);
	
}
