package com.example.focuss;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.app.NotificationCompat;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
Button bb;
private int notificationId=1;

@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);
    findViewById(R.id.butn).setOnClickListener(MainActivity2.this);
    findViewById(R.id.gobtn).setOnClickListener(MainActivity2.this);


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


    @Override
    public void onClick(View v) {
       EditText editText=findViewById(R.id.editText);
        TimePicker timePicker =(TimePicker)findViewById(R.id.timePicker);

        Intent i= new Intent(MainActivity2.this, alertReciever.class);
        i.putExtra("notificationId", notificationId);
        i.putExtra("message",editText.getText().toString());

        PendingIntent pendingIntent= PendingIntent.getBroadcast(MainActivity2.this,0,i,PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager alarmManager=(AlarmManager)getSystemService(ALARM_SERVICE);

        switch (v.getId()){
            case R.id.gobtn:
                int hour= timePicker.getCurrentHour();
                int minute=timePicker.getCurrentMinute();

                Calendar startTime= Calendar.getInstance();
                startTime.set(Calendar.HOUR_OF_DAY,hour);
                startTime.set(Calendar.MINUTE,minute);
                startTime.set(Calendar.SECOND,0);
                long alarmStartTime= startTime.getTimeInMillis();


                alarmManager.set(AlarmManager.RTC_WAKEUP, alarmStartTime,pendingIntent);
                Toast.makeText(this, "Done!", Toast.LENGTH_SHORT).show();
                break;

            case  R.id.butn:
                alarmManager.cancel(pendingIntent);
                Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show();
                break;

        }




    }
}




