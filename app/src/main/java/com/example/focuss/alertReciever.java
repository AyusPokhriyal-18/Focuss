package com.example.focuss;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class alertReciever extends BroadcastReceiver {

    private  static final String CHANNEL_ID="Sample_Channnel";

    public void onReceive(Context context, Intent intent) {

       int notificationId=intent.getIntExtra("notificationId",0);
       String message= intent.getStringExtra("message");

        Vibrator vibrator=(Vibrator)context.getSystemService(context.VIBRATOR_SERVICE);
        vibrator.vibrate(2000);


        Intent mainIntent= new Intent(context,MainActivity2.class);
        PendingIntent contentIntent= PendingIntent.getActivity(context,0,mainIntent,0);

        NotificationManager myNotification= (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            CharSequence channel_name="My Notification";
            int importance= NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel= new NotificationChannel(CHANNEL_ID,channel_name,importance);
            myNotification.createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder=new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_baseline_notifications_active_24)
                .setContentTitle("Close now")
                .setContentText(message)
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setContentIntent(contentIntent)
                .setPriority(Notification.PRIORITY_MAX)
                .setDefaults(Notification.DEFAULT_ALL);


        myNotification.notify(notificationId,builder.build());
        Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Ringtone r=RingtoneManager.getRingtone(context,notification);
        r.play();




    }
}
