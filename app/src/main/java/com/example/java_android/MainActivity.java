package com.example.java_android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText name;
TextView show;
Button start;
ImageView image;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.et_name);
        show=findViewById(R.id.txt_name);
        start=findViewById(R.id.btn_start);
        image=findViewById(R.id.iv_image);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=name.getText().toString();
                show.setText(username);
                char firstChar=username.charAt(0);
                if (Character.isUpperCase(firstChar))
                {
                    image.setImageResource(R.drawable.sea);
                }else {
                    image.setImageResource(R.drawable.cloud);

                }
                name.getText().clear();

            }
        });

    }
}