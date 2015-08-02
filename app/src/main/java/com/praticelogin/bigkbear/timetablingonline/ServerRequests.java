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
    public static final int CONNECTION_TIMEOUT = 15000;
    public static final String SERVER_ADDRESS = "http://techacademy.netau.net/";

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
            HttpPost post = new HttpPost(SERVER_ADDRESS + "Register.php");

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
            HttpPost post = new HttpPost(SERVER_ADDRESS + "FetchUserData.php");

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
    */
    ProgressDialog progressDialog;
    public static final int CONNECTION_TIMEOUT = 40000;
    public static final String SERVER_ADDRESS = "http://kyleprojectfinal.freeiz.com/";
    //I need to create my own server and php files

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

        /*
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.address = address;
        this.gender=gender;
        this.username=username;
        this.password=password;
        this.house_number=house_number;
        this.cell_number=cell_number;
        this.role_role_id=role_role_id;
        */
        @Override
        protected Void doInBackground(Void... voids) {
            ArrayList<NameValuePair> data_to_send = new ArrayList<>();
            data_to_send.add(new BasicNameValuePair("Name" , contact.first_name));
            data_to_send.add(new BasicNameValuePair("Email" , contact.middle_name));
            data_to_send.add(new BasicNameValuePair("Email" , contact.last_name));
            data_to_send.add(new BasicNameValuePair("Email" , contact.address));
            data_to_send.add(new BasicNameValuePair("Email" , contact.gender));
            data_to_send.add(new BasicNameValuePair("Username" , contact.username));
            data_to_send.add(new BasicNameValuePair("Password" , contact.password));
            data_to_send.add(new BasicNameValuePair("Password" , contact.house_number + ""));
            data_to_send.add(new BasicNameValuePair("Password" , contact.cell_number + ""));
            data_to_send.add(new BasicNameValuePair("Password" , contact.role_role_id + ""));

            HttpParams httpRequestParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpRequestParams , CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpRequestParams , CONNECTION_TIMEOUT);

            HttpClient client = new DefaultHttpClient(httpRequestParams);
            HttpPost post = new HttpPost(SERVER_ADDRESS + "ProfileRegister.php");

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
            HttpPost post = new HttpPost(SERVER_ADDRESS + "FetchProfileData.php");

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
                    int profiles_id, house_number, cell_number, role_role_id;
                    String first_name, middle_name, last_name, address, gender, username, password;

                    first_name = null;
                    middle_name = null;
                    last_name = null;
                    address = null;
                    gender = null;
                    house_number = 0;
                    cell_number = 0;
                    role_role_id = 0;

                    if(jsonObject.has("first_name"))
                        first_name = jsonObject.getString("first_name");
                    if(jsonObject.has("middle_name"))
                        middle_name =jsonObject.getString("middle_name");
                    if(jsonObject.has("last_name"))
                        last_name =jsonObject.getString("last_name");
                    if(jsonObject.has("address"))
                        address =jsonObject.getString("address");
                    if(jsonObject.has("gender"))
                        gender =jsonObject.getString("gender");
                    if(jsonObject.has("house_number"))
                        house_number =jsonObject.getInt("house_number");
                    if(jsonObject.has("cell_number"))
                        cell_number =jsonObject.getInt("cell_number");
                    if(jsonObject.has("role_role_id"))
                        role_role_id =jsonObject.getInt("role_role_id");

                    retunedContact = new Contact(first_name, middle_name, last_name, address, gender,  contact.username , contact.password,
                            house_number,cell_number,role_role_id);

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
