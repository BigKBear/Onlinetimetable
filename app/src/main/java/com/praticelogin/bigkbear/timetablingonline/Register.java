package com.praticelogin.bigkbear.timetablingonline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by BigKBear on 7/28/15.
 */
public class Register extends Activity {

    /*EditText firstname, middlename, lastname, address, housenumber, cellnumber, gender, role,username, pass1, pass2;
    //String firstnamestr, middlenamestr, lastnamestr, addressstr ;

    SQLiteDatabaseHelper signup_db_helper = new SQLiteDatabaseHelper(Register.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_page);

        firstname = (EditText)findViewById(R.id.TFfirstname);
        middlename = (EditText)findViewById(R.id.TFmiddlename);
        lastname = (EditText)findViewById(R.id.TFlastname);
        address = (EditText)findViewById(R.id.TFaddress);
        housenumber = (EditText)findViewById(R.id.TFhousenumber);
        cellnumber = (EditText)findViewById(R.id.TFcellnumber);
        gender = (EditText)findViewById(R.id.TFgender);
        role = (EditText)findViewById(R.id.TFrole);
        username = (EditText)findViewById(R.id.TFusername);
        pass1 = (EditText)findViewById(R.id.TFpass1);
        pass2 = (EditText)findViewById(R.id.TFpass2);
    }

    public void onRegistrationLoginClick(View v)
    {
        Intent login = new Intent(Register.this, MainActivity.class);
        startActivity(login);
    }

    public void onSignUpClick(View v)
    {
        if(v.getId() == R.id.Bsignupbutton)
        {
            String firstnamestr = firstname.getText().toString();
            String middlenamestr = middlename.getText().toString();
            String lastnamestr = lastname.getText().toString();
            String addressstr = address.getText().toString();
            String housenumberstr = housenumber.getText().toString();
            String cellnumberstr = cellnumber.getText().toString();
            String genderstr = gender.getText().toString();
            String rolestr = role.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if(!pass1str.equals(pass2str))
            {
                //popup message
                Toast pass = Toast.makeText(Register.this, "Passwords do not match! Enter again", Toast.LENGTH_SHORT);
                pass.show();
            }
            else
            {
                //insert the data in the database
                Contact profile = new Contact();
                profile.setFirst_name(firstnamestr);
                profile.setMiddle_name(middlenamestr);
                profile.setLast_name(lastnamestr);
            }
        }
    }
    */
    EditText etname ,etemail , etusername , etpassword, etconfirm_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_page);

        etusername = (EditText)findViewById(R.id.TFusername_register);
        etpassword = (EditText)findViewById(R.id.TFpassword_register);
        etname = (EditText)findViewById(R.id.TFname_register);
        etemail = (EditText)findViewById(R.id.TFemail_register);
        etconfirm_password = (EditText)findViewById(R.id.TFconfirm_password_register);

    }

    public void onLoginClick(View view)
    {
        Intent intent = new Intent(Register.this , MainActivity.class);
        startActivity(intent);
    }

    public void onRegisterClick(View view){
        String name = etname.getText().toString();
        String email = etemail.getText().toString();
        String username = etusername.getText().toString();
        String password = etpassword.getText().toString();
        String confirm_password = etconfirm_password.getText().toString();



        if(password.equals(confirm_password))
        {
            Contact contact = new Contact(name ,email , username,password);
            ServerRequests serverRequests = new ServerRequests(this);
            serverRequests.storeDataInBackground(contact , new GetUserCallback() {
                @Override
                public void done(Contact returnedContact) {
                    Intent intent = new Intent(Register.this , MainActivity.class);
                    startActivity(intent);
                }
            });
        }
        else{
            Toast.makeText(this , "Passwords don't match! Enter again!" , Toast.LENGTH_LONG).show();
        }

    }
}