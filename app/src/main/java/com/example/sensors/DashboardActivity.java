package com.example.sensors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    Button btnAccelo, btnSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnAccelo=findViewById(R.id.btnAccelo);
        btnSensor=findViewById(R.id.btnSensor);


    }
}
