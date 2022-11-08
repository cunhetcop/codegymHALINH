package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    public static List<User> userList = new ArrayList<>();
    static {
        userList.add(new User(1,"halinh1","halinh1"));
        userList.add(new User(2,"halinh2","halinh2"));
        userList.add(new User(3,"halinh3","halinh3"));
    }
    public User findUserbyUsername ( String username, String password){
        for (User user: userList) {
            if(user.getUsername().equals(username)&& user.getUsername().equals(password)){
                return user;
            }
        }
        return null;
    }
}
