package com.example.messagereceiver;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private MyReceiver myReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myReceiver = new MyReceiver();
        registerReceiver(myReceiver, new IntentFilter("CUSTOM_BROADCAST_ACTION"));
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView = findViewById(R.id.text);
        textView.setText(myReceiver.getMessage());
    }
}
