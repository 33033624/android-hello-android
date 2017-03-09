package com.example.asuper.helloanroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button hellobtn =(Button)findViewById(R.id.hellobutton);
        hellobtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                TextView hellotv = (TextView)findViewById(R.id.hellotextView);
                Toast.makeText(MainActivity.this,"hahaha",Toast.LENGTH_SHORT).show();
                hellotv.setText("我是改变后的文字");
            }
        });
    }
}
