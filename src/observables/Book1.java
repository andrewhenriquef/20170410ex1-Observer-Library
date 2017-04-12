package observables;

import java.util.ArrayList;

import observers.User;

public class Book1 implements Observable{

	private String status;
	private ArrayList<User> users = new ArrayList<User>();
	
	public void addUser(User user) {
		users.add(user);
	}

	public void removeUser(User user) {
		int count = users.indexOf(user);
		
		if(count >= 0){
			users.remove(count);
		}
	}

	public void notifyUsers(){
		for(int count = 0; count < users.size(); count++){
			User user = (User)users.get(count);
			user.update(getStatus());
		}
		
	}
	
	public void setStatus(String status){
		this.status = status;
		notifyUsers();
	}
	
	public String getStatus(){
		return status;
	}
	
}
