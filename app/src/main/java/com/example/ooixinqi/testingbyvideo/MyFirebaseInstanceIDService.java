package com.example.ooixinqi.testingbyvideo;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by ooixinqi on 03/12/2016.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService{
    private static final String TAG = "MyFirebaseInstanceIDService";

    @Override
    public void onTokenRefresh() {
        //Get updated token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "New Token: " + refreshedToken);

        //You can save the token into third party server
    }
}
