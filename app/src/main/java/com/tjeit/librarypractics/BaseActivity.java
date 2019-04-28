package com.tjeit.librarypractics;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    // ~~Activity.this를 대체하기 위한 변수.
    public Context mContext = this;

    //맨날 만드는 메소드 생성 강제
    public abstract void setupEvents();
    public abstract void setValues();
    public abstract void bindViews();
}
