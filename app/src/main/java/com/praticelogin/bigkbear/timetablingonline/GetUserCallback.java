package com.praticelogin.bigkbear.timetablingonline;

/**
 * Created by BigKBear on 8/1/15.



 public interface GetUserCallback {
 public abstract void done(Contact returnedContact);
 }

 */
public interface GetUserCallback {
    public abstract void done(Profile returnedProfile);
}