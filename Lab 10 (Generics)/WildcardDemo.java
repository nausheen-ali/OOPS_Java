import java.util.ArrayList;
import java.util.List;

class Stack<T> {
    List<T> items;

    public Stack() {
        items = new ArrayList<>();
    }

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return items.remove(items.size() - 1);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }


    public T peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return items.get(items.size() - 1);
    }
}

class Student {
    String name;
    int Id;

    public Student(String name,int Id) {
        this.name = name;
        this.Id = Id;
    }

    public String toString() {
        return "Student(Name: " + name + ", ID: " + Id + ")";
    }
}

class Employee {
    String name;
    String Id;

    public Employee(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    public String toString() {
        return "Employee(Name: " + name + ", ID: " + Id + ")";
    }
}

public class WildcardDemo {
    public static void display(Stack<?> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Student> studentStack = new Stack<>();
        studentStack.push(new Student("Alice", 1));
        studentStack.push(new Student("Bob", 2));


        Stack<Employee> employeeStack = new Stack<>();
        employeeStack.push(new Employee("Charlie", "E001"));
        employeeStack.push(new Employee("Dana", "E002"));

        System.out.println("Students in the stack:");
        display(studentStack);
	System.out.println();
        System.out.println("Employees in the stack:");
        display(employeeStack);
    }
}
