package com.course.demo.impl;

/**
 * User: bao
 * Date: 2014/7/8
 */
public class UserData {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserData)) return false;

        UserData userData = (UserData) o;

        if (password != null ? !password.equals(userData.password) : userData.password != null) return false;
        if (username != null ? !username.equals(userData.username) : userData.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
