package com.praticelogin.bigkbear.timetablingonline;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by BigKBear on 7/30/15.
 */
public class LocalDatabase {
    /*public static final String SP_NAME = "User Details";
    SharedPreferences localDatabase;

    public LocalDatabase(Context context)
    {
        localDatabase = context.getSharedPreferences(SP_NAME, 0);
    }

    public void storeData(Contact contact)
    {
        SharedPreferences.Editor spEditor = localDatabase.edit();
        //Table in db and variables fron contact class
        spEditor.putString("first_name", contact.first_name);
        spEditor.putString("middle_name", contact.middle_name);
        spEditor.putString("last_name", contact.last_name);
        spEditor.putString("address", contact.address);
        spEditor.putInt("house_number", contact.house_number);
        spEditor.putInt("cell_number", contact.cell_number);
        spEditor.putString("gender", contact.gender);
        spEditor.putString("username", contact.username);
        spEditor.putString("password", contact.password);
        spEditor.putInt("role_role_id", contact.role_role_id);
        spEditor.commit();
    }

    public Contact getLoggedInuser()
    {
        String first_name = localDatabase.getString("first_name","");
        String middle_name = localDatabase.getString("middle_name","");
        String last_name = localDatabase.getString("last_name","");
        String address = localDatabase.getString("address","");
        String house_number = localDatabase.getString("house_number","");
        String cell_number = localDatabase.getString("cell_number","");
        String gender = localDatabase.getString("gender","");
        String username = localDatabase.getString("username","");
        String password = localDatabase.getString("password","");
        String role_role_id = localDatabase.getString("role_role_id","");

        Contact storedContact = new Contact(username, password);
        return storedContact;

    }

    public void setUserLoggedIn(boolean loggedIn)
    {
        SharedPreferences.Editor spEditor = localDatabase.edit();
        spEditor.putBoolean("loggedIn", loggedIn);
        spEditor.commit();

    }

    public boolean getUserLoggedIn()
    {
        if(localDatabase.getBoolean("loggedIn", false))
            return true;
        else
            return false;

    }

    public void clearData()
    {
        SharedPreferences.Editor spEditor = localDatabase.edit();
        spEditor.clear();
        spEditor.commit();

    }
    */

    public static final String SP_NAME = "ProfileDetails";
    SharedPreferences localDatabase;

    public LocalDatabase(Context context)
    {
        localDatabase = context.getSharedPreferences(SP_NAME , 0);
    }

    public void storeData(Contact contact)
    {
        SharedPreferences.Editor spEditor = localDatabase.edit();
        spEditor.putString("first_name", contact.first_name);
        spEditor.putString("middle_name", contact.middle_name);
        spEditor.putString("last_name", contact.last_name);
        spEditor.putString("address", contact.address);
        spEditor.putInt("house_number", contact.house_number);
        spEditor.putInt("cell_number", contact.cell_number);
        spEditor.putString("gender", contact.gender);
        spEditor.putString("username", contact.username);
        spEditor.putString("password", contact.password);
        spEditor.putInt("role_role_id", contact.role_role_id);
        spEditor.commit();
    }

    public Contact getLoggedInUser()
    {
        String first_name = localDatabase.getString("first_name","");
        String middle_name = localDatabase.getString("middle_name","");
        String last_name = localDatabase.getString("last_name","");
        String address = localDatabase.getString("address","");
        String house_number = localDatabase.getString("house_number","");
        String cell_number = localDatabase.getString("cell_number","");
        String gender = localDatabase.getString("gender","");
        String username = localDatabase.getString("username","");
        String password = localDatabase.getString("password","");
        String role_role_id = localDatabase.getString("role_role_id","");

        Contact storedContact = new Contact(username, password);
        return storedContact;
    }

    public void setUserLoggedIn(boolean loggedIn)
    {
        SharedPreferences.Editor spEditor = localDatabase.edit();
        spEditor.putBoolean("loggedIn" , loggedIn);
        spEditor.commit();

    }

    public boolean getUserLoggedIn()
    {
        if(localDatabase.getBoolean("loggedIn" , false))
            return true;
        else
            return false;
    }

    public void clearData()
    {
        SharedPreferences.Editor spEditor = localDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
