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

    /*
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
    */

    EditText etname ,etemail , etusername , etaddress, etpassword, etconfirm_password, ethousenumber, etcellnumber, etrole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_page);

        etusername = (EditText)findViewById(R.id.TFusername_register);
        etpassword = (EditText)findViewById(R.id.TFpassword_register);
        etname = (EditText)findViewById(R.id.TFname_register);
        etemail = (EditText)findViewById(R.id.TFemail_register);
        etaddress = (EditText)findViewById(R.id.TFaddress_register);
        ethousenumber = (EditText)findViewById(R.id.TFhousenumber_register);
        etcellnumber = (EditText)findViewById(R.id.TFcellnumber_register);
        etrole = (EditText)findViewById(R.id.TFrole_register);
        etconfirm_password = (EditText)findViewById(R.id.TFconfirm_password_register);

    }

    public void onLoginClick(View view)
    {
        Intent intent = new Intent(Register.this , MainActivity.class);
        startActivity(intent);
    }

    public void onRegisterClick(View view){
        String fullname = etname.getText().toString();
        String email = etemail.getText().toString();
        String address = etaddress.getText().toString();
        String username = etusername.getText().toString();
        String password = etpassword.getText().toString();
        String confirm_password = etconfirm_password.getText().toString();
        int housenumber = Integer.parseInt(ethousenumber.getText().toString());
        int cellnumber = Integer.parseInt(etcellnumber.getText().toString());
        int role = Integer.parseInt(etrole.getText().toString());
         //int age = Integer.parseInt(etAge.getText().toString());



        if(password.equals(confirm_password))
        {
            Profile profile = new Profile(fullname , email , address ,  username , password , housenumber, cellnumber, role);
            ServerRequests serverRequests = new ServerRequests(this);
            serverRequests.storeDataInBackground(profile , new GetUserCallback() {
                @Override
                public void done(Profile returnedProfile) {
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