package bmu.in.bmuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;

public class aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DocumentView documentView = new DocumentView(this, DocumentView.PLAIN_TEXT);  // Support plain text
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
    }
}
