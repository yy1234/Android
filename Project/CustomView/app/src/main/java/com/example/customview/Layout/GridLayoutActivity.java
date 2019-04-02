package com.example.customview.Layout;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import com.example.customview.R;

public class GridLayoutActivity extends AppCompatActivity {
    GridLayout gridLayout;
    String[] chars = new String[] {
            "7","8","9","*",
            "4","5","6","*",
            "1","2","3","*",
            "1","2","3","*"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        gridLayout = (GridLayout) findViewById(R.id.root);
        for (int i = 0; i < chars.length; i++){
            Button btn = new Button(this);
            btn.setText(chars[i]);
            btn.setTextSize(40);
           /*设置按钮四周的空白*/
            btn.setPadding(5,35,5,35);
            /*确定所在的行*/
            GridLayout.Spec rowSpec = GridLayout.spec((i / 4 +2));
            GridLayout.Spec columnSpec = GridLayout.spec((i % 4));
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec,columnSpec);
           /*占满整个容器*/
            params.setGravity(Gravity.FILL);
            gridLayout.addView(btn,params);
        }


    }

}
