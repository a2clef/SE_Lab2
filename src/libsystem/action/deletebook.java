package libsystem.action;

import libsystem.db.*;

public class deletebook {
	private String isbn;
	
	public String execute() throws Exception
	{
		dbaccess.delete_book(isbn);
		return "success";
	}
	
	public String getIsbn() 
	{
	    return isbn;
	}
	public void setIsbn(String isbn) 
	{
	     this.isbn = isbn;
	}
}
