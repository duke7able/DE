package ga.rdxgeek.de;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.activeandroid.ActiveAndroid;



public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ActiveAndroid.initialize(this);
/*        Thread welcomeThread = new Thread() {

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

    */

        /*
        * Here for just first time login what we can do is make a table in db with only one row and column... which has a boolean
        * which stores true if user has logged in once and checked the checkbox that is stay signedin...then do not need to
        * login every time...
        * in this we could put this intent line in if else and if this value is true..
        * i.e. the user is logged in then this intent wont happen and directly dashboard intent would happen
        *
        *
        * also if the intent line happens very fast even faster than the db connection and data retrival then we could use thread
        * so that this intent thing happens after a second or two...something like that
        *
        *
        * */

        /*Intent menuIntent = new Intent(this, signup.class);
        startActivity(menuIntent);*/
        Intent menuIntent = new Intent(this, LoginActivity.class);
        startActivity(menuIntent);
        /*Intent menuIntent1 = new Intent(this, dashboard.class);
        startActivity(menuIntent1);*/

    }
}