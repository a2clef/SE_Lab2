package libsystem.action;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import libsystem.db.*;

public class searchbook 
{
   private String ISBN;
   private String result;
   public String execute() throws Exception 
   {
	  if (ISBN=="")
	  {
		  return "failed";
	  };
	  result=dbaccess.search_book_isbn(ISBN);
	  ServletRequest servReq=ServletActionContext.getRequest();
	  HttpServletRequest httpSrvReq =(HttpServletRequest) servReq;
	  HttpSession sesssion=httpSrvReq.getSession();
	  sesssion.setAttribute("result", result);
	  return "success";
   } 
   public String getIsbn() 
   {
      return ISBN;
   }
   public void setIsbn(String ISBN) 
   {
      this.ISBN = ISBN;
   }
   public String getResult() 
   {
      return result;
   }
   public void setResult(String result) 
   {
      this.result = result;
   }
}
