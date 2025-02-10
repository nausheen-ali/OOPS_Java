class STUD {
    String name;
    int marks[] = new int[3];
    int total;

    STUD() {
        this.name = "Unknown";
        this.marks = new int[]{0, 0, 0}; 
        this.total = 0;
    }

    public STUD(String name, int marks[]) {
        this.name = name;
        this.marks = marks;
        this.total=compute(marks);
    }

    public void display() {
        System.out.println("Name: " + name);
        for (int i=0;i<this.marks.length;i++)
            System.out.println("Marks" +i+ " :" + marks[i]);
        System.out.println("Total Marks: " + total);
    }
    
    public int compute(int[] marks){
        int total=0;
        for (int i=0;i<this.marks.length;i++)
            total+=marks[i];
        return total;
    }

    public static void main(String[] args) {
        STUD s1 = new STUD();
        s1.display();

        int a[] ={98,90,86};
        STUD s2 = new STUD("Amanda", a);
        s2.display();
    }
}
