import java.util.*;
public class DataHandle {
	
	private static HashMap<String, AccountCreation> data = new HashMap<String,AccountCreation>();
	private static HashMap<String, String> account = new HashMap<String,String>();
	
	DataHandle(){
		//Default Constructor
	}
	DataHandle(String username, String password, AccountCreation x){
		account.put(username, password);
		data.put(username, x);
	}
	public boolean checker(String username, String password) {
		
		return account.containsKey(username)&& account.containsValue(password) ? true : false;
	}
	
	public AccountCreation getData(String username, String password) {
		
		return data.get(username);
	}

}
