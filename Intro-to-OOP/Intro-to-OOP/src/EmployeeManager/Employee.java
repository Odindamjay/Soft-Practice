package EmployeeManager;

public class Employee {

        private String firstName;
        private String lastName;
        private String email;
        private double salary;

        public Employee(String firstName, String lastName, String email, double salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.salary = salary;
        }


        public Employee() {
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(" _____________________________________\n");
            sb.append("|                                     |\n");
            sb.append("|  Employee Information:              |\n");
            sb.append("|  Name: ").append(firstName).append(" ").append(lastName);
            for (int i = 0; i < 36 - (firstName.length() + lastName.length()); i++) {
                sb.append(" ");
            }
            sb.append("|\n");
            sb.append("|  Email: ").append(email);
            for (int i = 0; i < 35 - email.length(); i++) {
                sb.append(" ");
            }
            sb.append("|\n");
            sb.append("|  Salary: $").append(String.format("%.2f", salary));
            for (int i = 0; i < 34 - String.format("%.2f", salary).length(); i++) {
                sb.append(" ");
            }
            sb.append("|\n");
            sb.append("|_____________________________________|\n");
            return sb.toString();
        }

}
