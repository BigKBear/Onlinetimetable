package com.praticelogin.bigkbear.timetablingonline;

/**
 * Created by BigKBear on 7/28/15.
 */
public class Contact {

    int profiles_id, house_number, cell_number, role_role_id;
    String first_name, middle_name, last_name, address, gender, username, password;


    //String name, email, username, password;

    public Contact(String first_name,String middle_name,String last_name,String address,String gender,String username,String password, int house_number,int cell_number,int role_role_id) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.address = address;
        this.gender=gender;
        this.username=username;
        this.password=password;
        this.house_number=house_number;
        this.cell_number=cell_number;
        this.role_role_id=role_role_id;
    }

    public Contact(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

/*package com.praticelogin.bigkbear.timetablingonline;

/**
 * Created by BigKBear on 7/28/15.
 *
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
*/