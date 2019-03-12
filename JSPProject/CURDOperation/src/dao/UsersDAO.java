package dao;

import java.util.List;

import model.Users;

public interface UsersDAO {
	
	public void addUsers(Users user);
	public void updateUsers(Users user);
	public void deleteUsers(Integer S_No);
	public List<Users> getAllUsers();
	public Users getUsersByID(Integer S_No);
}
