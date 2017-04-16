package ga.rdxgeek.de;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    /*comment*/



    private EditText mName;
    private EditText mEmail;
    private EditText mFriendName;
    private EditText mFriendMobile;
    private EditText mPass;

    /*private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello", "bar@example.com:world"
    };
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mName = (EditText) findViewById(R.id.name_input_signup);
        mEmail = (EditText) findViewById(R.id.email_signup);
        mFriendName = (EditText) findViewById(R.id.Fname_edit);
        mFriendMobile = (EditText) findViewById(R.id.mobile_edit);


        mPass = (EditText) findViewById(R.id.password_signup);
        onStart();

    }

    @Override
    protected void onStart() {
        super.onStart();


        /*mPass.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == R.id.password_signup || id == EditorInfo.IME_NULL) {

                    return true;
                }
                return false;
            }
        });*/
        Button mNext = (Button) findViewById(R.id.next);
        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptsignup();
            }
        });
    }

    /*@Override
        public boolean onKeyUp(int keyCode, KeyEvent event) {
            //Log.i("onKeyUp method","start method");

            TextView wordTextView = (TextView)findViewById(R.id.ghostText);
            if(keyCode >= 29 && keyCode <= 54){

                wordfragment = wordfragment.concat(event.getDisplayLabel() + "");
                wordfragment = wordfragment.toLowerCase();
                wordTextView.setText(wordfragment);


            }
            return super.onKeyUp(keyCode, event);
        }*/
    private void attemptsignup(){


        // Reset errors.
        mEmail.setError(null);
        mPass.setError(null);
        mName.setError(null);
        mFriendName.setError(null);
        mFriendMobile.setError(null);

        // Store values at the time of the login attempt.
        String email = mEmail.getText().toString();
        String password = mPass.getText().toString();
        String name = mName.getText().toString();
        String FreindName = mFriendName.getText().toString();
        String FriendMobile = mFriendMobile.getText().toString();

        boolean cancel = false;
        View focusView = null;



        // Check for a valid email address.
        if (TextUtils.isEmpty(email)) {
            mEmail.setError(getString(R.string.error_field_required));
            focusView = mEmail;
            cancel = true;
        } else if (!isEmailValid(email)) {
            mEmail.setError(getString(R.string.error_invalid_email));
            focusView = mEmail;
            cancel = true;
        }else if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
                // Check for a valid password, if the user entered one.
                mPass.setError(getString(R.string.error_invalid_password));
                focusView = mPass;
                cancel = true;
        }else if (!TextUtils.isEmpty(FreindName) && !isFMobileValid(FriendMobile) && !TextUtils.isEmpty(FriendMobile) ) {
            // Check for a valid fName  if the user entered one and then if the mobile is valid or not
            mFriendMobile.setError(getString(R.string.error_invalid_password));
            focusView = mFriendMobile;
            cancel = true;
        }

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
            onStart();
        } else {
            //register a new user
            //for now lets put finish kinda thing
            finish();

        }

    }

    private boolean isFMobileValid(String mob){
        if (mob.length()>=10&&mob.length()<=12)
        return true;
        else
            return false;
    }
    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

}
