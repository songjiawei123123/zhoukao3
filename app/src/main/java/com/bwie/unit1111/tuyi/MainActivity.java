package com.bwie.unit1111.tuyi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;


import com.bwie.unit1111.R;
import com.bwie.unit1111.tuer.TuEr;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class MainActivity extends AppCompatActivity {
//    @BindView(R.id.main_button01)
//    Button mainButton01;
//    @BindView(R.id.main_button02)
//    Button mainButton02;
//    @BindView(R.id.video)
//    VideoView videoView;
    private Uri uri;
    private Button btn;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
//    new Thread(){
//            @Override
//            public void run() {
//                super.run();
//                videoView = new VideoView(MainActivity.this);
//                setContentView(R.layout.activity_main);
//                uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.oppo2);
//                videoView.setVideoURI(uri);
//                videoView.setMediaController(new MediaController(MainActivity.this));
//            }
//        }.start();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TuEr.class));

            }
        });


    }

    private void initView() {
        btn=findViewById(R.id.main_button02);
        videoView=findViewById(R.id.video);
      }



    @OnClick({ R.id.main_button02})
    public void onViewClicked(View view) {
        switch (view.getId()) {
//            case R.id.main_button01:
//                startActivity(new Intent(this, TuYi.class));
//                break;
//            case R.id.main_button02:
//                startActivity(new Intent(this, TuEr.class));
//                break;
        }
    }
}
