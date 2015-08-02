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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        //fetch the string
        String username = getIntent().getStringExtra("Username");

        //set the text field to that value
        TextView tv = (TextView)findViewById(R.id.main_TVusername);
        tv.setText(username);
    }

    public void onMainPageClick(View v) {
        if (v.getId() == R.id.timetable_button) {
            Intent sub = new Intent(this, AdminPage.class);
            startActivity(sub);
        }
    }
}
