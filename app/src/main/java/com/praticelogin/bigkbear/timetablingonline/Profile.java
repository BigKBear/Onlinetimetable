package com.praticelogin.bigkbear.timetablingonline;

/**
 * Created by BigKBear on 8/2/15.
 */
public class Profile {
    String fullname, email, address, username, password;
    int housenumber, cellnumber, role;

    public Profile(String fullname, String email, String address, String username, String password, int housenumber, int cellnumber, int role)
    {
        this.fullname = fullname;
        this.email = email;
        this.address = address;
        this.username = username;
        this.password = password;
        this.housenumber = housenumber;
        this.cellnumber = cellnumber;
        this.role = role;
    }

    public Profile(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

}
