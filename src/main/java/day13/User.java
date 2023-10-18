package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    List<User> subscriptions = new ArrayList<>();
    List<User> friends = new ArrayList<>();

    public User(String username) {
        this.username = username;
        this.subscriptions = null;
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User u : subscriptions) {
            if (u.getUsername().equals(getUsername())) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        return subscriptions.contains(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
