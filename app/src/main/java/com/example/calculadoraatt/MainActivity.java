package com.example.calculadoraatt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1, num2, res;
    Button bntSomar, btnSub, btnMult, btnDiv;
    TextView textResult;
    EditText editValor1, editValor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button bntSomar=(Button)findViewById(R.id.bntSomar);
        Button btnSub=(Button)findViewById(R.id.btnSub);
        Button btnMult=(Button)findViewById(R.id.btnMult);
        Button btnDiv=(Button)findViewById(R.id.btnDiv);

        TextView textResult=(TextView)findViewById(R.id.textResult);
        EditText editValor1=(EditText)findViewById(R.id.editValor1);
        EditText editValor2=(EditText)findViewById(R.id.editValor2);


    bntSomar.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){

            num1 = Double.parseDouble(editValor1.getText().toString());
            num2 = Double.parseDouble(editValor2.getText().toString());
            res = num1 + num2;

            textResult.setText(String.valueOf(res));
        }

    });

    btnSub.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v) {
            num1 = Double.parseDouble(editValor1.getText().toString());
            num2 = Double.parseDouble(editValor2.getText().toString());
            res = num1 - num2;

            textResult.setText(String.valueOf(res));

        }

    });

    btnMult.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v) {

            num1 = Double.parseDouble(editValor1.getText().toString());
            num2 = Double.parseDouble(editValor2.getText().toString());
            res = num1 * num2;

            textResult.setText(String.valueOf(res));

        }

    });

    btnDiv.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v) {
            num1 = Double.parseDouble(editValor1.getText().toString());
            num2 = Double.parseDouble(editValor2.getText().toString());
            res = num1 / num2;

            textResult.setText(String.valueOf(res));

        }

    });

    }
}