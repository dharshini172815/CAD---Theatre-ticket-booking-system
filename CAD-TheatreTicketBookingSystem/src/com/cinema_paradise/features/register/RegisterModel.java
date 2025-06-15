package com.cinema_paradise.features.register;

import com.cinema_paradise.repository.db.CinemaParadiseDb;
import com.cinema_paradise.repository.dto.Admin;
import com.cinema_paradise.repository.dto.User;

public class RegisterModel {
	private final RegisterView view;
	private static final CinemaParadiseDb db = CinemaParadiseDb.getInstance();

    public RegisterModel(RegisterView view) {
        this.view = view;
    }
    
    void init() {
    	
    }
    public boolean isAdminAlreadyRegistered() {
    	return !db.getAdmins().isEmpty();
    }
    
    public boolean isUserAlreadyRegistered(String email) {
    	return db.getUsers().stream()
    			.anyMatch(user -> user.getEmail().equalsIgnoreCase(email));
    }
    
    public void registerAdmin(Admin admin) {
    	db.getAdmins().add(admin);
    }
    
    public void registerUser(User user) {
    	db.getUsers().add(user);
    }
}
