package com.praticelogin.bigkbear.timetablingonline;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity{

    EditText etusername , etpassword;
    LocalDatabase localDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        etusername = (EditText)findViewById(R.id.TFusername_login);
        etpassword = (EditText)findViewById(R.id.TFpassword_login);
        localDatabase = new LocalDatabase(this);

    }

    public void onRegisterClick(View view)
    {
        Intent intent = new Intent(MainActivity.this , Register.class);
        startActivity(intent);
    }

    public void onLoginClick(View view)
    {
        String username = etusername.getText().toString();
        String password = etpassword.getText().toString();

        Contact contact = new Contact(username,  password);
        Log.e("uname = ", contact.username);
        authenticate(contact);

    }

    private void authenticate(Contact contact)
    {
        ServerRequests serverRequests = new ServerRequests(MainActivity.this);


        serverRequests.fetchDataInBackground(contact , new GetUserCallback() {

            @Override
            public void done(Contact returnedContact) {
                if(returnedContact == null)
                {
                    //show an error message
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username & Password don't match!");
                    builder.setPositiveButton("OK" , null);
                    builder.show();
                }
                else
                {
                    //Log user in
                    localDatabase.storeData(returnedContact);
                    localDatabase.setUserLoggedIn(true);

                    Intent intent = new Intent(MainActivity.this , DisplayInfo.class);
                    startActivity(intent);
                }

            }
        });
    }
    }

