package com.introtoandroid.stockquotes_durham;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import edu.cofc.stock.*;

public class MainActivity extends AppCompatActivity {

    EditText nameInput;
    TextView symbolOutput;
    TextView nameOutput;
    TextView priceOutput;
    TextView timeOutput;
    TextView changeOutput;
    TextView weekOutput;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = (EditText) findViewById(R.id.nameInput);
        symbolOutput = findViewById(R.id.symbolOutput);
        nameOutput = findViewById(R.id.nameOutput);
        priceOutput = findViewById(R.id.priceOutput);
        timeOutput = findViewById(R.id.timeOutput);
        changeOutput = findViewById(R.id.changeOutput);
        weekOutput = findViewById(R.id.weekOutput);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String input = nameInput.getText().toString();
        savedInstanceState.putString("input", input);
        savedInstanceState.putString("symbol", symbolOutput.getText().toString());
        savedInstanceState.putString("name", nameOutput.getText().toString());
        savedInstanceState.putString("price", priceOutput.getText().toString());
        savedInstanceState.putString("time", timeOutput.getText().toString());
        savedInstanceState.putString("change", changeOutput.getText().toString());
        savedInstanceState.putString("week", weekOutput.getText().toString());
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        nameInput.setText(outState.getString("input"));
        symbolOutput.setText(outState.getString("symbol"));
        nameOutput.setText(outState.getString("name"));
        priceOutput.setText(outState.getString("price"));
        timeOutput.setText(outState.getString("time"));
        changeOutput.setText(outState.getString("change"));
        weekOutput.setText(outState.getString("week"));
    }
}
