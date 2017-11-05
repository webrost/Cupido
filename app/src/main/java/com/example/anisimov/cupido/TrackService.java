package com.example.anisimov.cupido;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by anisimov on 20.10.2017.
 */

public class TrackService extends IntentService {
    public  TrackService(){
        super("TrackService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String dataString = intent.getDataString();
    }
}
