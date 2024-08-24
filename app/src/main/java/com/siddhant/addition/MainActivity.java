package com.siddhant.addition;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button btn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.buttonAdd);
        num1 = findViewById(R.id.editTextNumber1);
        num2 = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.textViewResult);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value1 = Integer.parseInt(num1.getText().toString());
                int value2 = Integer.parseInt(num2.getText().toString());
                int ans =  value1 + value2;

                result.setText("Result: " + ans);

//
//                try {
//                    // Get input values
//                    String number1 = num1.getText().toString();
//                    String number2 = num2.getText().toString();
//
//                    // Check if inputs are valid
//                    if (!number1.isEmpty() && !number2.isEmpty()) {
//                        int value1 = Integer.parseInt(number1);
//                        int value2 = Integer.parseInt(number2);
//
//                        // Calculate sum
//                        int sum = value1 + value2;
//
//                        // Display result as a string
//                        result.setText("Result: " + sum);
//                    } else {
//                        result.setText("Please enter both numbers.");
//                    }
//                } catch (NumberFormatException e) {
//                    result.setText("Invalid input. Please enter valid numbers.");
//                }
            }
        });

//        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}