package com.praticelogin.bigkbear.timetablingonline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by BigKBear on 8/3/15.
 */
public class PreviewAssignedClasses extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview_assigned_classes);
    }

    public void onAssignClassesClick(View v){
        Intent intent = new Intent(PreviewAssignedClasses.this , AssignClasses.class);
        startActivity(intent);
    }
}
