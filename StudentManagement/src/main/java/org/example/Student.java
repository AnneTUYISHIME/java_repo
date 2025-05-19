package org.example;


    import java.sql.Date;

    public class Student {
        private int id;
        private String firstName;
        private String lastName;
        private String email;
        private Date dateOfBirth;

        public Student(int id, String firstName, String lastName, String email, Date dob) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.dateOfBirth = dob;
        }

        public Student(String firstName, String lastName, String email, Date dob) {
            this(0, firstName, lastName, email, dob);
        }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getFirstName() { return firstName; }
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public String getLastName() { return lastName; }
        public void setLastName(String lastName) { this.lastName = lastName; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public Date getDateOfBirth() { return dateOfBirth; }
        public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    }


