package com.praticelogin.bigkbear.timetablingonline;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by BigKBear on 7/30/15.
 */
public class LocalDatabase {
    /*
      public static final String SP_NAME = "UserDetails";
    SharedPreferences localDatabase;

    public LocalDatabase(Context context)
    {
        localDatabase = context.getSharedPreferences(SP_NAME , 0);
    }

    public void storeData(Contact contact)
    {
        SharedPreferences.Editor spEditor = localDatabase.edit();
        spEditor.putString("Name" , contact.name);
        spEditor.putString("Email" , contact.email);
        spEditor.putString("Username" , contact.username);
        spEditor.putString("Password" , contact.password);
        spEditor.commit();
    }

    public Contact getLoggedInUser()
    {
        String name = localDatabase.getString("Name" , "");
        String email = localDatabase.getString("Email" , "");
        String username = localDatabase.getString("Username" , "");
        String password = localDatabase.getString("Password" , "");

        Contact storedContact = new Contact(name , email , username , password);
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
    */

    public static final String SP_NAME = "ProfileDetails";
    SharedPreferences localDatabase;

    public LocalDatabase(Context context)
    {
        localDatabase = context.getSharedPreferences(SP_NAME , 0);
    }

    public void storeData(Profile profile)
    {
        SharedPreferences.Editor spEditor = localDatabase.edit();
        spEditor.putString("Fullname" , profile.fullname);
        spEditor.putString("Email" , profile.email);
        spEditor.putInt("Housenumber", profile.housenumber);
        spEditor.putInt("Cellnumber", profile.cellnumber);
        spEditor.putString("Address", profile.address);
        spEditor.putString("Username" , profile.username);
        spEditor.putString("Password" , profile.password);
        spEditor.putInt("Role", profile.role);
        spEditor.commit();
    }

    public Profile getLoggedInUser()
    {
        String fullname = localDatabase.getString("Fullname" , "");
        String email = localDatabase.getString("Email" , "");
        Integer housenumber = localDatabase.getInt("Housenumber", 0);
        Integer cellnumber = localDatabase.getInt("Cellnumber" , 0);
        String address = localDatabase.getString("Address", "");
        String username = localDatabase.getString("Username" , "");
        String password = localDatabase.getString("Password" , "");
        Integer role = localDatabase.getInt("Role", 0);

        Profile storedProfile = new Profile(fullname , email , address ,  username , password , housenumber, cellnumber, role);
        return storedProfile;
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