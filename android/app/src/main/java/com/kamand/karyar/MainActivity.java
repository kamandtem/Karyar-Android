package com.kamand.karyar;

import android.widget.Toast;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {

    @Override
    public void onBackPressed() {
        Toast.makeText(
                this,
                "دکمه برگشت گرفته شد",
                Toast.LENGTH_SHORT
        ).show();
    }
}
