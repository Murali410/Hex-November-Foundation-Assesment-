package login_assignment;

import java.util.HashMap;
import java.util.Map;

public class LoginService {
	Map<String,String> map=new HashMap<>();
	LoginService(){
		map.put("admin", "admin@123");
		map.put("user1", "user1@123");
		map.put("user2", "user2@123");
		map.put("user3", "user3@123");
		map.put("user4", "user4@123");
	}
	public boolean isValidate(String userName,String password) {
		if(map.containsKey(userName)) {
			if(map.get(userName).equals(password)) return true;
			else return false;
		}else return false;
	}

}
