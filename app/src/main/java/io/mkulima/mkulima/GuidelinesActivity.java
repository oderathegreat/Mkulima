package io.mkulima.mkulima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class GuidelinesActivity extends AppCompatActivity {
    private TextView txtContent;
    private Animation animationUp;
    private Animation animationDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidlines);

        txtContent = findViewById(R.id.title_text);
        TextView txtTitle = findViewById(R.id.content_text);
        txtContent.setVisibility(View.GONE);

        animationUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        animationDown = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);

        txtTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtContent.isShown()){
                    txtContent.setVisibility(View.GONE);
                    txtContent.startAnimation(animationUp);
                }
                else{
                    txtContent.setVisibility(View.VISIBLE);
                    txtContent.startAnimation(animationDown);
                }
            }
        });

    }

    public void toggle_contents(View view) {


    }
}
