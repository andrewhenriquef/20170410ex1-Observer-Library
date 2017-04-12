package observables;

import observers.User;

public interface Observable {

	public abstract void addUser(User user);
	public abstract void removeUser(User user);
	public abstract void notifyUsers();
	
}
