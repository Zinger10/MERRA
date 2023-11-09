package com.example.merra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Tracker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);

        // Find the returnButton by its ID
        Button returnButton = findViewById(R.id.returnButton);

        // Set an OnClickListener for the returnButton
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create an Intent to navigate to MainActivity
                Intent intent = new Intent(Tracker.this, MainActivity.class);

                // Start the MainActivity
                startActivity(intent);
            }
        });
    }
}
