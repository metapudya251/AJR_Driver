package com.patriciameta.ajr_driver;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.textview.MaterialTextView;
import com.patriciameta.ajr_driver.preferences.UserPreferences;

public class MainActivity extends AppCompatActivity {
    private MaterialTextView tvWelcome, tvName, tvAset, tvPromo, tvHistory,tvLogout;
    private ImageView ivUser, ivLogout, ivHistory, ivPromo, ivAset;
    private UserPreferences userPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Ubah Title pada App Bar Aplikasi
        setTitle("Home");

        userPreferences = new UserPreferences(MainActivity.this);

        //  set Text View
        tvWelcome = findViewById(R.id.tv_welcome);
        tvName = findViewById(R.id.tv_name);
        tvHistory = findViewById(R.id.tv_history);
        tvLogout = findViewById(R.id.tv_logout);

        tvName.setText(userPreferences.getUserLogin().getNama());
        //  Set Text View
        ivUser = findViewById(R.id.imageView2);
        ivHistory = findViewById(R.id.imageView5);
        ivLogout = findViewById(R.id.imageView9);

        ivHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(MainActivity.this, TransaksiActivity.class));
            }
        });

        ivLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Jika menu yang dipilih adalah menu Exit, maka tampilkan sebuah dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage(R.string.exit_confirm).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        userPreferences.logout();
                        checkLogin();
                    }
                }).show();
            }
        });
        checkLogin();
    }
    private void checkLogin(){
        if(!userPreferences.checkLogin()){
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        }
    }

}