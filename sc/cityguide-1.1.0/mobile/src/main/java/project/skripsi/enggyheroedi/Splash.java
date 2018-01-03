package project.skripsi.enggyheroedi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }startActivity(new Intent(Splash.this,project.skripsi.enggyheroedi.activity.MainActivity.class));
                finish();
            }
        }).start();
    }
}
