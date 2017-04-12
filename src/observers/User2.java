package observers;

public class User2 implements User {

	private String bookStatus;
	
	public void update(String status){
		setBookStatus(status);
		showData();
	}
	
	public String getBookStatus(){
		return bookStatus;
	}
	
	public void setBookStatus(String status){
		this.bookStatus = status;
	}
	
	public void showData(){
		System.out.println("BookStatus User 2: " + getBookStatus());
	}
}

