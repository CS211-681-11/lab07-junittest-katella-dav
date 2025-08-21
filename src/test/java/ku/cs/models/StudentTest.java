package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s;

    // BeforerAll จะถูก initial ครั้งเดียวแล้วใช้ object นั้นตลอดการ test
    // BeforerEach จะถูก initial ทุกครั้งก่อนเริ่ม method อันใหม่
    @BeforeEach
    void init() {
        s = new Student("6710405443","Pheesadet");
    }

    @Test
    @DisplayName("Student : เพิ่มคะแนน")
    void testAddScore() {
        s.addScore(21.75);
        assertEquals(21.75,s.getScore());
    }

    @Test
    @DisplayName("Student : แสดงเกรด")
    void testCalculateGrade() {
        s.addScore(0);
        assertEquals("F",s.getGrade());
    }

    @Test
    @DisplayName("Student : เปลี่ยนชื่อ")
    void testChangName(){
        s.changeName("Nam Sai");
        assertEquals("Nam Sai",s.getName());
    }

    @Test
    @DisplayName("Student : ทดสอบค่า ID")
    void testIsId(){
        assertEquals(true,s.isId("6710405443"));
    }

    @Test
    @DisplayName("Student : การ contain ขื่อ")
    void testIsNameContains(){
        assertEquals(true,s.isNameContains("Phee"));
    }
}