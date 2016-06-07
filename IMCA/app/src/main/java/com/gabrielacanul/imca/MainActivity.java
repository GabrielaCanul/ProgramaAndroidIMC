package com.gabrielacanul.imca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3= (EditText)findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                double peso = Double.parseDouble(s);
                s = editText2.getText().toString();
                double est = Double.parseDouble(s);
                double imc = peso / (est * est);
                editText3.setText(Double.toString(imc));

            }
        }){

        }

    }
}
