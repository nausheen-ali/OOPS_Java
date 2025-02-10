import java.util.*;

class Record {
    int regNo;
    String name;
    GregorianCalendar doj;
    short sem;
    float gpa, cgpa;
    static int count;

    Record(String n, GregorianCalendar date, short sem, float gpa, float cg) {
        this.name = n;
        this.doj = date;
        this.sem = sem;
        this.gpa = gpa;
        this.cgpa = cg;
        this.regNo = (doj.get(GregorianCalendar.YEAR) % 100) * 100 + ++count;
    }

    void display() {
        System.out.printf("%d\t%s\t%tF\t%d\t%.2f\t%.2f%n", regNo, name, doj.getTime(), sem, gpa, cgpa);
    }

    static void sortBycg(Record[] records) {
        int n = records.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (records[j].sem > records[j + 1].sem || (records[j].sem == records[j + 1].sem && records[j].cgpa < records[j+1].cgpa)) {
                    Record temp = records[j];
                    records[j] = records[j + 1];
                    records[j + 1] = temp;
                }
            }
        }
    }

    static void sortByName(Record[] records) {
        int n = records.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (records[j].name.compareTo(records[j + 1].name) > 0) {
                    Record temp = records[j];
                    records[j] = records[j + 1];
                    records[j + 1] = temp;
                }
            }
        }
    }

    void toInitial() {
        int n = name.lastIndexOf(" ");
        String in = name.substring(0, n);
        String l = name.substring(n+1);
        Scanner sc = new Scanner(in);
        String s = "";
        while (sc.hasNext()) {
            s += sc.next().charAt(0) + ". ";
        }
        s += l;
        name = s;
        sc.close();
    }

    static void listChar(Record records[], char ch) {
        System.out.println("Names starting with " + ch + " are: ");
        for (int i = 0; i < records.length; i++) {
            if (!records[i].name.isEmpty() && Character.toLowerCase(records[i].name.charAt(0)) == Character.toLowerCase(ch)) {
                System.out.println(records[i].name);
            }
        }
    }

    static void listSub(Record records[], String s) {
        System.out.println("Names containing " + s + " are: ");
        for (int i = 0; i < records.length; i++) {
            if (records[i].name.toLowerCase().contains(s.toLowerCase())) {
                System.out.println(records[i].name);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of records (minimum 5)");
        int n;
        do {
            n = sc.nextInt();
        } while (n < 5);
        sc.nextLine(); // Consume newline

        Record records[] = new Record[n];
        System.out.println("Enter name, date(dd mm yyyy), sem, gpa, and cgpa");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int day = sc.nextInt();
            int month = sc.nextInt() - 1;
            int year = sc.nextInt();
            short sem = sc.nextShort();
            float gpa = sc.nextFloat();
            float cgpa = sc.nextFloat();
            sc.nextLine();
            name = name.replace("\"", "").replace("'", "");
            GregorianCalendar doj = new GregorianCalendar(year, month, day);
            records[i] = new Record(name, doj, sem, gpa, cgpa);
        }

        System.out.println("Sorted by sem and cgpa");
        sortBycg(records);
        for (int i = 0; i < records.length; i++)
            records[i].display();

        System.out.println("Sorted by name");
        sortByName(records);
        for (int i = 0; i < records.length; i++)
            records[i].display();

        listChar(records, 's');
        listSub(records, "sh");

        System.out.println("Converting names to initials.");
        for (Record record : records)
            record.toInitial();

        for (int i = 0; i < records.length; i++)
            records[i].display();
    }
}