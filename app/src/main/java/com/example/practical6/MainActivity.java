package com.example.practical6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity {
    ToggleButton t1;
    TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(ToggleButton)findViewById(R.id.t1);
        text1=(TextView)findViewById(R.id.text1);
    }
    public void Display(View view) {
        text1.setText(t1.getText());
    }
}