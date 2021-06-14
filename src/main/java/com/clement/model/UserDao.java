package com.clement.model;

public interface UserDao {

	 void addUser(User user);
	 User checkUserLogin(User user);
	 User addUserSkill(User user);
	 void viewUser(User user);
	 void UpdateProfile(User user);
}
