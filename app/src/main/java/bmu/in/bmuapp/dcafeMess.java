package bmu.in.bmuapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dcafeMess extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcafe_mess);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void menuopen(View v)
    {
        Intent i = new Intent(dcafeMess.this, dcafemenu.class);
        startActivity(i);
    }
}
