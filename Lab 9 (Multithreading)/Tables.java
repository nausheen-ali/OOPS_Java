class MultiplicationTable extends Thread {
    private int number;

    public MultiplicationTable(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

public class Tables {
    public static void main(String[] args) {

        MultiplicationTable tableOf5 = new MultiplicationTable(5);
        MultiplicationTable tableOf7 = new MultiplicationTable(7);

        tableOf5.start();
        tableOf7.start();
     }
}


