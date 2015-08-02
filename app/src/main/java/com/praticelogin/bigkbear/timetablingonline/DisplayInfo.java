package com.praticelogin.bigkbear.timetablingonline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by BigKBear on 7/30/15.
 */
public class DisplayInfo extends Activity {
/*
    TextView tvfirstname, tvmiddlename, tvlastname, tvaddress, tvhousenumber, tvcellnumber, tvgender, tvrole, tvusername, tvpass1, tvpass2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info);

        tvfirstname = (TextView)findViewById(R.id.PTVfirstname);
        tvmiddlename = (TextView)findViewById(R.id.PTVmiddlename);
        tvlastname = (TextView)findViewById(R.id.PTVlastname);
        tvaddress = (TextView)findViewById(R.id.PTVaddress);
        tvhousenumber = (TextView)findViewById(R.id.PTVhousenumber);
        tvcellnumber = (TextView)findViewById(R.id.PTVcellnumber);
        tvgender = (TextView)findViewById(R.id.PTVgender);
        tvrole = (TextView)findViewById(R.id.PTVrole);
        tvusername = (TextView)findViewById(R.id.PTVusername);
        tvpass1 = (TextView)findViewById(R.id.PTVpass1);
    }


*/


    LocalDatabase localDatabase;

    TextView tvname , tvemail , tvusername , tvpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info);

        tvusername = (TextView)findViewById(R.id.TVusername);
        tvpassword = (TextView)findViewById(R.id.TVpassword);
        tvname = (TextView)findViewById(R.id.TVname);
        tvemail = (TextView)findViewById(R.id.TVemail);

        localDatabase = new LocalDatabase(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        if(authenticate() == true)
        {
            displayContactDetails();
        }
        else
        {
            Intent intent = new Intent(DisplayInfo.this , MainActivity.class);
            startActivity(intent);
        }
    }

    private boolean authenticate()
    {
        return localDatabase.getUserLoggedIn();
    }

    private void displayContactDetails()
    {
        Contact contact = localDatabase.getLoggedInUser();
        tvname.setText(contact.name);
        tvemail.setText(contact.email);
        tvusername.setText(contact.username);
        tvpassword.setText(contact.password);
    }

    public void onLogoutClick(View view){

        localDatabase.clearData();
        localDatabase.setUserLoggedIn(false);

        Intent intent = new Intent(DisplayInfo.this , MainActivity.class);
        startActivity(intent);

    }
}