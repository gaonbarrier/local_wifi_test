package com.example.wifihotspottest;

import android.view.View;
import info.whitebyte.hotspotmanager.*;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    WifiApManager wifiApManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wifiApManager = new WifiApManager(this);
    }

    public void Test_Listener(View view) {
        switch (view.getId()) {
            case R.id.open_sys_setting: wifiApManager.showWritePermissionSettings(true); break;
            case R.id.start_hotspot: wifiApManager.setWifiApEnabled(null, true); break;
            case R.id.stop_hotspot: wifiApManager.setWifiApEnabled(null, false); break;
        }
    }

}
