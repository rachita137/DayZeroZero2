package tatastrive.application.dayzerozero2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
Button b,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
b=findViewById( R.id.button);
b2=findViewById( R.id.button2);
b.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        //Toast.makeText( Main2Activity.this, "", Toast.LENGTH_SHORT ).show();
        Intent rachita=new Intent(Main2Activity.this,Factorial.class);
        startActivity( rachita );
    }
} );

b2.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent rachita1=new Intent(Main2Activity.this,interst1.class);
        startActivity( rachita1 );
    }
} );
    }
}
