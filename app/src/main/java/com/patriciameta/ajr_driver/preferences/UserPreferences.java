package com.patriciameta.ajr_driver.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.patriciameta.ajr_driver.users.User;

public class UserPreferences {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    public static final String IS_LOGIN = "isLogin";
    public static final String KEY_USERNAME = "email";
    public static final String KEY_NAME = "email";
    public static final String KEY_PASSWORD = "password";

    public UserPreferences(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences("userPreferences", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void setLogin(String email,String nama, String password){
        editor.putBoolean(IS_LOGIN, true);
        editor.putString(KEY_USERNAME, email);
        editor.putString(KEY_NAME, nama);
        editor.putString(KEY_PASSWORD, password);

        editor.commit();
    }

    public User getUserLogin(){
        String email,password,nama;

        email = sharedPreferences.getString(KEY_USERNAME,null);
        nama = sharedPreferences.getString(KEY_NAME,null);
        password = sharedPreferences.getString(KEY_PASSWORD,null);

        return new User(email,nama,password);
    }

    public boolean checkLogin(){
        return sharedPreferences.getBoolean(IS_LOGIN,false);
    }

    public void logout(){
        editor.clear();
        editor.commit();
    }
}
