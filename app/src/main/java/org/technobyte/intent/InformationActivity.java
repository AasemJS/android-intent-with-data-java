package org.technobyte.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        //creating text views for the data we are getting from the intent

        TextView n = (TextView) findViewById(R.id.labelName);
        TextView a = (TextView) findViewById(R.id.labelAddress);
        TextView p = (TextView) findViewById(R.id.labelProfession);
        TextView d = (TextView) findViewById(R.id.labelDJ);
        TextView f = (TextView) findViewById(R.id.labelFF);
        Intent ii = getIntent();
        Bundle b = ii.getExtras();

        //this will throw a fatal error if there isn't any data, so we make sure to execute this if there is some bundle
        if (b != null) {
            String aa = (String) b.get("name");
            n.setText(aa);
            String bb = (String) b.get("address");
            a.setText(bb);
            String cc = (String) b.get("profession");
            p.setText(cc);
            String dd = (String) b.get("dreamjob");
            d.setText(dd);
            String ee = (String) b.get("favefood");
            f.setText(ee);
        }

    }




}