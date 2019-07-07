package edu.fcu.demo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Random;

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
            int[] result = GetLottery(1,49,6);
            tvResult.setText(Arrays.toString(result));
        }
    };

    private int[] GetLottery(int start, int end, int length) {
        int[] result = new int[length];

        //建立 ranger 資料 (樂透的球)
        int temp_size = Math.abs(start - end);
        //建立 亂數區
        int[] temp = new int[temp_size];
        for (int i = 0; i < temp_size; i++) {
            temp[i] = start + i;
        }
        //撲克牌發牌擾亂程式
        for(int i=temp_size-1;i>1;i--){
            Random ran = new Random();
            int random_index = ran.nextInt(i-1);
            //swap random_index <--> last index
            int swap_temp = temp[i-1];
            temp[i-1] = temp[random_index];
            temp[random_index] = swap_temp;
        }

        //取top length
        for(int i=0;i<length;i++){
            result[i] = temp[i];
        }

        return result;
    }

}
