class Stack<T> {
    Node<T> top;

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) return null;
        T data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

	 public void display() {
        Node<T> current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Student> studentStack = new Stack<>();
        studentStack.push(new Student("Alice", 1));
        studentStack.push(new Student("Bob", 2));
	studentStack.display();

        System.out.println("Popping from student stack:");
        System.out.println(studentStack.pop());
        System.out.println();

        Stack<Employee> employeeStack = new Stack<>();
        employeeStack.push(new Employee("Charlie", "HR"));
        employeeStack.push(new Employee("Dave", "IT"));
	employeeStack.display();

        System.out.println("Popping from employee stack:");
        System.out.println(employeeStack.pop());
        
    }
}
