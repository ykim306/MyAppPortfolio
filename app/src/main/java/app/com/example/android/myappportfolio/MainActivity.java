package app.com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the project01 button */
    public void displayProj01Toast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Popular Movies app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /** Called when the user touches the project02 button */
    public void displayProj02Toast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Stock Hawk app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /** Called when the user touches the project03 button */
    public void displayProj03Toast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build It Bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /** Called when the user touches the project04 button */
    public void displayProj04Toast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Make Your App Material app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /** Called when the user touches the project05 button */
    public void displayProj05Toast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Go Ubiquitous app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

    /** Called when the user touches the project06 button */
    public void displayProj06Toast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }

}
