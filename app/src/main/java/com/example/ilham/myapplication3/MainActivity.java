package com.example.ilham.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                munculDialog();
            }
        });
    }

    public void munculDialog(){
        Toast toast = Toast.makeText(this.getApplicationContext(),"Hallo Disana",Toast.LENGTH_LONG);
        toast.show();
    }
}
