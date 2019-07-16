package com.peterwachira.wazinsureapiclient.models;

// new user model

public class User {


    String fullname;
    String id_no;
    String mobile_no;
    String email;
    String profileurl;
    String username;
    String password;

    public User(String fullname, String id_no, String mobile_no, String email, String profileurl, String username, String password) {
        this.fullname = fullname;
        this.id_no = id_no;
        this.mobile_no = mobile_no;
        this.email = email;
        this.profileurl = profileurl;
        this.username = username;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getId_no() {
        return id_no;
    }

    public void setId_no(String id_no) {
        this.id_no = id_no;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileurl() {
        return profileurl;
    }

    public void setProfileurl(String profileurl) {
        this.profileurl = profileurl;
    }

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


}
