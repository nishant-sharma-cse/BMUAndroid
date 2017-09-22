package bmu.in.bmuapp;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class LoginStudent extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);

        btn = (Button)findViewById(R.id.btnSingIn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickme();
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void clickme()
    {
        NotificationCompat.Builder mBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.icon)
                        .setContentTitle("Logged in as a Student")
                        .setContentText("Hello Ashish Goyal");
// Gets an instance of the NotificationManager service
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

//to post your notification to the notification bar
        notificationManager.notify(0, mBuilder.build());

        Intent i = new Intent(LoginStudent.this, MainScreen.class);
        startActivity(i);
    }
}
