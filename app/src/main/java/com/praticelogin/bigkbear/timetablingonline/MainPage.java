package com.praticelogin.bigkbear.timetablingonline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by BigKBear on 8/1/15.
 */
public class MainPage extends Activity {

    LocalDatabase  mainlocalDatabase;
    TextView tv_main_page_username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        tv_main_page_username = (TextView)findViewById(R.id.main_TVusername);
        mainlocalDatabase = new LocalDatabase(this);
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
            Intent intent = new Intent(MainPage.this , MainActivity.class);
            startActivity(intent);
        }
    }
    private boolean authenticate()
    {
        return mainlocalDatabase.getUserLoggedIn();
    }

    private void displayContactDetails()
    {
        Profile profile = mainlocalDatabase.getLoggedInUser();
        tv_main_page_username.setText(profile.fullname);
    }

    public void onMainPageClick(View v) {
        if (v.getId() == R.id.timetable_button) {
            Intent sub = new Intent(this, AdminPage.class);
            startActivity(sub);
        }
    }

    public void onLogoutClick(View view){

        mainlocalDatabase.clearData();
        mainlocalDatabase.setUserLoggedIn(false);

        Intent intent = new Intent(MainPage.this , MainActivity.class);
        startActivity(intent);
    }
}
