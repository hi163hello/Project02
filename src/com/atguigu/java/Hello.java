package com.atguigu.java;

/**
 * @author zaixianzhu
 * @create 2020-02-10 11:56
 */
public class Hello {
    private String name;

    public Hello(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Hello("哈哈"));
    }
}
