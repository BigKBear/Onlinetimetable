package com.praticelogin.bigkbear.timetablingonline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by BigKBear on 8/2/15.
 */
public class GeneratedTimetable extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generate_timetable);
    }

    public void onMasterFormClick(View v)
    {
        if (v.getId() == R.id.Bmaster_form) {
            Intent sub = new Intent(this, MasterFormTimetable.class);
            startActivity(sub);
        }
    }

    public void onMasterTeacherClick(View v)
    {
        if (v.getId() == R.id.Bmaster_teacher) {
            Intent sub = new Intent(this, MasterTeacherTimetable.class);
            startActivity(sub);
        }
    }
}
