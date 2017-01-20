package com.dongao.smalldemo.lib.widget.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.dongao.smalldemo.lib.widget.R;

/**
 * Created by yunfei on 2017/1/19.
 * email mayunfei6@gmail.com'
 * 标题居中的toolbar
 */

public class BaseToolbar extends Toolbar {
  protected TextView tv_title;

  public BaseToolbar(Context context) {
    this(context, null);
  }

  public BaseToolbar(Context context, @Nullable AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public BaseToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    LayoutInflater inflater = LayoutInflater.from(context);
    inflater.inflate(R.layout.include_base_toolbar, this, true);
    tv_title = (TextView) findViewById(R.id.title);
    TypedArray ta = context.getTheme().obtainStyledAttributes(attrs, R.styleable.BaseToolbar, 0, 0);
    final String titleText = ta.getString(R.styleable.BaseToolbar_TitleText);
    if (!TextUtils.isEmpty(titleText)) {
      setTitle(titleText);
    }
    ta.recycle();
  }

  @Override public void setTitle(CharSequence title) {
    super.setTitle("");
    tv_title.setText(title);
  }

  @Override public void setTitle(@StringRes int resId) {
    setTitle(getContext().getString(resId));
  }

  @Override public void setTitleTextColor(@ColorInt int color) {
    super.setTitleTextColor(0);
    tv_title.setTextColor(color);
  }
}
