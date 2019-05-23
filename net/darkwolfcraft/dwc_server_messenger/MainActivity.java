package net.darkwolfcraft.dwc_server_messenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import lib.AccessPermission;
import lib.Notify;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //ToDo:auf floobits laden...

    /*richtige mit mysql
    frontend und backend
    key vertification oder sms
    schickes overlay
    menü und können wie whatsapp
    alles aber kommentieren... und eigene klassen
    und alles mit icons
    autoscale, autoformat also quer oder ned, eula, rechte auf dateien, cam, audio, etc., emojis
    * */

    //überall eigene icons wos passt...
    /*Upload function:
    * https://www.youtube.com/watch?v=h62bcMwahTU
    *
    * //wie datenbank?
    * wie front und backend?
    * ob er internet hat
    * rechte auf eigene dateien bilder etc.
    * ...:
    *
    * Zoller:
    * app mit startseite bzw kunden mitarbeiter und admin bereich und die auch nochmal schick untergliedern
    * webseite intranet kundenbewertung und support?
    * tms per app steuerbar?
    *
    *
    * */



    Button mainlogin;
    Button Main_Register;
    Button Main_Option_Profile;
    Button Main_Option_Desighn;
    Button Main_Option;

    AccessPermission accessPermission = new AccessPermission(this);
   // Notify notify = new Notify();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_page);
        // setContentView(R.layout.activity_main); //Default

        mainlogin = findViewById(R.id.mainlogin);
        Main_Register = findViewById(R.id.Main_Register);
        Main_Option_Profile = findViewById(R.id.Main_Option_Profile);
        Main_Option_Desighn = findViewById(R.id.Main_Option_Desighn);
        Main_Option = findViewById(R.id.Main_Option);

        mainlogin.setOnClickListener(this);
        Main_Register.setOnClickListener(this);
        Main_Option_Profile.setOnClickListener(this);
        Main_Option_Desighn.setOnClickListener(this);
        Main_Option.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){

        accessPermission.verifyPermission();
        //notify.notifyThis("lol", "LOL");

        switch (view.getId()){

            case R.id.mainlogin:
                setContentView(R.layout.login_page);
                break;

            case R.id.Main_Register:
                setContentView(R.layout.register_page);
                break;

            case R.id.Main_Option_Profile:
                setContentView(R.layout.option_page);
                break;

            case R.id.Main_Option_Desighn:
                setContentView(R.layout.profile_setting_page);
                break;

            case R.id.Main_Option:
                setContentView(R.layout.desighn_setting_page);
                break;

            default:
                //text sichtbar machen dass ...
                break;

        }

    }

}
