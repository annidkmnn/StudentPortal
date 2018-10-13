package com.example.annikadiekmann.studentportal;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPortal extends AppCompatActivity {

    private EditText mUrlText;
    private EditText mTitleText;
    private Button mAddPortalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_portal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);

        //Init local variables
        mUrlText = findViewById(R.id.urlText);
        mTitleText = findViewById(R.id.titleText);
        mAddPortalButton = findViewById(R.id.addPortalButton);


        mAddPortalButton.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                        String URL = "https://" +  mUrlText.getText().toString();
                        String Title = mTitleText.getText().toString();

                        if (!TextUtils.isEmpty(Title)) {
                            Intent myIntent = new Intent(AddPortal.this, MainActivity.class);
                            myIntent.putExtra("URL", URL);
                            myIntent.putExtra("Title", Title);
                            setResult(Activity.RESULT_OK, myIntent);
                            finish();
                        } else {
                            Toast.makeText(getApplicationContext(), "Enter some data", Toast.LENGTH_LONG).show();
                        }
                }
        });

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
