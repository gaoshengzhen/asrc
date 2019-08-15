package com.byx.demo.entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class User {
    private int userId;
    private String userName;
    private String password;
    private String realName;

    @Override
    public String toString() {
        return "user{" +
                "userid=" + userId +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realName + '\'' +
                '}';
    }
}
