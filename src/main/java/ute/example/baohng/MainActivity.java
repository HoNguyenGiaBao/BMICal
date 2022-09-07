package ute.example.baohng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButtonToggleGroup;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edtNum1, edtNum2;
    Button btnCalc;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = (EditText) findViewById(R.id.editTextNumber);
        edtNum2 = (EditText) findViewById(R.id.editTextNumber2);
        btnCalc = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.textView5);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string1 = edtNum1.getText().toString().trim();
                String string2 = edtNum2.getText().toString().trim();

                int

                result = (edtNum2)/(edtNum1*2);
            }
        });
    }
}