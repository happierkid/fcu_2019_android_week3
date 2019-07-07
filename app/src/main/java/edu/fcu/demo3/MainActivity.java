package edu.fcu.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnStart;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //取得所有物件
        btnStart = (Button) findViewById(R.id.btnStart);
        tvResult = (TextView) findViewById(R.id.tvResult);

        //設定物件的 內容 (on click event)
        btnStart.setOnClickListener(btnStartOnClick);
    }

    private View.OnClickListener btnStartOnClick = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            tvResult.setText("測試...");
        }
    };

}
