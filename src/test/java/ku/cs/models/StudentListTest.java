package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList;
    @BeforeEach
    void init(){
        studentList = new StudentList();
    }

    @Test
    @DisplayName("StudentList : ตรวจสอบ addNewStudent (id, name)")
    void testAddNewStudent2() {
        studentList.addNewStudent("6710405443","Pheesadet");
        assertEquals("Pheesadet",studentList.findStudentById("6710405443").getName());
    }

    @Test
    @DisplayName("StudentList : ตรวจสอบ addNewStudent (id, name, score)")
    void testAddNewStudent3() {
        studentList.addNewStudent("6710405443","Pheesadet",67);
        assertEquals("Pheesadet",studentList.findStudentById("6710405443").getName());
        assertEquals(67,studentList.findStudentById("6710405443").getScore());
    }

    @Test
    @DisplayName("StudentList : ตรวจสอบชื่อผ่าน id")
    void testFindStudentById() {
        studentList.addNewStudent("6710405443","Pheesadet");
        assertEquals("Pheesadet",studentList.findStudentById("6710405443").getName());
    }

    @Test
    @DisplayName("StudentList : ฟิลเตอร์ชื่อ")
    void testFilterbyName(){
        studentList.addNewStudent("6710405443","Pheesadet");
        studentList.addNewStudent("6710405403","Pheesadet");
        studentList.addNewStudent("6710405453","Pheesadet");
        studentList.addNewStudent("6710405442","Sunita");
        studentList.addNewStudent("6710405441","Kanlaya");
        studentList.addNewStudent("6710405441","Kunthai");
        assertEquals(3,studentList.filterByName("Pheesadet").getStudents().size());
    }

    @Test
    @DisplayName("StudentList : ให้คะแนนเพิ่มใน List")
    void testGiveScoreToId(){
        studentList.addNewStudent("6710405442","Sunita");
        studentList.addNewStudent("6710405443","Pheesadet");
        studentList.findStudentById("6710405442").addScore(67);
        studentList.findStudentById("6710405443").addScore(90);
        assertEquals(90,studentList.findStudentById("6710405443").getScore());
        assertEquals(67,studentList.findStudentById("6710405442").getScore());
    }

    @Test
    @DisplayName("StudentList : ดูเกรดผ่าน id")
    void testViewGradeOfId(){
        studentList.addNewStudent("6710405442","Sunita");
        studentList.addNewStudent("6710405443","Pheesadet");
        studentList.findStudentById("6710405442").addScore(67);
        studentList.findStudentById("6710405443").addScore(90);
        assertEquals("C",studentList.findStudentById("6710405442").getGrade());
        assertEquals("A",studentList.findStudentById("6710405443").getGrade());
    }
}