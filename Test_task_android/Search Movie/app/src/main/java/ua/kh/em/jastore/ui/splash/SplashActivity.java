package ua.kh.em.jastore.ui.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.Toast;

import ua.kh.em.jastore.R;
import ua.kh.em.jastore.ui.view.MainActivity;


public class SplashActivity extends Activity {

    private final int SPLASH_DISPLAY_DURATION = 1000;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.splashfile);
        new Handler().postDelayed(() -> {
            Intent i = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        }, SPLASH_DISPLAY_DURATION);
    }
}