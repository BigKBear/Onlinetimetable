package com.praticelogin.bigkbear.timetablingonline;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by BigKBear on 8/1/15.
 */
public class ServerRequests {
    /*
      ProgressDialog progressDialog;
    public static final int CONNECTION_TIMEOUT = 40000;
    public static final String SERVER_ADDRESS = "http://kyleprojectfinal.freeiz.com/";
    //I will be passing a fariable from the MainActivity to set which server is being used

    public ServerRequests(Context context)
    {
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing");
        progressDialog.setMessage("Please wait..");

    }

    public void storeDataInBackground(Contact contact , GetUserCallback callback)
    {
        progressDialog.show();
        new StoreDataAsyncTask(contact, callback).execute();
    }

    public void fetchDataInBackground(Contact contact , GetUserCallback callback)
    {
        progressDialog.show();
        new FetchDataAsyncTask(contact, callback).execute();
    }

    public class StoreDataAsyncTask extends AsyncTask<Void , Void , Void>
    {
        Contact contact;
        GetUserCallback callback;

        public StoreDataAsyncTask(Contact contact , GetUserCallback callback)
        {
            this.contact = contact;
            this.callback = callback;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            ArrayList<NameValuePair> data_to_send = new ArrayList<>();
            data_to_send.add(new BasicNameValuePair("Name" , contact.name));
            data_to_send.add(new BasicNameValuePair("Email" , contact.email));
            data_to_send.add(new BasicNameValuePair("Username" , contact.username));
            data_to_send.add(new BasicNameValuePair("Password" , contact.password));

            HttpParams httpRequestParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpRequestParams , CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpRequestParams , CONNECTION_TIMEOUT);

            HttpClient client = new DefaultHttpClient(httpRequestParams);
            HttpPost post = new HttpPost(SERVER_ADDRESS + "Contacts/RegisterContacts.php");

            try {
                post.setEntity(new UrlEncodedFormEntity(data_to_send));
                client.execute(post);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            progressDialog.dismiss();
            callback.done(null);

            super.onPostExecute(aVoid);
        }
    }

    public class FetchDataAsyncTask extends AsyncTask<Void , Void , Contact>
    {
        Contact contact;
        GetUserCallback callback;

        public FetchDataAsyncTask(Contact contact , GetUserCallback callback)
        {
            this.contact = contact;
            this.callback = callback;
        }


        @Override
        protected Contact doInBackground(Void... voids) {
            ArrayList<NameValuePair> data_to_send = new ArrayList<>();
            data_to_send.add(new BasicNameValuePair("Username" , contact.username));
            data_to_send.add(new BasicNameValuePair("Password" , contact.password));

            HttpParams httpRequestParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpRequestParams , CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpRequestParams , CONNECTION_TIMEOUT);

            HttpClient client = new DefaultHttpClient(httpRequestParams);
            HttpPost post = new HttpPost(SERVER_ADDRESS + "Contacts/FetchContacts.php");

            Contact retunedContact = null;
            try {
                post.setEntity(new UrlEncodedFormEntity(data_to_send));
                HttpResponse httpResponse = client.execute(post);

                HttpEntity entity = httpResponse.getEntity();
                String result = EntityUtils.toString(entity);


                JSONObject jsonObject = new JSONObject(result);
                retunedContact = null;

                if(jsonObject.length() == 0)
                {
                    retunedContact = null;

                }
                else
                {
                    String name,email;
                    name = null;
                    email=null;

                    if(jsonObject.has("name"))
                        name = jsonObject.getString("name");
                    if(jsonObject.has("email"))
                        email =jsonObject.getString("email");

                    retunedContact = new Contact(name , email , contact.username , contact.password);

                }

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

            return retunedContact;
        }
        @Override
        protected void onPostExecute(Contact returnedContact) {
            progressDialog.dismiss();
            callback.done(returnedContact);
            super.onPostExecute(returnedContact);
        }

    }
}
     */
    ProgressDialog progressDialog;
    public static final int CONNECTION_TIMEOUT = 40000;
    public static final String SERVER_ADDRESS = "http://kyleprojectfinal.freeiz.com/";
    //I will be passing a fariable from the MainActivity to set which server is being used

    public ServerRequests(Context context)
    {
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing");
        progressDialog.setMessage("Please wait..");

    }

    public void storeDataInBackground(Profile profile , GetUserCallback callback)
    {
        progressDialog.show();
        new StoreDataAsyncTask(profile, callback).execute();
    }

    public void fetchDataInBackground(Profile profile , GetUserCallback callback)
    {
        progressDialog.show();
        new FetchDataAsyncTask(profile, callback).execute();
    }

    public class StoreDataAsyncTask extends AsyncTask<Void , Void , Void>
    {
        Profile profile;
        GetUserCallback callback;

        public StoreDataAsyncTask(Profile profile , GetUserCallback callback)
        {
            this.profile = profile;
            this.callback = callback;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            ArrayList<NameValuePair> data_to_send = new ArrayList<>();
            data_to_send.add(new BasicNameValuePair("Fullname" , profile.fullname));
            data_to_send.add(new BasicNameValuePair("Email" , profile.email));
            data_to_send.add(new BasicNameValuePair("Address" , profile.address));
            data_to_send.add(new BasicNameValuePair("Housenumber" , profile.housenumber+""));
            data_to_send.add(new BasicNameValuePair("Cellnumber" , profile.cellnumber+""));
            data_to_send.add(new BasicNameValuePair("Username" , profile.username));
            data_to_send.add(new BasicNameValuePair("Password" , profile.password));
            data_to_send.add(new BasicNameValuePair("Role" , profile.role +""));

            HttpParams httpRequestParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpRequestParams , CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpRequestParams , CONNECTION_TIMEOUT);

            HttpClient client = new DefaultHttpClient(httpRequestParams);
            HttpPost post = new HttpPost(SERVER_ADDRESS + "Profiles/ProfileRegister.php");

            try {
                post.setEntity(new UrlEncodedFormEntity(data_to_send));
                client.execute(post);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            progressDialog.dismiss();
            callback.done(null);

            super.onPostExecute(aVoid);
        }
    }

    public class FetchDataAsyncTask extends AsyncTask<Void , Void , Profile>
    {
        Profile profile;
        GetUserCallback callback;

        public FetchDataAsyncTask(Profile profile , GetUserCallback callback)
        {
            this.profile = profile;
            this.callback = callback;
        }


        @Override
        protected Profile doInBackground(Void... voids) {
            ArrayList<NameValuePair> data_to_send = new ArrayList<>();
            data_to_send.add(new BasicNameValuePair("Username" , profile.username));
            data_to_send.add(new BasicNameValuePair("Password" , profile.password));

            HttpParams httpRequestParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpRequestParams , CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpRequestParams , CONNECTION_TIMEOUT);

            HttpClient client = new DefaultHttpClient(httpRequestParams);
            HttpPost post = new HttpPost(SERVER_ADDRESS + "Profiles/FetchProfileData.php");

            Profile retunedProfile = null;
            try {
                post.setEntity(new UrlEncodedFormEntity(data_to_send));
                HttpResponse httpResponse = client.execute(post);

                HttpEntity entity = httpResponse.getEntity();
                String result = EntityUtils.toString(entity);


                JSONObject jsonObject = new JSONObject(result);
                retunedProfile = null;

                if(jsonObject.length() == 0)
                {
                    retunedProfile = null;

                }
                else
                {
                    String fullname, email, address, username, password;
                    int housenumber,cellnumber,role;

                    fullname = email = address = username = password = null;
                    housenumber = cellnumber = role = 0;

                    if(jsonObject.has("fullname"))
                        fullname = jsonObject.getString("fullname");
                    if(jsonObject.has("email"))
                        email =jsonObject.getString("email");
                    if(jsonObject.has("address"))
                        address =jsonObject.getString("address");
                    if(jsonObject.has("username"))
                        username =jsonObject.getString("username");
                    if(jsonObject.has("password"))
                        password =jsonObject.getString("password");
                    if(jsonObject.has("housenumber"))
                        housenumber =jsonObject.getInt("housenumber");
                    if(jsonObject.has("cellnumber"))
                        cellnumber =jsonObject.getInt("cellnumber");
                    if(jsonObject.has("role"))
                        role =jsonObject.getInt("role");

                    retunedProfile = new Profile(fullname , email , address ,  username , password , housenumber, cellnumber, role);

                }

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

            return retunedProfile;
        }
        @Override
        protected void onPostExecute(Profile returnedProfile) {
            progressDialog.dismiss();
            callback.done(returnedProfile);
            super.onPostExecute(returnedProfile);
        }

    }
}