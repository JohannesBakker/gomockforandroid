package com.general.mediaplayer.gomock;

import android.os.Bundle;
import android.view.View;
import com.crashlytics.android.Crashlytics;

public class SigninActivity extends SuperActivity implements View.OnClickListener {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Crashlytics.start(this);
        setContentView(R.layout.activity_signin);
    }

    @Override
    public int getMainLayoutRes() {
        return R.id.rlParent;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onClick(View v) {
        ;
    }
}
