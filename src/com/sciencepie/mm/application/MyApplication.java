package com.sciencepie.mm.application;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sciencepie.mm.http.JsonCheckUpdateHandler;
import com.sciencepie.mm.http.JsonGetMyInfoHandler;
import com.sciencepie.mm.http.JsonLoginHandler;
import com.sciencepie.mm.util.ResourceDefine;
import com.sciencepie.mm.util.User;




import android.R.string;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

public class MyApplication extends Application{

	public static String loginurl=null;
	public static String loginState=null;
	public  static String sidString="";
	public static String result=null;
	public static JsonLoginHandler jsonLoginHandler=new JsonLoginHandler();
	public static Map<String,String> my_keywords = null;
	static MyApplication instance;
	public static  String [] keywords=null;
	public static boolean hasLauncher = false;;
	public static String user_name = "";	//存储当前的用户名
	public static String password = "";//最后肯定要改成加密的形式
    public static String nickname = "";
    public static User   user ;
    public static SoftReference<Bitmap> user_avatar;
	public static SharedPreferences shared_prefs;
	public static SharedPreferences user_info_prefs;
	public static Editor            editor;
	public static Editor            user_info_editor;
	public static String eid;
	public static String cid;
	public  static List<StringBuffer> non_null_keywords_list = new ArrayList<StringBuffer>();
	/*存储当前版本的号*/
	public static int local_version = 1;
	public static int server_version = 1;
	public static String local_version_name = "";
	public static String server_version_name = "";
	public static Map<String,Object> version_info;
	
	
	
	public static final int CHECK_UPDATE_OK = 0;
	public static final int CHECK_UPDATE_HAVE_NEW_VERSION = 1;
	public static final String platform1 = "http://123.57.207.9/";
	public static final String platform2 = "http://123.56.155.78/";
	
	public static String platform;//用来平台,也就是是URL
	
	
	
	public static MyApplication getInstance() {
	return	instance;

	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		/*生成ResourceDefine 很重要*/
		ResourceDefine.deriveResourceDefine(getApplicationContext());

	}


	
	
    
	
	
}
