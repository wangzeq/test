package com.hainiu.set;

// Comparable
// public int compareTo(T o);
public class Teacher implements Comparable<Teacher> { // Teacher对象的比较接口
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (age != teacher.age) return false;
        return name != null ? name.equals(teacher.name) : teacher.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

//    @Override
//    public int compareTo(Teacher o) {
//        return 0;
//    }

    /*
        新元素添加到集合时，与存在的元素进行比较
            根据compareTo方法的返回值
            如果返回正数，新元素比较大，往后放
            如果返回负数，新元素比较小，往前放
            如果返回0，重复，不添加
     */
    @Override
    public int compareTo(Teacher o) {
        // 根据什么排序？ 年龄从小到大  年龄相同 姓名的字典顺序
        // this 代表新元素
        // 0代表已经存在的元素
        int num = this.age - o.age;
        // 年龄相同 姓名的字典顺序
        if (num == 0) {
            num = this.name.compareTo(o.name);
        }
        return num;
    }
}
