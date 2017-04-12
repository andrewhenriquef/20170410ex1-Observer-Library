package observers;

public class User1 implements User {

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
		System.out.println("BookStatus User 1: " + getBookStatus());
	}
}
