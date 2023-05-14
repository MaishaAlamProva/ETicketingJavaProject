package Services;
import DAL.*;
import Model.*;
import java.lang.*;

public class AuthenticationServices
{
	private Registration _registration;
	
	public AuthenticationServices()
	{
		System.out.println("Service Layer Call");
		_registration = new Registration();
	}
	
	public boolean Login(String username, String password)
	{
		System.out.println("Login Call");
		User user = _registration.GetUserByEmployeeID(username);
		
		System.out.println(user.FirstName);
		
		if(user == null)
		{
			return false;
		}
		else if(user.EmployeeID.matches(username) && user.Password.matches(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public User RegisterUser(User user)
	{
		return user;
	}
}