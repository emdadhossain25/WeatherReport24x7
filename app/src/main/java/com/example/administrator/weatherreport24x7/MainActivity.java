package com.example.administrator.weatherreport24x7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (11) Create a field to store the weather display TextView
    TextView tv_weather_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (12) Use findViewById to get a reference to the weather display TextView
        tv_weather_data = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (13) Create an array of Strings that contain fake weather data
        String[] array_strings={"sunny","rainy","hot","cold","too hot","too cold","super sunny",
                "winter is comming", "sunny again", "super duper cold", "too hot","sunny","rainy","hot","cold","too hot","too cold","super sunny",
                "winter is comming", "sunny again", "super duper cold"};

        // TODO (14) Append each String from the fake weather data array to the TextView
        for ( String array_string : array_strings){
            tv_weather_data.append(array_string+"\n\n\n");
        }
    }
}
