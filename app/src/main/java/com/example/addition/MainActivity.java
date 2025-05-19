package com.example.addition;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText1, editText2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Set content view first

        // Initialize views after setting the content view
        button = findViewById(R.id.button);
        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);
        textView = findViewById(R.id.textView);

        // Button click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    int num1 = Integer.parseInt(editText1.getText().toString());
                    int num2 = Integer.parseInt(editText2.getText().toString());
                    int sum = num1 + num2;
                    textView.setText("Result: " + sum);
                    Toast.makeText(MainActivity.this, "Addition Successful", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
