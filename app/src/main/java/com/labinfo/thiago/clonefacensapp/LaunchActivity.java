package com.labinfo.thiago.clonefacensapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.WindowManager;

public class LaunchActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.layout_splash);

        new Handler().postDelayed(this::goToMainScreen, 1000);
    }

    public void goToMainScreen()
    {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }
}
