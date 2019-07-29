package com.example.messagereceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    private String message;

    @Override
    public void onReceive(Context context, Intent intent) {
        message = intent.getStringExtra("message");
    }

    public String getMessage(){
        if(message != null) {
            return message;
        }
        return "There is no message";
    }


}
