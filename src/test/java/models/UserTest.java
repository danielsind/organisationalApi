package models;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class UserTest {
    public User setupNewUser(){
        return new User("Danny", 1, "IT");
    }


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void userInstantiatesCorrectly() {
        User newUser = setupNewUser();
        assertEquals(true, newUser instanceof User);
    }

    @Test
    public void getsUserNameReturnsUserNameCorrectly_String() {
        User newUser = setupNewUser();
        assertEquals("Danny", newUser.getUserName());
    }

    @Test
    public void setsUserNameSetsUserNameCorrectly_Annette() {
        User newUser = setupNewUser();
        newUser.setUserName("Daniel");
        assertEquals("Daniel", newUser.getUserName());
    }
    @Test
    public void getsDepartmentIdReturnsDepartmentIdCorrectly(){
        User newUser = setupNewUser();
        assertEquals(1, newUser.getDepartmentId());
    }

    @Test
    public void setsDepartmentIdSetsDepartmentIdCorrectly() {
        User newUser = setupNewUser();
        newUser.setDepartmentId(2);
        assertEquals(2, newUser.getDepartmentId());
    }

    @Test
    public void getsRoleReturnsRoleCorrectly_String() {
        User newUser = setupNewUser();
        assertEquals("IT", newUser.getRole());
    }

    @Test
    public void setsRoleSetsRoleCorrectly_String() {
        User newUser = setupNewUser();
        newUser.setRole("Developer");
        assertEquals("Developer", newUser.getRole());
    }

    @Test
    public void userReturnsTrueIfUserNameAndDepartmentIdAndRoleAreSame() {
        User newUser = setupNewUser();
        User anotherUser = setupNewUser();
        assertEquals(true, newUser.equals(anotherUser));
    }


}
