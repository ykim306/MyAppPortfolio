package app.com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*import butterknife.ButterKnife;
import butterknife.OnClick;*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // below for ButterKnife library http://jakewharton.github.io/butterknife/
        // ButterKnife.inject(this);
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

        // standard way
        /*Context context = getApplicationContext();
        CharSequence text = "This button will launch my Popular Movies app!";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, toastText, duration).show();*/

        Toast.makeText(MainActivity.this, toastText, Toast.LENGTH_SHORT).show();
    }

    // below for ButterKnife library http://jakewharton.github.io/butterknife/
    /*@OnClick({ R.id.button,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6})
    public void showToast(Button button) {
        Toast.makeText(this, String.format(getString(R.string.button_message), button.getText()), Toast.LENGTH_SHORT).show();
    }*/

}
