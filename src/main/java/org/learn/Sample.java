package org.learn;

/**
 * Created by vinay on 15/7/17.
 */
public class Sample {

    class Employee {
        private String name;
        private String id;

        public Employee(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.print();

    }

    void print() {
        Employee emp = new Employee("Bhaskar","05");
        System.out.println(emp);
    }

}
