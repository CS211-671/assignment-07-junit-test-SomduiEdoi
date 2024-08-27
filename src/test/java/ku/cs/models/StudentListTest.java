package ku.cs.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentListTest {
    StudentList studentList;

    @BeforeEach
    void init(){
        studentList = new StudentList();
        studentList.addNewStudent("66xxxxxxx1", "somsri", 90);
        studentList.addNewStudent("66xxxxxxx2", "boonsom", 50);
        studentList.addNewStudent("66xxxxxxx3", "lumpei", 60);
    }

    @Test
    void testAddNewStudent(){
        studentList.addNewStudent("66xxxxxxx4", "newwie", 80);
        Student student = studentList.findStudentById("66xxxxxxx4");
        assertNotNull(student);
        assertEquals("newwie", student.getName());
        assertEquals(80.0, student.getScore());
    }

    @Test
    void testfindStudentById(){
        Student student = studentList.findStudentById("66xxxxxxx1");
        assertNotNull(student);
        assertEquals("somsri", student.getName());

    }

    @Test
    void testGiveScoreToId(){
        studentList.giveScoreToId("66xxxxxxx2", 5.0);
        Student student = studentList.findStudentById("66xxxxxxx2");
        double score =  student.getScore();
        assertEquals(55.0, score);
    }

    @Test
    void testViewGradeOfId(){
        String student = studentList.viewGradeOfId("66xxxxxxx1");
        assertEquals("A", student);
    }



}