package za.ac.cput.Domain;

    /*
 Student.java

 Student Entity Class

 Author: Tsebo Moltinate Motsumi
 Student Number: 230074189
 Date: 21 June 2026
*/

import java.time.LocalDate;

    public class Student {

        private Long studentId;
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;
        private LocalDate dateOfBirth;
        private LocalDate registrationDate;
        private boolean active;

        private Student() {
        }

        private Student(Builder builder) {
            this.studentId = builder.studentId;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.email = builder.email;
            this.phoneNumber = builder.phoneNumber;
            this.dateOfBirth = builder.dateOfBirth;
            this.registrationDate = builder.registrationDate;
            this.active = builder.active;
        }

        public Long getStudentId() {
            return studentId;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        public LocalDate getRegistrationDate() {
            return registrationDate;
        }

        public boolean isActive() {
            return active;
        }

        public static class Builder {

            private Long studentId;
            private String firstName;
            private String lastName;
            private String email;
            private String phoneNumber;
            private LocalDate dateOfBirth;
            private LocalDate registrationDate;
            private boolean active;

            public Builder setStudentId(Long studentId) {
                this.studentId = studentId;
                return this;
            }

            public Builder setFirstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            public Builder setLastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public Builder setEmail(String email) {
                this.email = email;
                return this;
            }

            public Builder setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            public Builder setDateOfBirth(LocalDate dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
                return this;
            }

            public Builder setRegistrationDate(LocalDate registrationDate) {
                this.registrationDate = registrationDate;
                return this;
            }

            public Builder setActive(boolean active) {
                this.active = active;
                return this;
            }

            public Student build() {
                return new Student(this);
            }
        }
    }

