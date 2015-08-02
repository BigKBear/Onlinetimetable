package com.praticelogin.bigkbear.timetablingonline;

/**
 * Created by BigKBear on 7/28/15.
 */
public class Contact {

    // int profiles_id, house_number, cell_number, role_role_id;
    // String first_name, middle_name, last_name, address, gender, username, password;


    String name, email, username, password;

    public Contact(String name, String email, String username, String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Contact(String username, String password) {
        this.username = username;
        this.password = password;
    }
}