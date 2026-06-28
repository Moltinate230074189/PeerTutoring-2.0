package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Student;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

    class StudentFactoryTest {

        @Test
        void createStudent() {

            Student student = StudentFactory.createStudent(
                    1L,
                    "Tsebo",
                    "Motsumi",
                    "tsebo@gmail.com",
                    "0812345678",
                    LocalDate.of(2003, 5, 20),
                    LocalDate.now(),
                    true
            );

            assertNotNull(student);
            assertEquals("Tsebo", student.getFirstName());
            assertEquals("Motsumi", student.getLastName());
            assertTrue(student.isActive());
        }
    }
}
