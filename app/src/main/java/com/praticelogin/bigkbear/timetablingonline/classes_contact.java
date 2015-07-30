package com.praticelogin.bigkbear.timetablingonline;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by BigKBear on 7/28/15.
 */
public class classes_contact extends Activity {

    SQLiteDatabaseHelper classes_contact_db_helper = new SQLiteDatabaseHelper(classes_contact.this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_teacher);
    }
}
