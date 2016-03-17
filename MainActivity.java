package com.shu.yangshiming.myservice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // start a IntentService
//        Intent intent = new Intent(this,HelloIntentService.class);
//        startService(intent);

        // start a Service
        Intent intent = new Intent(this,HelloService.class);
        startService(intent);

    }

}
