package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * This app displays my Udacity apps.
 */
public class MainActivity extends ActionBarActivity {

    public Toast toast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the button is clicked.
     */
    public void displayApp(View view) {
        String buttonText = ((Button) view).getText().toString();
        String toastText = "This button will launch my " + buttonText;
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(context, toastText, duration);
        toast.show();
    }

}
