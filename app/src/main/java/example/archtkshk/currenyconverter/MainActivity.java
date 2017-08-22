package example.archtkshk.currenyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText d;
    Button b;
    String s;
    float f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= (Button) findViewById(R.id.convert);
        d= (EditText) findViewById(R.id.dollar);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    s = d.getText().toString();
                    f = Float.parseFloat(s) * 65;
                    Toast.makeText(MainActivity.this, "Converted into Rs." + f, Toast.LENGTH_LONG).show();
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this, "Not a valid number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
