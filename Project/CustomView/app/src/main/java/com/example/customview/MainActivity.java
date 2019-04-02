package com.example.customview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.customview.Layout.CustomView.CustomActivity;
import com.example.customview.Layout.Frame_layout.Frame_layoutActivity;
import com.example.customview.Layout.GridLayoutActivity;
import com.example.customview.Layout.RelativeLayout.RelativeLayoutActivity;
import com.example.customview.Layout.TableLayout.TableActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*获取文件布局的LinearLayout容器*/
//        LinearLayout root = findViewById(R.id.root);
//        /*创建DrawView组件*/
//        final DrawView draw = new DrawView(this);
//        draw.setMinimumHeight(500);
//        draw.setMinimumWidth(300);
//        root.addView(draw);


        View btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"touch me", Toast.LENGTH_SHORT);
                Intent intent = new Intent(MainActivity.this, CustomActivity.class);
                startActivity(intent);
            }
        });


        View btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT);
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                startActivity(intent);

            }
        });

        View btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this,"", Toast.LENGTH_SHORT);
                Intent intent = new Intent(MainActivity.this, Frame_layoutActivity.class);
                startActivity(intent);

            }
        });

        View btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this,"", Toast.LENGTH_SHORT);
                Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);

            }
        });


        View btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this,"", Toast.LENGTH_SHORT);
                Intent intent = new Intent(MainActivity.this, GridLayoutActivity.class);
                startActivity(intent);

            }
        });
    }
}
