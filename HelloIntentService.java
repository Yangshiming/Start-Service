package com.shu.yangshiming.myservice;

import android.app.IntentService;
import android.content.Intent;
import android.os.Debug;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by yangshiming on 2016/3/17.
 */

/*
*   IntentService
* This is a subclass of Service that uses a worker thread to handle all start requests, one at a time. This is the best option if you don't require that
* your service handle multiple requests simultaneously. All you need to do is implement onHandleIntent(), which receives the intent for each start request
* so you can do the background work.
* */

public class HelloIntentService extends IntentService {

    /*
    * A constructor is required, and must call the super IntentService(String)
    * constructor with a name for the worker thread.
    * */
    public HelloIntentService() {
        super("hello");
    }


    /*
     * The IntentService calls this method from the default worker thread with
     * the intent that started the service. When this method returns, IntentService
     * stops the service, as appropriate.
     */
    @Override
    protected void onHandleIntent(Intent intent) {
        // Normally we would do some work here, like download a file.
        // For our sample, we just sleep for 5 seconds.
        try {
            Log.i("hello","onHandleIntent is runing");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Restore interrupt status.
            Thread.currentThread().interrupt();
        }
    }

    /*
    * onStartCommand() must return the default
     * implementation (which is how the intent gets delivered to onHandleIntent()):
    * */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("hello","onStartCommand is runing");
        Toast.makeText(this,"onStartCommand is Runing",Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }
}
