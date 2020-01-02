#   凉爽的天气
## 项目说明
    这是一个天气的Android Studio项目，模仿《第一行代码（第二版）》里的天气，不过《第一行代码（第二版）》时间有些老，一些依赖包不符合现在的规则，Android Studio3.5之后就有更新，之前complie”变为implementation,之前通用的V-4,V-7包也都进化了，这个程序是我学习过程中测试通过的，用于交流学习。
##  运行版本：
1. Android  Studio    3.5.2  
2. compileSdkVersion  29   
   buildToolsVersion '28.0.3'  
##  本项目需要添加的依赖：
在build.gradle中配置
1. gson数据，GSON用于解析JSON数据  
    implementation 'com.google.code.gson:gson:2.8.6'  
2. 用于加载和展示图片  
    implementation 'com.github.bumptech.glide:glide:3.7.0'  
    implementation 'com.github.bumptech.glide:glide:4.10.0'
3. 网络请求用于进行网络请求  
    implementation 'com.squareup.okhttp3:okhttp:4.3.0'  
    implementation 'org.litepal.android:core:1.6.1'  
    implementation 'androidx.swiperefreshlayout:swiperefreshlayout:1.0.0'  
  **别忘了在AndroidManifest.xml中加上下面这句话**  
     网络请求配置 
    <uses-permission android:name="android.permission.INTERNET" />

