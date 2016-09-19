package com.jjaein.android.appsettings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.appcompat.*;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView tv = (TextView) findViewById(R.id.radioButton);
//        tv.setText("터치미");
//
//        //화면 요소에 접근하는 방법
//        // 1 요소 타입선언 - 레이아웃 . xml 파일 ) 로 해당 요소를 찾아서 할당
//        // 3 찾은 요소를 타입에 맞게 캐스팅
//
//        Button btn = (Button) findViewById(R.id.radioButton);
//        //  4. 버튼의 경우 클릭 같은 이벤트를 감지하기 위해서 리스너 라는 것을 달아야 한다.
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) { //5. 버튼이 클릭되면 onClick 함수를 호출한다.
//
//                changeText();
            }
        //  뷰 요소에서 함수를 호출하기 위해서는
        //  1. 함수를 void 타입으로 작성하고
        //  2. 파라미터에 View 를 선언해 준다.

    public void changeText(View v) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("응???");
        tv.setText(BuildConfig.MYURL);

    }
}