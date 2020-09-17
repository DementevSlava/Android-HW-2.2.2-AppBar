package com.dementev.appbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_open_notes) {


            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            MainActivity.this.startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_open_payment) {


            Intent intentNotes = new Intent(MainActivity.this, PayActivity.class);
            MainActivity.this.startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_open_country) {


            Intent intentNotes = new Intent(MainActivity.this, CountryActivity.class);
            MainActivity.this.startActivity(intentNotes);
            return true;
        }
        if (id == R.id.action_open_calendar) {


            Intent intentNotes = new Intent(MainActivity.this, CalendarActivity.class);
            MainActivity.this.startActivity(intentNotes);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}