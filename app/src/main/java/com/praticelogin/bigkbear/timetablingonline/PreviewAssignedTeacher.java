package com.praticelogin.bigkbear.timetablingonline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by BigKBear on 8/3/15.
 */
public class PreviewAssignedTeacher extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview_assigned_teachers);
    }

    public void onAssignTeacherClick(View v){
        Intent intent = new Intent(PreviewAssignedTeacher.this , AssignTeachers.class);
        startActivity(intent);
    }
}
