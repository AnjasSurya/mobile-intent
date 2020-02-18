package id.ac.polinema.intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText usernameInput;
    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        usernameInput = findViewById(R.id.input_username);
        outputText = findViewById(R.id.text_output);
    }

    public void handleSubmit (View view){
        String name = usernameInput.getText().toString();
        outputText.setText(name);
    }

}
