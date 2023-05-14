package DAL;
import Model.*;
import java.io.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder; 
import java.lang.*;
import java.lang.reflect.Type;
import java.util.*;
import com.google.gson.reflect.TypeToken;

public class Registration
{
	public String RegistrationFile = "DAL/UserRegistration.json";
	
	public Registration()
	{
		 Gson gson = new Gson(); 
		 
		try{
			File file = new File(RegistrationFile);
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("Successfully Created");
				
				List<User> users = new ArrayList<User>();
		
		       String json = gson.toJson(users);  // Object To Serialized (string).
		       System.out.println(json);
		       
		       FileWriter writer = new FileWriter(RegistrationFile, true);
			   writer.write(json);
			   writer.write("\r\n");   // write new line
			   writer.close();
			}
		    }catch(Exception er)
		    {
		    	System.out.println("Registration Constructor Error");
		    }
		
	}
	
	
	public User GetUserByEmployeeID(String employeeID)
	{
		List<User> Users = new ArrayList<User>();
		
		User GetUser = null;
		
		for(User user: Users)
		{
			if(user.EmployeeID == employeeID)
			{
				 GetUser = user;
				 break;
			}
		}
		
		return GetUser;
	}
	
	public List<User> GetUserList()
	{
		String json = "";
		Type listType = new TypeToken<ArrayList<User>>(){}.getType();
		Gson gson = new Gson();
		
		try
		{
			System.out.println("File INput");
			FileInputStream fis = new FileInputStream(RegistrationFile);
            byte[] buffer = new byte[10];
            StringBuilder sb = new StringBuilder();
            while (fis.read(buffer) != -1) {
            	sb.append(new String(buffer));
            	buffer = new byte[10];
            }
            fis.close();
            json = sb.toString().trim();
			System.out.println("File INput Exit");
		}catch(Exception er)
		{
			System.out.println("Exception from FileInputStream");
		}
		
		System.out.println(json);
	    List<User> Users = new ArrayList<User>();
		Users = gson.fromJson(json, listType); // Serialized To Deserilalized 
		
		return Users;
	}
	
	public Boolean RegisterUser(User usr)
	{
		String json = "";
		
		Gson gson = new Gson(); 
		
		Boolean registrationFlag = true;
		
	    List<User> Users = new ArrayList<User>();
		
		Users = GetUserList();
		
		if(Users == null)
		{
			Users = new ArrayList<User>();
		}
			Users.add(usr);
		
			json = gson.toJson(Users);  // Object To Serialized (string).
			System.out.println(json);
		
		try {
            FileWriter writer = new FileWriter(RegistrationFile, false);
			writer.write("");
            writer.write(json);
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
			registrationFlag = false;
			return registrationFlag;
        }
		
		return registrationFlag;
	}
}