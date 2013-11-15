package com.pmp.holamundo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HolaMundo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hola_mundo, menu);
        return true;
    }
    
}
