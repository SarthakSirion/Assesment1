// Author: Sarthak Shrivastava

import java.util.ArrayList;
import java.util.List;

class User implements IValidate {
    private String userid;
    private String password;
    private static List<User> users = new ArrayList<User>();

    private User(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }

    static void addUser(String userid, String password) {
        users.add(new User(userid, password));
        System.out.println("Successfully registered " + userid);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (userid == null) {
            if (other.userid != null)
                return false;
        } else if (!userid.equals(other.userid))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        return true;
    }

    @Override
    public boolean isAuthenticated(String userid, String password) {
        if (users.contains(new User(userid, password))) {
            return true;
        } else {
            return false;
        }
    }
}
