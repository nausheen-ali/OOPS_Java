import java.util.*;

class STUDENT {
    String sname;

    void assign(String name) {
        this.sname = name.trim();
    }

    void display() {
        System.out.println("Name\t:\t" + this.sname);
    }

    String extractInitials() {
        Scanner sc = new Scanner(this.sname);
        String s = "";
        while (sc.hasNext()) {
            s += sc.next().charAt(0);
        }
        return s;
    }
    
    String removeWhitespace() {
       return this.sname.replaceAll("\\s", "");
    }

    static void listBySubstring(STUDENT[] students, String sub) {
        for (STUDENT s : students) {
            if (s.sname.contains(sub))
                System.out.println(s.sname);
        }
    }

    static void sortStudents(STUDENT[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].sname.compareTo(students[j + 1].sname) > 0) {
                    STUDENT temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students");
        int n = sc.nextInt();
        sc.nextLine();

        STUDENT Students[] = new STUDENT[n];

        System.out.println("Enter name");
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            Students[i] = new STUDENT();
            Students[i].assign(name);
        }

        STUDENT.sortStudents(Students);

        for (int i = 0; i < n; i++) {
            System.out.println();
            Students[i].display();
            System.out.println("Initials: " + Students[i].extractInitials());
            System.out.println("Name without whitespace: " + Students[i].removeWhitespace());
        }

        System.out.println("Enter substring to search in names:");
        String sub = sc.nextLine();
        STUDENT.listBySubstring(Students, sub);
    }
}
