package lib;


import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import net.darkwolfcraft.dwc_server_messenger.MainActivity;

public class AccessPermission {

    private Activity activity;

    public AccessPermission(Activity activity) {
        this.activity = activity;
    }

    public void verifyPermission() {

        final String[] permissions = new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CAMERA,
                Manifest.permission.INTERNET,
                Manifest.permission.BODY_SENSORS,
                Manifest.permission.RECORD_AUDIO,
                Manifest.permission.ACCESS_FINE_LOCATION};

        ActivityCompat.requestPermissions(activity, permissions, 1);

    }

}
