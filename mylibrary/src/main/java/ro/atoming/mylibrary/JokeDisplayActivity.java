package ro.atoming.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    private TextView mJokeText;
    public static final String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        mJokeText = findViewById(R.id.joke_textView);
        Intent jokeIntent = getIntent();
        if (jokeIntent.hasExtra(JOKE)) {
            String passedJoke = jokeIntent.getStringExtra(JOKE);
            mJokeText.setText(passedJoke);
        }
    }
}
