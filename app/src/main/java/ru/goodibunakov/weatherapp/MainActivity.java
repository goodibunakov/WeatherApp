package ru.goodibunakov.weatherapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView temp = (TextView) findViewById(R.id.temperature);
        temp.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/HelveticaNeueCyr-UltraLight.otf"));
        TextView sky = (TextView) findViewById(R.id.sky);
        sky.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/weather.ttf"));
        TextView gradus = (TextView) findViewById(R.id.gradus);
        gradus.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/HelveticaNeueCyr-UltraLight.otf"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}
