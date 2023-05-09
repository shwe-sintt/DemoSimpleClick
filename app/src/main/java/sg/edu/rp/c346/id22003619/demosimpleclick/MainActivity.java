package sg.edu.rp.c346.id22003619.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Button btn;
    EditText et;
    ToggleButton tg;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.textViewDisplay);
        btn=findViewById(R.id.btnbutton);
        et=findViewById(R.id.editTextInput);
        tg=findViewById(R.id.toggleButtonEnabled);
        rgGender=findViewById(R.id.radioGroupGender);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tg.isChecked()){
                    String stringResponse=et.getText().toString();
                    String finale="";
                    int checkedRadioId= rgGender.getCheckedRadioButtonId();
                    if(checkedRadioId==R.id.radioButtonGenderFemale){
                        finale+="She says "+stringResponse;
                    }else{
                        finale+="He says "+stringResponse;
                    }
                    tv.setText(finale);
                    }
            }
        });

        tg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (tg.isChecked()){
                    et.setEnabled(true);
                }else{
                    et.setEnabled(false);
                }
            }
        });
    }
}