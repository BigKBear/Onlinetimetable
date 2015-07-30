package com.praticelogin.bigkbear.timetablingonline;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;


public class Login_activity extends ActionBarActivity{

    EditText etusername, etpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        etusername = (EditText)findViewById(R.id.TFusername);
        etpassword = (EditText)findViewById(R.id.TFpassword);
    }



    public void onRegisterClick(View v)
    {
        if(v.getId() == R.id.BLogin)
        {
            EditText a = (EditText)findViewById(R.id.TFusername);
            String str = a.getText().toString();

            Intent i = new Intent(this, Main_page.class);
            //transfer the user name
            i.putExtra("Username", str);
            startActivity(i);
        }

        if(v.getId() == R.id.tvRegisterLink) {
            Intent signup = new Intent(this, Registration_Page.class);
            startActivity(signup);
        }
    }

    public void onLoginClick(View v)
    {
        String username = etusername.getText().toString();
        String password = etpassword.getText().toString();
    }

    }

