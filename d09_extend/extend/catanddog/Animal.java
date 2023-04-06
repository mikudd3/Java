package itheima.java1.d09_extend.extend.catanddog;

/**
 * @project: 动物类
 * @author: mikudd3
 * @version: 1.0
 */
public class Animal {
    private String name;    //姓名
    private int age;        //年龄

    public Animal() {
    }

    public Animal(String name, int age) {
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
}
