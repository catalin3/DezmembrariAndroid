package com.dezmembraricata.catadez;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar();
    }

    public void toolbar(){
        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("Welcome!");

        //back Button
        //actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // One of the toolbar icons was clicked
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.navigationSearch) {
            Intent i = new Intent(MainActivity.this, SearchActivity.class);
            startActivity(i);
            finish();
        }
        else if (id == R.id.navigationMenu) {
            Intent i = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(i);
            finish();
        }
        else{
            // Back icon clicked

        }

        return super.onOptionsItemSelected(item);
    }
}
