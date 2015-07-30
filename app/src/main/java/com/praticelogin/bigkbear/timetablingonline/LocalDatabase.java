package com.praticelogin.bigkbear.timetablingonline;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by BigKBear on 7/30/15.
 */
public class LocalDatabase {
    public static final String SP_NAME = "User Details";
    SharedPreferences localDatabase;

    public LocalDatabase(Context context)
    {
        localDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeData(profiles_contact contact)
    {
        SharedPreferences.Editor spEditor = localDatabase.edit();
        spEditor.putString("First_name", contact.first_name);
        spEditor.putString("First_name", contact.first_name);

    }

    public profiles_contact getLoggedInuser()
    {

    }

    public void setUserLoggedIn(boolean loggedIn)
    {

    }

    public boolean getUserLoggedIn()
    {

    }

    public void clearData()
    {

    }
}
