package ga.rdxgeek.de;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread welcomeThread = new Thread() {

            @Override
            public void run() {
                try {
                    super.run();
                    sleep(1000);  //Delay of 1 second
                } catch (Exception e) {

                } finally {


                    Intent i = new Intent(SplashActivity.this,
                            MainActivity.class);
                    //asked for help on Stackoverflow..
                    startActivity(i);
                    finish();
                }
            }
        };
        welcomeThread.start();
    }

    @Override
    protected void onStart() {
        super.onStart();


    }

    @Override
    protected void onPause() {
        super.onPause();


    }


}
