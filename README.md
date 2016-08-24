# CommonItem
简单封装的一个item，仿照微信

![image|300x400](https://github.com/SolveBugs/CommonItem/blob/master/showPicture.png)

      可自定义的属性：
```
    1.item左边icon
    2.item左边文字
    3.文字大小和颜色
    4.item背景颜色
    5.item右边指示icon
    
    均可不设置
```

     用法：
     
     1.添加依赖
     ```
     dependencies {
         compile 'com.zq.commonitemlib:commonitemmoudle:1.0.1'
     }
     ```
     2.在xml中使用：为了代码规范，这里所有的资源需要定义好，以引用的方式来设置
     ```
     <demo.zq.com.commonitemmoudle.CommonItem1
             app:arrow_item="@drawable/right"
             app:background_item="@color/RGB_FFFFFF"
             app:img_item="@drawable/setting_blue"
             app:text_item="@string/setting"
             app:textcolor_item="@color/RGB_000000"
             app:textsize_item="@dimen/normalsize"
             android:layout_width="match_parent"
             android:layout_height="wrap_content"></demo.zq.com.commonitemmoudle.CommonItem1>
             
     ```


    