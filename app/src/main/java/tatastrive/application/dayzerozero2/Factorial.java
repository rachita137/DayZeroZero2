package tatastrive.application.dayzerozero2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Factorial extends AppCompatActivity {
Button b;
EditText t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.factorial );
        b = findViewById( R.id.button );
        t= findViewById( R.id.editText );

        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int fact=1;
              String  s = t.getText().toString().trim();
                int n= Integer.parseInt( s );
               for(int i=1; i<=n;i++){
                   fact=fact*i;
               }

                Toast.makeText( Factorial.this, "answer is:" +fact, Toast.LENGTH_SHORT ).show();

            }

        } );
    }
}
