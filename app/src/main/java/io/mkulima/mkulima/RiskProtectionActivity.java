package io.mkulima.mkulima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RiskProtectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risk_protection);
    }

    public void first(View view) {
        Intent intent=new Intent(this, RiskProtectionDetailsActivity.class);
        intent.putExtra("pos",0);
        startActivity(intent);
    }

    public void second(View view) {
        Intent intent=new Intent(this, RiskProtectionDetailsActivity.class);
        intent.putExtra("pos",1);
        startActivity(intent);
    }

    public void third(View view) {
        Intent intent=new Intent(this, RiskProtectionDetailsActivity.class);
        intent.putExtra("pos",2);
        startActivity(intent);

    }

    public void fourth(View view) {
        Intent intent=new Intent(this, RiskProtectionDetailsActivity.class);
        intent.putExtra("pos",3);
        startActivity(intent);

    }
}
