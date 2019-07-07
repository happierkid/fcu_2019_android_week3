package edu.fcu.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SettingActivity extends AppCompatActivity {

    Button btn_Save ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        //TODO: 記得去抓 物件 (findViewByID)
        btn_Save = (Button) findViewById(R.id.btn_Save);

        btn_Save.setOnClickListener(btnSaveOnClickListener);
    }

    View.OnClickListener btnSaveOnClickListener =new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.v("Tag","onClick");
            Intent intent = new Intent();
            intent.setClass(SettingActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };

}
