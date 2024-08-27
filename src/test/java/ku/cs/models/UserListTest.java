package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList userList;
    @BeforeEach
    void init(){
        userList = new UserList();
        userList.addUser("SomduiEdoi","M1212312121");
        userList.addUser("Zinzuzan","xoxo6969");
        userList.addUser("SuFeiMing","xyz555");
    }


    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        // TODO: find one of them
        User findUser = userList.findUserByUsername("SomduiEdoi");

        // TODO: assert that UserList found User

        String expected = "SomduiEdoi";
        String actual = findUser.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        // TODO: change password of one user
        boolean actual = userList.changePassword("SuFeiMing", "xyz555", "MaMaAini");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password
        User actual = userList.login("Zinzuzan", "xoxo6969");
        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("Zinzuzan");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("SomduiEdoi", "Milk37832");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}