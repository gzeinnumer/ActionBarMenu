package com.gzeinnumer.actionbarhideitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_1) {
            Toast.makeText(getApplicationContext(), "Menu 1 dipilih!!",Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.menu_2) {
            Toast.makeText(getApplicationContext(), "Menu 2 dipilih!!",Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.menu_3) {
            Toast.makeText(getApplicationContext(), "Aku Suka!!",Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.menu_4) {
            Toast.makeText(getApplicationContext(), "Hay Juga!!",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
