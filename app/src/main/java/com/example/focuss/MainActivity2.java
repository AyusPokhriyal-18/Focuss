package com.example.focuss;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity2 extends AppCompatActivity {
Button bb;
@SuppressLint("ResourceType")
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);
}
    public void openapp(View view){
        bb=findViewById(R.id.bb);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.supercell.clashofclans");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(MainActivity2.this, "It's not installed on your device.", Toast.LENGTH_LONG).show();
        }
    }

    public void openapp3(View view){
        bb=findViewById(R.id.bb);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.king.candycrushsaga");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(MainActivity2.this, "It's not installed on your device.", Toast.LENGTH_LONG).show();
        }
    }
    public void openapp4(View view){
        bb=findViewById(R.id.bb);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.supercell.clashroyale");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(MainActivity2.this, "It's not installed on your device.", Toast.LENGTH_LONG).show();
        }
    }
    public void openapp5(View view){
        bb=findViewById(R.id.bb);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(MainActivity2.this, "It's not installed on your device.", Toast.LENGTH_LONG).show();
        }
    }
    public void openapp6(View view){
        bb=findViewById(R.id.bb);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(MainActivity2.this, "It's not installed on your device.", Toast.LENGTH_LONG).show();
        }
    }
    public void openapp7(View view){
        bb=findViewById(R.id.bb);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(MainActivity2.this, "It's not installed on your device.", Toast.LENGTH_LONG).show();
        }
    }
    public void openapp8(View view){
        bb=findViewById(R.id.bb);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(MainActivity2.this, "It's not installed on your device.", Toast.LENGTH_LONG).show();
        }
    }
    public void openapp9(View view){
        bb=findViewById(R.id.bb);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.twitter.android");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(MainActivity2.this, "It's not installed on your device.", Toast.LENGTH_LONG).show();
        }
    }
    public void openapp10(View view){
        bb=findViewById(R.id.bb);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.snapchat.android");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(MainActivity2.this, "It's not installed on your device.", Toast.LENGTH_LONG).show();
        }
    }
    public void openapp2(View view){
        bb=findViewById(R.id.bb);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.dts.freefireth");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(MainActivity2.this, "It's not installed on your device.", Toast.LENGTH_LONG).show();
        }
    }
}




