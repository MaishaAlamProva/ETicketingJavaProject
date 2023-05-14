package Services;
import DAL.*;
import Model.*;
import java.lang.*;

public class AuthenticationServices
{
	private Registration _registration;
	
	public AuthenticationServices()
	{
		_registration = new Registration();
	}
	
	public boolean Login(String username, String password)
	{
		if(username == "prova" && password == "12345")
		{
			return true;
		}
		
		return false;
	}
	
	public User RegisterUser(User user)
	{
		return user;
	}
}