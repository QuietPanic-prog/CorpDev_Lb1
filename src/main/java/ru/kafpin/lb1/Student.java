package ru.kafpin.lb1;

public class Student {
    private Long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String email;
    private Integer admissionYear;
    private String group;
    private String login;

    public Student() {
    }

    public void generateGroupAndLogin() {
        if (admissionYear != null) {
            int lastTwoDigits = Math.abs(admissionYear) % 100;
            String yearSuffix = String.format("%02d", lastTwoDigits);

            this.group = "ПИН-1" + yearSuffix;

            this.login = "student-pin" + yearSuffix + "-" + (id != null ? id : 0);
        }
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getAdmissionYear() { return admissionYear; }
    public void setAdmissionYear(Integer admissionYear) { this.admissionYear = admissionYear; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
}