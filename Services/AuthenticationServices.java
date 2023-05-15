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
	
	public boolean Register(User userRegistration)
	{
		System.out.println("Register Call");
		User user = _registration.GetUserByEmployeeID(userRegistration.EmployeeID);
		
		if(user == null)
		{
			return _registration.RegisterUser(userRegistration);
		}
		else{
			return false;
		}
		
	}
	
	
	public User RegisterUser(User user)
	{
		return user;
	}
}