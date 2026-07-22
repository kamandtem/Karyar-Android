package com.kamand.karyar;

import android.widget.Toast;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    private long lastBackPressTime = 0;

    @Override
    public void onBackPressed() {

        long currentTime = System.currentTimeMillis();

        if (currentTime - lastBackPressTime < 2000) {
            finish();
        } else {
            lastBackPressTime = currentTime;

            Toast.makeText(
                    this,
                    "برای خروج دوباره دکمه برگشت را بزنید",
                    Toast.LENGTH_SHORT
            ).show();
        }
    }
}
