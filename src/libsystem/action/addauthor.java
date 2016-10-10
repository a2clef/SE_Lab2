package libsystem.action;

import libsystem.db.*;

public class addauthor 
{
	private	String	name	;
	private	String	age	;
	private	String	author_id	;
	private	String	country	;

	public String execute() throws Exception
	{
		if (name.isEmpty()) return "error";
		if (age.isEmpty()) return "error";
		if (author_id.isEmpty()) return "error";
		if (country.isEmpty()) return "error";
		if(dbaccess.if_author_exist(author_id))
		{
			return "error";	
		}
		dbaccess.insert_author(author_id,name ,age ,country);	
		return "success";
	}
	
	public String getName() 
	{
	    return name;
	}
	public void setName(String name) 
	{
	     this.name = name;
	}
	public String getAge() 
	{
	    return age;
	}
	public void setAge(String age) 
	{
	     this.age = age;
	}
	public String getAuthor_id() 
	{
	    return author_id;
	}
	public void setAuthor_id(String author_id) 
	{
	     this.author_id = author_id;
	}
	public String getCountry() 
	{
	    return country;
	}
	public void setCountry(String country) 
	{
	     this.country =country;
	}
}
