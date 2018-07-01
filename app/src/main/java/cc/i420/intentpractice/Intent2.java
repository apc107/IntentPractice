package cc.i420.intentpractice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intent2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);
//        Button btn2 = findViewById(R.id.button2);
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Intent2.this, MainActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });
    }
    public void goMain(View v) {
        Intent i = new Intent(Intent2.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}

