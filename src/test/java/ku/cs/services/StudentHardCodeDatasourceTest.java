package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    @DisplayName("StudentHardCodeDatasourceTest : การอ่านข้อมูล")
    void testReadData(){
        StudentList list = new StudentList();
        StudentHardCodeDatasource compare = new StudentHardCodeDatasource();
        list.addNewStudent("6710400001", "First");
        list.addNewStudent("6710400002", "Second");
        list.addNewStudent("6710400003", "Third");
        list.addNewStudent("6710400004", "Fourth");
        assertEquals(list.getStudents().toString(),compare.readData().getStudents().toString());
    }
}