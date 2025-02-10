class STUDENT {
    String sname;
    int mrks[] = new int[5];
    int total;
    double avg;

    STUDENT() {
        sname = "Invalid";
        total = 0;
        avg = 0;
    }

    STUDENT(String name, int a[]) {
        this.sname = name;
        this.mrks = a;
    }

    void display() {
        System.out.print(sname + "\t");
        for (int i = 0; i < mrks.length; i++)
            System.out.print(mrks[i] + "\t");
        System.out.print(total + "\t" + avg + "\n");
    }

    void compute() {
        for (int i = 0; i < mrks.length; i++)
            total += mrks[i];
        avg = total / mrks.length;
    }
}

class ScienceStudent extends STUDENT {
    private int practicalMarks;

    ScienceStudent(String name, int a[], int practicalMarks) {
        super(name, a);
        this.practicalMarks = practicalMarks;
    }

    void compute() {
        super.compute();
        total += practicalMarks;
        avg = total / (mrks.length + 1);
    }

    void display() {
        super.display();
        System.out.print(practicalMarks + "\n");
    }
}

class ArtsStudent extends STUDENT {
    private String electiveSubject;

    ArtsStudent(String name, int a[], String electiveSubject) {
        super(name, a);
        this.electiveSubject = electiveSubject;
    }

    void display() {
        super.display();
        System.out.print(electiveSubject + "\n");
    }
}

public class Students {
    public static void main(String[] args) {
        int sm[] = {85, 90, 88, 92, 87};
        int am[] = {75, 80, 78, 82, 77};

        STUDENT s = new STUDENT("Ram", sm);
        s.compute();
        s.display();

        ScienceStudent sc = new ScienceStudent("Sci", sm, 95);
        sc.compute();
        sc.display();

        ArtsStudent a = new ArtsStudent("Art", am, "History");
        a.compute();
        a.display();
    }
}