package com.adida.aka.broadcastnetwork;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Aka on 7/3/2017.
 */

public class NetworkChangeBroadcast extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Network is turned ON/OFF", Toast.LENGTH_SHORT).show();
    }
}
