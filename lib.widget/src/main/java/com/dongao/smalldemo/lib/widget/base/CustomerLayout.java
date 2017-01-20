package com.dongao.smalldemo.lib.widget.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.dongao.smalldemo.lib.widget.R;

/**
 * Created by yunfei on 2017/1/19.
 * email mayunfei6@gmail.com
 */

public class CustomerLayout extends FrameLayout {
  public CustomerLayout(Context context) {
    this(context,null);
  }

  public CustomerLayout(Context context, AttributeSet attrs) {
    this(context, attrs,0);
  }

  public CustomerLayout(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    LayoutInflater.from(context).inflate(R.layout.include_base_toolbar,this,true);
    TextView tv = (TextView) findViewById(R.id.title);
    tv.setText("yunfei");
  }
}
