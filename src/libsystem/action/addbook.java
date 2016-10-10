package libsystem.action;

import libsystem.db.*;

public class addbook 
{
	private	String	isbn	;
	private	String	title	;
	private	String	author_id	;
	private	String	publisher	;
	private	String	publish_date	;
	private	String	price	;

	public String execute() throws Exception
	{
		if (author_id.isEmpty()) return "error";
		if (isbn.isEmpty()) return "error";
		if (title.isEmpty()) return "error";
		if (publisher.isEmpty()) return "error";
		if (publish_date.isEmpty()) return "error";
		if (price.isEmpty()) return "error";
		if(dbaccess.if_author_exist(author_id))
		{
			if (!dbaccess.search_book_isbn(isbn).isEmpty())
				return "error";
			dbaccess.insert_book(isbn ,title,author_id ,publisher,publish_date,price);	
			return "success";			
		}
		return "failed";
	}
	
	public String getIsbn() 
	{
	    return isbn;
	}
	public void setIsbn(String isbn) 
	{
	     this.isbn = isbn;
	}
	public String getTitle() 
	{
	    return title;
	}
	public void setTitle(String title) 
	{
	     this.title = title;
	}
	public String getAuthor_id() 
	{
	    return author_id;
	}
	public void setAuthor_id(String author_id) 
	{
	     this.author_id = author_id;
	}
	public String getPublisher() 
	{
	    return publisher;
	}
	public void setPublisher(String publisher) 
	{
	     this.publisher =publisher;
	}
	public String getPublish_date() 
	{
	    return publish_date;
	}
	public void setPublish_date(String publish_date) 
	{
	     this.publish_date =publish_date;
	}
	public String getPrice() 
	{
	    return price;
	}
	public void setPrice(String price) 
	{
	     this.price = price;
	}
}
