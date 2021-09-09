package org.qa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.qa.automotives.Car;
import org.qa.utils.DBUtils;

public class CarDAO implements Dao<Car> {
	
	private DBUtils db = DBUtils.getInstance();

	public Car modelFromResultSet(ResultSet resultSet) throws SQLException {
		int ID = resultSet.getInt("ID");
		String maker = resultSet.getString("maker");
		String colour = resultSet.getString("colour");
		int wheels = resultSet.getInt("wheels");
		int doors = resultSet.getInt("doors");
		return new Car(ID, maker, colour, wheels, doors);
	}

	public List<Car> readAll() {
		try(Statement stmt = db.getStatement();
				ResultSet result = stmt.executeQuery("Select * from car");) {
			List<Car> compiled = new ArrayList<Car>();
			while(result.next()) {
				compiled.add(modelFromResultSet(result));
			}
			return compiled;
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Car readByID(int id) {
		try(Statement stmt = db.getStatement();
				ResultSet result = stmt.executeQuery("Select * from car where id = "+id);) {
			
			result.next();
			
			return modelFromResultSet(result);	
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Car readLatest() {
		try(Statement stmt = db.getStatement();
				ResultSet result = stmt.executeQuery("SELECT * FROM car ORDER BY ID DESC LIMIT 1");) {
			result.next();
			return modelFromResultSet(result);	
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Car create(Car t) {
		try(Statement stmt = db.getStatement();) {
			stmt.executeUpdate("insert into car values(0, '"+t.getMaker()+"','"
					+t.getColour()+"',"
					+t.getWheels()+","
					+t.getDoors()+")");
			return readLatest();	
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Car update(Car t) {
		// TODO Auto-generated method stub
		return null;
	}

	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
