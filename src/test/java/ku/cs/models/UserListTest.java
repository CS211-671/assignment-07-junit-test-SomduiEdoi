package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    User u1, u2, u3;
    @BeforeEach
    void init(){
        u1 = new User("SomduiEdoi","M1212312121");
        u2 = new User("Zinzuzan","xoxo6969");
        u3 = new User("SufeiMing","xyz555");
    }


    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userlist = new UserList();
        userlist.addUser("SomduiEdoi","M1212312121");
        userlist.addUser("Zinzuzan","xoxo6969");
        userlist.addUser("SufeiMing","xyz555");

        // TODO: find one of them
        User findUser = userlist.findUserByUsername("SomduiEdoi");

        // TODO: assert that UserList found User

        String expected = "SomduiEdoi";
        String actual = findUser.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userlist = new UserList();
        userlist.addUser("SomduiEdoi","M1212312121");
        userlist.addUser("Zinzuzan","xoxo6969");
        userlist.addUser("SufeiMing","xyz555");

        // TODO: change password of one user
        userlist.changePassword("Sufeiming","xyz555","mamaaini");
        // TODO: assert that user can change password
      
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
    }

}