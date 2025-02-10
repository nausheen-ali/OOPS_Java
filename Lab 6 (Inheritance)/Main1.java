class Person {
    private String name;
    private String birthDate;

    Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    String getName() {
        return name;
    }

    String getBirthDate() {
        return birthDate;
    }
}

class CollegeGraduate extends Person {
    private double gpa;
    private int graduationYear;

    CollegeGraduate(String name, String birthDate, double gpa, int graduationYear) {
        super(name, birthDate);
        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }

    double getGpa() {
        return gpa;
    }

    int getGraduationYear() {
        return graduationYear;
    }
}

public class Main1 {
    public static void main(String[] args) {
        CollegeGraduate grad = new CollegeGraduate("Alice", "01/01/2000", 3.9, 2022);
        System.out.println("Name: " + grad.getName() + "\tBirth Date: " + grad.getBirthDate() + 
                           "\tGPA: " + grad.getGpa() + "\tGraduation Year: " + grad.getGraduationYear());
    }
}