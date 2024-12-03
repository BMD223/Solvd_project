
import java.util.ArrayList;


public class UserBase {

    private static final ArrayList<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public User getUser(String email){
        for(User user : users){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    public void printUsers(){
        for(User user : users){
            System.out.println(user.getIdentification());
        }
    }
}
