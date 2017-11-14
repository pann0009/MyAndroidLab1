package com.example.gurleen.myandroidlab;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ListItemActivity extends Activity {
    protected static final String ACTIVITY_NAME = "ListItemActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);
        Log.i(ACTIVITY_NAME, "In onCreate()");
    }
    public void onResume() {

        super.onResume();
        Log.i(ACTIVITY_NAME, "In onResume()");
    }
    public void	onStart() {

        super.onStart();
        Log.i(ACTIVITY_NAME, "In onStart()");
    }
    public void onPause() {

        super.onPause();
        Log.i(ACTIVITY_NAME, "In onCreate()");
    }
    public void onStop() {

        super.onStop();
    }
    public void onDestroy() {

        super.onDestroy();
    }

}
