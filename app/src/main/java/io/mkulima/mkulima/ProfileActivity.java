package io.mkulima.mkulima;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {
   //Handle Navigation to different Activities

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        String crop = getIntent().getStringExtra("crop");
        String land_size = getIntent().getStringExtra("size");
        String measurement = getIntent().getStringExtra("measurement");
        getSupportActionBar().setTitle(crop);
        SharedPreferences.Editor prefs=getSharedPreferences("info",0).edit();
        prefs.putString("crop",crop);
        prefs.putString("size",land_size);
        prefs.putString("measurement",measurement);
        prefs.apply();

       // Toast.makeText(this, "Size is "+land_size, Toast.LENGTH_SHORT).show();

    }

    public void guidelines(View view) {
        startActivity(new Intent(this, GuidelinesActivity.class));
    }

    public void crop_risk_protection(View view) {
        startActivity(new Intent(this, RiskProtectionActivity.class));

    }

    public void crop_types(View view) {
        startActivity(new Intent(this, CropTypesActivity.class));
    }

    public void value_addition(View view) {
        startActivity(new Intent(this, ValueAdditionActivity.class));
    }

    public void market_analysis(View view) {
        startActivity(new Intent(this, MarketAnalysisActivity.class));
    }
}
