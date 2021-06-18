package Scal.LoginUi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import Scal.Maintain.R;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(() -> {
            Intent intent =new Intent(Welcome.this,FirstPageA.class );
            startActivity(intent);
            Welcome.this.finish();
        },2000);
    }
}