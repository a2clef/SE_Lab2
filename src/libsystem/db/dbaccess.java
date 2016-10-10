package libsystem.db;

import java.sql.*;


public class dbaccess 
{
	static String driver = "com.mysql.jdbc.Driver";
	//static String url = "jdbc:mysql://localhost:3306/lab2test?characterEncoding=utf-8";
	static String url = "jdbc:mysql://syxyllvrirtd.rds.sae.sina.com.cn:10625/bookdb?characterEncoding=utf-8";
	static String user = "root";
	static String password = "530743812";

	
	public static void insert_book(String ISBN ,String Title, String AuthorID ,String Publisher,String PublishDate, String Price) throws Exception
	{		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement statement = conn.createStatement();
		
		String sqlComm = "insert into Book value(";
		sqlComm=sqlComm.concat(ISBN);
		sqlComm=sqlComm.concat(",\"");
		sqlComm=sqlComm.concat(Title);
		sqlComm=sqlComm.concat("\",\"");
		sqlComm=sqlComm.concat(AuthorID);
		sqlComm=sqlComm.concat("\",\"");
		sqlComm=sqlComm.concat(Publisher);
		sqlComm=sqlComm.concat("\",\"");
		sqlComm=sqlComm.concat(PublishDate);
		sqlComm=sqlComm.concat("\",\"");
		sqlComm=sqlComm.concat(Price);
		sqlComm=sqlComm.concat("\")");
		System.out.println(sqlComm);
		
		statement.executeUpdate(sqlComm);  
		conn.close();  
	}
	
	public static String search_author_id(String author) throws Exception
	{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement statement = conn.createStatement();
		
		
		String sql = "select * from Book where AuthorID = "+author;

		ResultSet rs = statement.executeQuery(sql);  
		String to_return="";
		while(rs.next()) 
		{
			to_return=to_return.concat(rs.getString("ISBN"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("Title"));
			to_return=to_return.concat("~");
		} 
		rs.close();
		conn.close();  
		return to_return;
	}

	public static void delete_book(String ISBN) throws Exception
	{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement statement = conn.createStatement();
			
		
		String sql = "delete from Book where ISBN =\""+ISBN+"\";";

		statement.executeUpdate(sql);  
		conn.close();  
	}

	public static String search_book_isbn(String isbn) throws Exception
	{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement statement = conn.createStatement();
			
		String sql = "select * from Book where ISBN = "+isbn;
		ResultSet rs = statement.executeQuery(sql);  
		String to_return="";

		while(rs.next())
		{
			to_return=to_return.concat(rs.getString("ISBN"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("Title"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("AuthorID"));			
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("Publisher"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("PublishDate"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("Price"));
		}		
		rs.close();
		conn.close();  
		return to_return;	
	}

	public static String search_author_name(String author_name) throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		Statement statement = conn.createStatement();
				
		String sql = "select * from Book where AuthorID=(select AuthorID from Author where Name=\""+author_name+"\");";
		ResultSet rs = statement.executeQuery(sql);  
		String to_return="";
		while(rs.next()) 
		{
			to_return=to_return.concat(rs.getString("ISBN"));
			to_return=to_return.concat("~");
			to_return=to_return.concat(rs.getString("Title"));
			to_return=to_return.concat("~");
		} 
		rs.close();
		conn.close();  
		return to_return;
	}

	public static void insert_author(String authorID ,String Name, String Age ,String Country) throws Exception
	{		
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);

		Statement statement = conn.createStatement();
			
		
		String sql = "insert into Author value(";
		sql=sql.concat(authorID);
		sql=sql.concat(",\"");
		sql=sql.concat(Name);
		sql=sql.concat("\",");
		sql=sql.concat(Age);
		sql=sql.concat(",\"");
		sql=sql.concat(Country);
		sql=sql.concat("\")");
		
		statement.executeUpdate(sql);  
		conn.close();  
	}
	
	public static boolean if_author_exist(String authorID) throws Exception
	{
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Statement statement = conn.createStatement();
		
		String sql = "select * from Author where AuthorID = "+authorID;
		
		ResultSet rs = statement.executeQuery(sql);  
		boolean to_return=false;
		while(rs.next()) 
		{
			to_return=true;
		} 
		rs.close();
		conn.close();  
		return to_return;
	}
}