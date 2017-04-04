package com.example.administrator.actionmode;

/**
 * Created by Administrator on 2017/3/21.
 */
public class Contact {
    private  String userName;
    private String phoneNume;

    public Contact(String userName, String phoneNume) {
        this.userName = userName;
        this.phoneNume = phoneNume;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNume;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNume) {
        this.phoneNume = phoneNume;
    }
}
