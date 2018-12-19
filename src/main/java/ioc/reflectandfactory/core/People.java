package ioc.reflectandfactory.core;

/**
 * @description 抽象类人
 * @author Kangshuai Zuo
 * @date 2018/12/19 16:33
 */
public abstract class People {

    private String name;

    private int age;

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

    public abstract void walk();

}