package com.example.sleeper.myapplication;

import android.util.Log;
import com.loopj.android.http.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;


public class BusinessLayer {

    public void getData(JsonHttpResponseHandler responseHandler){
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("https://randomuser.me/api/?results=50", responseHandler);
    }
}
