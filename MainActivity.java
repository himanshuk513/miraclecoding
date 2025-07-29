package com.miraclecoding;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText userInput;
    Button generateCodeBtn;
    TextView outputCode;
    AIEngine engine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = findViewById(R.id.inputText);
        generateCodeBtn = findViewById(R.id.generateBtn);
        outputCode = findViewById(R.id.outputText);
        engine = new AIEngine();

        generateCodeBtn.setOnClickListener(view -> {
            String input = userInput.getText().toString();
            String code = engine.generateCode(input);
            outputCode.setText(code);
        });
    }
}
