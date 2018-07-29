package com.dezmembraricata.catadez;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        toolbar();

        populateMeniuList();
    }

    public void toolbar(){
        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle(getResources().getString(R.string.menu));

        //back Button
        //actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    // One of the toolbar icons was clicked
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();


        Intent i = new Intent(MenuActivity.this, MainActivity.class);
        startActivity(i);
        finish();
            // Back icon clicked



        return super.onOptionsItemSelected(item);
    }

    public void populateMeniuList(){
        ArrayList<String> values = new ArrayList<>();

        values.add("Caroserie");
        values.add("Tapiterie");
        values.add("Electrice");
        values.add("Directie");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, values);

        ListView lv = (ListView)findViewById(R.id.listViewMenu);
        lv.setAdapter(adapter);

        //on click
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3){
                listItemClicked(arg2);
            }
        });

    }
    public void listItemClicked(int listenIDCLicked){
        if(listenIDCLicked == 0){
            Toast.makeText(this,"Item 1",Toast.LENGTH_LONG).show();
        }
        else if(listenIDCLicked == 1){
            Toast.makeText(this,"Item 2",Toast.LENGTH_LONG).show();
        }
        else if(listenIDCLicked == 2){
            Toast.makeText(this,"Item 3",Toast.LENGTH_LONG).show();
        }
        else if(listenIDCLicked == 3){
            Toast.makeText(this,"Item 4",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Unknown item",Toast.LENGTH_LONG).show();
        }
    }
}
