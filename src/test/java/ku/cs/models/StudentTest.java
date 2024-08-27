package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("661212312121","SomduiEdoi");
    }

    @Test
    void testAddScore(){
     //   Student s1 = new Student("6610402248","Somdui");
        s1.addScore(40);
        assertEquals(40, s1.getScore());
        s1.addScore(30);
        assertEquals(70, s1.getScore());

    }

    @Test
    void testCalculateGrade(){
      //  Student s2 = new Student("6612312121","Susan",50);
        s1.addScore(85);
        assertEquals("A", s1.grade());
    }

    @Test
    void testIsId(){
        boolean actual = s1.isId("661212312121");
        assertTrue(actual);
    }

    @Test
    void testChangeName(){
        s1.changeName("Susan");
        assertEquals("Susan", s1.getName());
    }

}