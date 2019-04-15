package com.example.numtowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Et_Value;
    private Button Btn_Convert;
    private TextView Tv_Output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et_Value = findViewById(R.id.Et_Value);
        Tv_Output = findViewById(R.id.Tv_Output);
        Btn_Convert = findViewById(R.id.Btn_Convert);

        Btn_Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(Et_Value.getText().toString());
                Convert c = new Convert();
                if (num<=10000000) {
                    String res = c.convert(num);
                    Tv_Output.setText(res);
                }else{
                    Tv_Output.setText("High number of length");
                }
            }
        });

    }

}

