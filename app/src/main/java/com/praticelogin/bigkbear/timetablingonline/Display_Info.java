package com.praticelogin.bigkbear.timetablingonline;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by BigKBear on 7/30/15.
 */
public class Display_Info extends Activity {

    TextView tvfirstname, tvmiddlename, tvlastname, tvaddress, tvhousenumber, tvcellnumber, tvgender, tvrole, tvusername, tvpass1, tvpass2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info);

        tvfirstname = (TextView)findViewById(R.id.PTVfirstname);
        tvmiddlename = (TextView)findViewById(R.id.PTVmiddlename);
        tvlastname = (TextView)findViewById(R.id.PTVlastname);
        tvaddress = (TextView)findViewById(R.id.PTVaddress);
        tvhousenumber = (TextView)findViewById(R.id.PTVhousenumber);
        tvcellnumber = (TextView)findViewById(R.id.PTVcellnumber);
        tvgender = (TextView)findViewById(R.id.PTVgender);
        tvrole = (TextView)findViewById(R.id.PTVrole);
        tvusername = (TextView)findViewById(R.id.PTVusername);
        tvpass1 = (TextView)findViewById(R.id.PTVpass1);
    }

    public void onProfileLogoutClick()
    {

    }
}
