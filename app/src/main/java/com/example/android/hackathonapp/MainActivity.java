package com.example.android.hackathonapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    ArrayList<String> items = new ArrayList<String>();
    ArrayList<String> quantities = new ArrayList<String>();
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, ListActivity.class);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText itemEditText  = (EditText)findViewById(R.id.item_edit_text);
                String item = itemEditText.getText().toString();
                items.add(item);
                itemEditText.setText("");

                EditText quantityEditText  = (EditText)findViewById(R.id.quantity_edit_text);
                String quantity = quantityEditText.getText().toString();
                quantities.add(quantity);
                quantityEditText.setText("");

                Toast toast = Toast.makeText(getApplicationContext(), "Added to list.", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String[] itemsArray = new String[items.size()];
                String[] quantitiesArray = new String[quantities.size()];

                for (int i = 0; i < items.size(); i++) {
                    itemsArray[i] = items.get(i);
                    quantitiesArray[i] = quantities.get(i);
                }

                Bundle extras = new Bundle();
                extras.putStringArray("items", itemsArray);
                extras.putStringArray("quantities", quantitiesArray);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
