package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbConnection.DatabaseConnection;
import model.Users;

public class UsersDAOImplementation implements UsersDAO {

	private Connection con;

	public UsersDAOImplementation() {
		try {
			con = DatabaseConnection.getConnection();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void addUsers(Users user) {

		try {
				System.out.println("addUsers method execute");
			PreparedStatement ps = con.prepareStatement(
					"insert into Users(First_Name ,Last_Name ,Email ,Password ,Gender ,Country ,State ,City) values(?,?,?,?,?,?,?,?)");
			ps.setString(1, user.getFirst_Name());
			ps.setString(2, user.getLast_Name());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getGender());
			ps.setString(6, user.getCountry());
			ps.setString(7, user.getState());
			ps.setString(8, user.getCity());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateUsers(Users user) {

		try {
			System.out.println("updateUsers method execute");
			PreparedStatement ps = con.prepareStatement(
					"update Users set First_Name=?, Last_Name=?, Email=?, Password=?, Gender=?, Country=?, State=? ,City=? where S_No=?");
			ps.setString(1, user.getFirst_Name());
			ps.setString(2, user.getLast_Name());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getGender());
			ps.setString(6, user.getCountry());
			ps.setString(7, user.getState());
			ps.setString(8, user.getCity());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void deleteUsers(Integer S_No) {

		try {
			PreparedStatement ps = con.prepareStatement("delete from Users where S_No=? ");
			ps.setInt(1, S_No);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public List<Users> getAllUsers() {

		List<Users> users = new ArrayList<Users>();
		try {
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student");
			while (resultSet.next()) {
				Users user1 = new Users();
				user1.setS_No(resultSet.getInt("S_No"));
				user1.setFirst_Name(resultSet.getString("fname"));
				user1.setLast_Name(resultSet.getString("lame"));

				user1.setEmail(resultSet.getString("email"));
				user1.setPassword(resultSet.getString("password"));
				user1.setGender(resultSet.getString("gen"));
				user1.setCountry(resultSet.getString("country"));
				user1.setState(resultSet.getString("state"));
				user1.setCity(resultSet.getString("city"));
				users.add(user1);
			}
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public Users getUsersByID(Integer S_No) {
		Users users = new Users();
		try {
			PreparedStatement ps = con.prepareStatement("select * from Users where S_No=?");
			ps.setInt(1, S_No);
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				Users user1 = new Users();
				user1.setS_No(resultSet.getInt("S_No"));
				user1.setLast_Name(resultSet.getString("lame"));

				user1.setEmail(resultSet.getString("email"));
				user1.setPassword(resultSet.getString("password"));
				user1.setGender(resultSet.getString("gen"));
				user1.setCountry(resultSet.getString("country"));
				user1.setState(resultSet.getString("state"));
				user1.setCity(resultSet.getString("city"));

			}
			resultSet.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

}
