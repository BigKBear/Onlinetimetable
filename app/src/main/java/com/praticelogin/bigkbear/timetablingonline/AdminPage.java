package com.praticelogin.bigkbear.timetablingonline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by BigKBear on 8/1/15.
 */
public class AdminPage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_page);
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
}
