package com.nowpurchase.CapacitorEsperSetting;

import android.content.ComponentName;
import android.content.Intent;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapacitorEsperSetting")
public class CapacitorEsperSetting extends Plugin {

    @PluginMethod
    public void launchEsperSettings(PluginCall call) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("io.shoonya.shoonyadpc", "com.shoonyaos.shoonyasettings.activities.MainActivity"));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getContext().startActivity(intent);
        call.resolve();
    }
}
