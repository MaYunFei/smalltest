package com.dongao.smalldemo.app.main;

import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.dongao.smalldemo.lib.base.BaseFragmentActivity;

public class MainActivityActivity extends BaseFragmentActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main_activity);
    ButterKnife.bind(this);
    Intent intent= new Intent(this,SecondActivity.class);
    startActivity(intent);

  }

  //@OnClick({ R.id.mainclient, R.id.congye, R.id.exam,R.id.login, R.id.scan }) public void onClick(View view) {
  //  switch (view.getId()) {
  //    case R.id.login:
  //      RouterUtil.launchLogin(context);
  //      break;
  //    case R.id.mainclient:
  //      RouterUtil.launchMainclient(context);
  //      break;
  //    case R.id.congye:
  //      RouterUtil.launchContye(context);
  //      break;
  //    case R.id.exam:
  //      RouterUtil.launchExam(context);
  //      break;
  //    case R.id.scan:
  //      RouterUtil.launchScan(context);
  //      break;
  //  }
  //}

}
