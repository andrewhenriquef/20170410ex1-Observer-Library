package application;

import observables.Book1;
import observables.Observable;
import observers.User;
import observers.User1;
import observers.User2;


public class Library {

	public static void main(String[] args) {

		Book1 book1 = new Book1();

		User user1 = new User1();
		User user2 = new User2();

		book1.addUser(user1);
		book1.setStatus("disponivel");
		
		book1.addUser(user2);
		book1.setStatus("indisponivel");
		
		book1.removeUser(user1);
		book1.setStatus("Imprestado");

	}

}
