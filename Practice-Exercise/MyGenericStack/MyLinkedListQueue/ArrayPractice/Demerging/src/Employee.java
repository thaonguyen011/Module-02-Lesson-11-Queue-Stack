public class Employee {
    private String name;
    private String gender;
    private int[] dateOfBirth;

    public Employee(String name, String gender, int day, int month, int year) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = new int[] {day, month, year};
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int[] getDateOfBirth() {
        return dateOfBirth;
    }
    public int getDay() {
        return dateOfBirth[0];
    }

    public int getMonth() {
        return dateOfBirth[1];
    }
    public int getYear() {
        return dateOfBirth[2];
    }


    public void setDateOfBirth(int[] dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
