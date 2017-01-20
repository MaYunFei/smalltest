package com.dongao.smalldemo.lib.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by yunfei on 2017/1/19.
 * email mayunfei6@gmail.com
 */

public class BaseFragmentActivity extends AppCompatActivity {
  protected Context context;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    context = this;
  }
}
