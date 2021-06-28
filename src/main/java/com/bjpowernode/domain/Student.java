package com.bjpowernode.domain;/**
 * TODO
 *
 * @date 20/1/2021 下午8:46
 * @author 谢树树
 */
public class Student {
    private Integer id;
    private String sname;
    private String email;
    private Integer age;


    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
