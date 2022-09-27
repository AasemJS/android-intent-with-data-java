package org.technobyte.intent;

// import all required classes
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking up ui elements in the code
        EditText labelName = (EditText) findViewById(R.id.editName);
        EditText labelAddress = (EditText) findViewById(R.id.editAddress);
        EditText labelProfession = (EditText) findViewById(R.id.editProfession);
        EditText labelDreamJob = (EditText) findViewById(R.id.editDreamJob);
        EditText labelFaveFood = (EditText) findViewById(R.id.editFavFood);
        Button uploadBtn = (Button) findViewById(R.id.btnUpload);

        //creating a new function to execute when button is clicked
        uploadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = labelName.getText().toString();
                String address = labelAddress.getText().toString();
                String profession = labelProfession.getText().toString();
                String dreamjob = labelDreamJob.getText().toString();
                String favefood = labelFaveFood.getText().toString();
                Intent i = new Intent(getApplicationContext(), InformationActivity.class);
                //adding data to the intent to be used in the second activity
                i.putExtra("name", name);
                i.putExtra("address", address);
                i.putExtra("profession", profession);
                i.putExtra("dreamjob", dreamjob);
                i.putExtra("favefood", favefood);
                MainActivity.this.startActivity(i);
            }
        });

    }
}