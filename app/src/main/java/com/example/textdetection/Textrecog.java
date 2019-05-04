package com.example.textdetection;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;

public class Textrecog extends Application {
    public static final  String RESULT_TEXT = "RESULT_TEXT";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }


}
