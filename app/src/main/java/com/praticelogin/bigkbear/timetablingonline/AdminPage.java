package com.praticelogin.bigkbear.timetablingonline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by BigKBear on 8/1/15.
 */
public class AdminPage extends Activity {

    TextView tvadminname;
    LocalDatabase adminlocalDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_page);

        tvadminname = (TextView)findViewById(R.id.TVadminname);
        adminlocalDatabase = new LocalDatabase(this);
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
            Intent intent = new Intent(AdminPage.this , MainActivity.class);
            startActivity(intent);
        }
    }

    private boolean authenticate()
    {
        return adminlocalDatabase.getUserLoggedIn();
    }

    private void displayContactDetails()
    {
        Profile profile = adminlocalDatabase.getLoggedInUser();
        tvadminname.setText(profile.fullname);
    }


    public void onModifyClassesClick(View v)
    {
        if (v.getId() == R.id.Bmodify_classes) {
            Intent sub = new Intent(this, AssignSubjectsToClasses.class);
            startActivity(sub);
        }
    }

    public void onAssignTeacherClick(View v)
    {
        if (v.getId() == R.id.Bassign_teachers) {
            Intent sub = new Intent(this, AssignTeachers.class);
            startActivity(sub);
        }
    }

    public void onGenerateTimtableClick(View v)
    {
        if (v.getId() == R.id.Bgenerate_timetable) {
            Intent sub = new Intent(this, GeneratedTimetable.class);
            startActivity(sub);
        }
    }

    public void onLogoutClick(View view){

        adminlocalDatabase.clearData();
        adminlocalDatabase.setUserLoggedIn(false);

        Intent intent = new Intent(AdminPage.this , MainActivity.class);
        startActivity(intent);
    }
}

