package libsystem.action;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import libsystem.db.*;

public class searchauthor
{
   private String name;
   public String result;
   public String execute() throws Exception 
   {
	  result=dbaccess.search_author_name(name); 
	  
	  ServletRequest request=ServletActionContext.getRequest();
	  HttpServletRequest req =(HttpServletRequest) request;
	  HttpSession sesssion=req.getSession();
	  sesssion.setAttribute("result", result);
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
   public String getResult() 
   {
      return result;
   }
}
