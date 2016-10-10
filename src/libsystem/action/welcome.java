package libsystem.action;

import com.opensymphony.xwork2.ActionSupport;

public class welcome extends ActionSupport {
	
	@Override
	public String execute() {
		return "success";
	}
}
