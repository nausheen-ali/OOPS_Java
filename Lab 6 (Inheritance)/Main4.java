class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Sports extends Student {
    int s_grade;

    Sports(String name, int id, int s_grade) {
        super(name, id);
        this.s_grade = s_grade;
    }
}

class Exam extends Student {
    int e_grade;

    Exam(String name, int id, int e_grade) {
        super(name, id);
        this.e_grade = e_grade;
    }
}

class Results extends Sports {
    int e_grade;
    String result;

    Results(String name, int id, int s_grade, int e_grade, String result) {
        super(name, id, s_grade);
        this.e_grade = e_grade;
        this.result = result;
    }

    void display() {
        System.out.println("Name: " + name + "\tID: " + id + "\tSports Grade: " + s_grade + 
                           "\tExam Grade: " + e_grade + "\tResult: " + result);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Results r = new Results("Alice", 101, 85, 90, "Pass");
        r.display();
    }
}