package com.project.androidnanodegree;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.content.*;
import android.view.*;
import android.widget.*;

/**
 * author: Frank Lin
 */
public class Project0 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_project0, menu);
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

    /**
     * Helper method to display toast message.
     *
     * @param text
     */
    private void showToast(CharSequence text) {
        if (null != text && text.length() > 0) {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    public void clickButtonAction(View view) {
        CharSequence text = null;
        switch (view.getId()) {
            case R.id.spotifyButton:
                text = "This button will launch Spotify Streamer";
                break;
            case R.id.scoresButton:
                text = "This button will launch Scores App";
                break;
            case R.id.libraryButton:
                text = "This button will launch Library App";
                break;
            case R.id.buildBiggerButton:
                text = "This button will launch Build It Bigger App";
                break;
            case R.id.baconButton:
                text = "This button will launch Bacon Reader app";
                break;
            case R.id.capstoneButton:
                text = "This button will launch Capstone App";
                break;
        }
        showToast(text);
    }

}
