package com.praticelogin.bigkbear.timetablingonline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by BigKBear on 7/28/15.
 */
public class Main_page extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        //fetch the string
        String username = getIntent().getStringExtra("Username");

        //set the text field to that value
        TextView tv = (TextView)findViewById(R.id.TVusername);
        tv.setText(username);
    }

    public void onMainPageClick(View v) {
        if (v.getId() == R.id.sub_button) {
            Intent sub = new Intent(this, Teacher_Substution.class);
            startActivity(sub);
        }
    }
}