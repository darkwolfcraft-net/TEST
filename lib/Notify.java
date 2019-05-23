package lib;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.media.RingtoneManager;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import net.darkwolfcraft.dwc_server_messenger.R;

public class Notify extends AppCompatActivity {

    public void NotifyTopbar(){

        String title = "Test Header";
        String subject = "Test Subject";
        String body = "Test Body";

notifyThis("lol", "lol");

       // NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
       // Notification notification = new Notification.Builder(getApplicationContext()).setContentTitle(title).setContentText(body).setContentTitle(subject).setSmallIcon(R.drawable.dwc_logo_round).getNotification();
      //  notification.flags |= Notification.FLAG_AUTO_CANCEL;
       // notificationManager.notify(0, notification);

    }

    public void metho(){

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.dwc_logo_round)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!");

        mBuilder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION));

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, mBuilder.build());

    }

    //VORLAGE NEHMEN
    public void notifyThis(String title, String message) {
        NotificationCompat.Builder b = new NotificationCompat.Builder(this.getApplicationContext());
        b.setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.drawable.dwc_logo_round)
                .setTicker("{your tiny message}")
                .setContentTitle(title)
                .setContentText(message)
                .setContentInfo("INFO");

        NotificationManager nm = (NotificationManager) this.getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT < 16) {
            nm.notify(1, b.getNotification());
        }else{
            nm.notify(1, b.build());
        }
    }

}
