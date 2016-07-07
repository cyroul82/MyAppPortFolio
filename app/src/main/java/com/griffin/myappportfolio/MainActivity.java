package com.griffin.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button moviesButton = null;
    private Button stockButton = null;
    private Button buildBiggerButton = null;
    private Button materialButton = null;
    private Button ubiquitousButton = null;
    private Button capstoneButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);

        moviesButton = (Button)findViewById(R.id.moviesButton);
        moviesButton.setOnClickListener(this);

        stockButton = (Button)findViewById(R.id.stockButton);
        stockButton.setOnClickListener(this);

        buildBiggerButton = (Button)findViewById(R.id.buildBiggerButton);
        buildBiggerButton.setOnClickListener(this);

        materialButton = (Button)findViewById(R.id.materialButton);
        materialButton.setOnClickListener(this);

        ubiquitousButton = (Button)findViewById(R.id.ubiquitousButton);
        ubiquitousButton.setOnClickListener(this);

        capstoneButton = (Button)findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.moviesButton :
                Toast.makeText(MainActivity.this, "This button will launch my movies app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.stockButton :
                Toast.makeText(MainActivity.this, "This button will launch my stock hawk app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildBiggerButton :
                Toast.makeText(MainActivity.this, "This button will launch my build it bigger app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.materialButton :
                Toast.makeText(MainActivity.this, "This button will launch my movimake your app material app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ubiquitousButton :
                Toast.makeText(MainActivity.this, "This button will launch my go ubiquitous app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstoneButton :
                Toast.makeText(MainActivity.this, "This button will launch my casptsone app", Toast.LENGTH_SHORT).show();
                break;
        }


    }
}
