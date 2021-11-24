package com.bjpowernode.domain;

public class User {
    private Integer id;

    private String name;

    private String password;

    private String email;

    private String phone;

    private String sex;

    private String age;

    private String head;

    private String rmark;

    private String createtime;

    private String lastlogintime;

    private String loginsum;

    private String logintimesum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    public String getRmark() {
        return rmark;
    }

    public void setRmark(String rmark) {
        this.rmark = rmark == null ? null : rmark.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime == null ? null : lastlogintime.trim();
    }

    public String getLoginsum() {
        return loginsum;
    }

    public void setLoginsum(String loginsum) {
        this.loginsum = loginsum == null ? null : loginsum.trim();
    }

    public String getLogintimesum() {
        return logintimesum;
    }

    public void setLogintimesum(String logintimesum) {
        this.logintimesum = logintimesum == null ? null : logintimesum.trim();
    }
}