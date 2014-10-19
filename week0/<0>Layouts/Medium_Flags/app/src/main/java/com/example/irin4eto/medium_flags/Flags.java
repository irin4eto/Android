package com.example.irin4eto.medium_flags;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.util.Random;


public class Flags extends Activity {

    Random random;
    private Button firstButton;
    private Button secondButton;
    private Button thirdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flags);

        random = new Random();
    }

    @Override
    protected void onStart() {
        super.onStart();

        final int[] rainbow = getResources().getIntArray(R.array.rainbow);

        firstButton = (Button) findViewById(R.id.firstPicture);
        secondButton = (Button) findViewById(R.id.secondPicture);
        thirdButton = (Button) findViewById(R.id.trirdPicture);

        firstButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int randomInteger = random.nextInt(rainbow.length);
                firstButton.setBackgroundColor(rainbow[randomInteger]);
            }
        });

        secondButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int randomInteger = random.nextInt(rainbow.length);
                secondButton.setBackgroundColor(rainbow[randomInteger]);
            }
        });

        thirdButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int randomInteger = random.nextInt(rainbow.length);
                thirdButton.setBackgroundColor(rainbow[randomInteger]);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.flags, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
