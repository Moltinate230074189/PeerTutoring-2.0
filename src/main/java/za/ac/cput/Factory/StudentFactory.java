package za.ac.cput.Factory;

    /*
 StudentFactory.java

 Student Factory Class

 Author: Tsebo Motsumi
 Student Number: 2300074189
 Date: 28 June 2026

import za.ac.cput.domain.Student;
import java.time.LocalDate;

    public class StudentFactory {

        public static Student createStudent(
                Long studentId,
                String firstName,
                String lastName,
                String email,
                String phoneNumber,
                LocalDate dateOfBirth,
                LocalDate registrationDate,
                boolean active) {

            return new Student.Builder()
                    .setStudentId(studentId)
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setEmail(email)
                    .setPhoneNumber(phoneNumber)
                    .setDateOfBirth(dateOfBirth)
                    .setRegistrationDate(registrationDate)
                    .setActive(active)
                    .build();
        }
    }
}
