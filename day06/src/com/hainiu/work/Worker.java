package com.hainiu.work;


public class Worker implements Comparable<Worker> {
    private String name;
    private int age;
    private double salary;

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "work4{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    public double compare(Worker o){
        double result = this.salary - o.salary;
        result = result == 0 ? this.age - o.age : result;
        result = result == 0? this.name.compareTo(o.name) : result;

        return result;
    }


    @Override
    public int compareTo(Worker o) {
        double num = o.salary - this.salary;
        if (num == 0) {
            num = this.age-o.age;
        }else if (num == 0) {
            num = this.name.compareTo(o.name);
        }
        return (int) num;
    }
}
