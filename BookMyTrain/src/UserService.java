import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String,User> userMap = new HashMap<>();
    private User currentUser = null;

    public boolean registerUser(String userName,String password,String fullName,String contact)
    {
        if (userMap.containsKey(userName)) {
            System.out.println("Username already taken,Please choice another");
            return false;
        }
        User user = new User(userName,password,contact,fullName);
        userMap.put(userName,user);
        System.out.println("Registration Successful");
        return true;
    }

    public boolean loginUser(String username,String password) {
        if (!userMap.containsKey(username)) {
            System.out.println("No Username Found with this username");
            return false;
        }

        User user = userMap.get(username);
        if (!user.getPassword().equals(password)) {
            System.out.println("Incorrect Password");
            return false;
        }

        currentUser = user;
        System.out.println(" Wecome : "+currentUser.getFullName()+"!");
        return true;
    }

    public void logOutUser() {
        if (currentUser != null) {
            System.out.println("Logged out "+currentUser.getFullName());
        }
        currentUser = null;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean isLoggedIn() {
        return currentUser !=null;
    }


}
