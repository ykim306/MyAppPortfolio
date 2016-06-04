package app.com.example.android.myappportfolio;

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
        DisplayText(getString(R.string.proj01Toast));
    }

    /** Called when the user touches the project02 button */
    public void displayProj02Toast(View view) {
        DisplayText(getString(R.string.proj02Toast));
    }

    /** Called when the user touches the project03 button */
    public void displayProj03Toast(View view) {
        DisplayText(getString(R.string.proj03Toast));
    }

    /** Called when the user touches the project04 button */
    public void displayProj04Toast(View view) {
        DisplayText(getString(R.string.proj04Toast));
    }

    /** Called when the user touches the project05 button */
    public void displayProj05Toast(View view) {
        DisplayText(getString(R.string.proj05Toast));
    }

    /** Called when the user touches the project06 button */
    public void displayProj06Toast(View view) {
        DisplayText(getString(R.string.proj06Toast));
    }

    void DisplayText(String toastText){
        Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_SHORT).show();
    }

}
