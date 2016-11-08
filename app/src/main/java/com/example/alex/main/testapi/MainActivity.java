package com.example.alex.main.testapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int x;
    private int y;
    private EditText xText ;
    private EditText yText ;
    private Button button;

    protected void task(int x,int y){
        int numToAdd = getSum(y);
        int value = numToAdd + x;
        double root = Math.sqrt(value);
        long round = Math.round(root);
        Toast.makeText(this.getApplicationContext(), "Root value = " +root+" ,closest int value = "+round, Toast.LENGTH_LONG).show();
    }

    protected int getSum(int y){
        if (y < 100 || y > 999)
            throw new IllegalArgumentException("Incorrect y number");
        return (y / 100) + ((y / 100) % 10) + ((y / 10) % 10);
    }

    protected double getRoot(int value){
        if (value < 0)
            throw new IllegalArgumentException("Negative value for root");
        return Math.round(value);
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x = Integer.parseInt(xText.getText().toString());
        y = Integer.parseInt(yText.getText().toString());
        xText = (EditText) findViewById(R.id.xGet);
        yText = (EditText) findViewById(R.id.yGet);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                task(x, y);
            }
        });
    }
}
