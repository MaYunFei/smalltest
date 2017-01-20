package com.dongao.smalldemo.lib.router;

import android.content.Context;

/**
 * Created by yunfei on 2017/1/10.
 * email mayunfei6@gmail.com
 */

public class RouterUtil {
  //禁止实例化
  private RouterUtil() {
  }

  /**
   * 跳转登录
   */
  public static void launchLogin(Context context) {
    Router.from(context).to("login").launch();
  }

  /**
   * 跳转考前模块
   */
  public static void launchMainclient(Context context) {
    Router.from(context).to("mainclient").launch();
  }
  /**
   * 跳转从业模块
   */
  public static void launchContye(Context context) {
    Router.from(context).to("congye").launch();
  }

  /**
   * 跳转 试题模块主 activity
   */
  public static void launchExam(Context context) {
    Router.from(context).to("exam").launch();
  }

  /**
   * 跳扫一扫
   */
  public static void launchScan(Context context) {
    Router.from(context).to("scan").launch();
  }
}
