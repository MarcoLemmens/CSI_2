package com.example.marcolemmens.csi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class CSI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csi);

        Intent intent = getIntent();
        int id = intent.getIntExtra("pos", 0);

        TextView tvName = (TextView) findViewById(R.id.textViewName);

        String[] criminals = getResources().getStringArray(R.array.names);

        String selectedCriminal = criminals[id];

        tvName.setText(selectedCriminal);

    }

    // Start de 2e view op wanneer er op de knop word geklikt

    public void sendMessage(View view) {
        Intent intent = new Intent(this, ReportActivity.class);
        startActivity(intent);
    }


}
