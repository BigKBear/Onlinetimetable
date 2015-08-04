package com.praticelogin.bigkbear.timetablingonline;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity{

    EditText etusername , etpassword;
    LocalDatabase localDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        etusername = (EditText)findViewById(R.id.TFusername_login);
        etpassword = (EditText)findViewById(R.id.TFpassword_login);
        localDatabase = new LocalDatabase(this);


        /*TableLayout tl = (TableLayout)findViewById(R.id.tableLayout1);
        TableRow row = new TableRow(this);
        TextView tv = new TextView(this);
        tv.setText("This is text");

        tl.addView(row);
        row.addView(tv);

        //xml
        <TableLayout android:layout_width="fill_parent"
        android:id="@+id/tableLayout1" android:layout_height="wrap_content">
    </TableLayout>

   */

    }

    public void onRegisterClick(View view)
    {
        Intent intent = new Intent(MainActivity.this , Register.class);
        startActivity(intent);
    }

    public void onLoginClick(View view)
    {
        String username = etusername.getText().toString();
        String password = etpassword.getText().toString();

        Profile profile = new Profile(username,  password);
        Log.e("uname = ", profile.username);
        authenticate(profile);

        //finish();
    }

    public void onViewTableClick(View v)
    {
        Intent intent = new Intent(MainActivity.this , Test.class);
        startActivity(intent);
    }

    private void authenticate(Profile profile)
    {
        ServerRequests serverRequests = new ServerRequests(MainActivity.this);


        serverRequests.fetchDataInBackground(profile, new GetUserCallback() {

            @Override
            public void done(Profile retunedProfile) {
                if (retunedProfile == null) {
                    //show an error message
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username & Password don't match!");
                    builder.setPositiveButton("OK", null);
                    builder.show();
                } else {
                    //Log user in
                    localDatabase.storeData(retunedProfile);
                    localDatabase.setUserLoggedIn(true);

                    Intent intent = new Intent(MainActivity.this, MainPage.class);
                    startActivity(intent);
                }

            }
        });
    }

}
