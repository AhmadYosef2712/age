package com.example.age;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText eName,eYear;
    private TextView showDetails;
    private int year;
    private String name,details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        eName=findViewById(R.id.eName);
        eYear=findViewById(R.id.eYear);
        showDetails=findViewById(R.id.showDetails);

    }

    public void Show(View view) {
        if (eName.getText().toString().isEmpty()|| eYear.getText().toString().isEmpty()){
            Toast.makeText(this, "please fill ", Toast.LENGTH_LONG).show();}
        else{
            name=eName.getText().toString();
            year=Integer.parseInt(eYear.getText().toString());
            int age=2024-year;
            details="welcome "+name +"\nYour age is"+age;
            showDetails.setText(details);
        }
    }
}