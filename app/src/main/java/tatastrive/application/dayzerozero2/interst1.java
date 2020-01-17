package tatastrive.application.dayzerozero2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class interst1 extends AppCompatActivity {
    Button b;
    TextView tt;
    EditText t, t1,t2;
    String s,ss,sss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.interst1 );
                t = findViewById( R.id.editText);
                t1 = findViewById( R.id.editText1);
                t2 = findViewById( R.id.editText2 );
                b=findViewById( R.id.button2 );
                tt = findViewById( R.id.textView4 );

                b.setOnClickListener( new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        s = t.getText().toString().trim();
                        ss = t1.getText().toString().trim();
                        sss = t2.getText().toString().trim();

                        int a = Integer.parseInt( s );
                        int b= Integer.parseInt( ss );
                        int c=Integer.parseInt( sss );


                        int j =a*b*c/100;
                        //System.out.println("Output"+j);
                        tt.setText(String.valueOf(j));
                        Toast.makeText( interst1.this, "Simple Interst:"+j, Toast.LENGTH_SHORT ).show();


                    }

                } );
            }
        }



