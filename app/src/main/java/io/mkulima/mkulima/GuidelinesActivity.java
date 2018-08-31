package io.mkulima.mkulima;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.mindorks.placeholderview.ExpandablePlaceHolderView;

import io.mkulima.mkulima.models.Content;
import io.mkulima.mkulima.models.Item;
import io.mkulima.mkulima.utils.DataSource;
import io.mkulima.mkulima.views.ContentView;
import io.mkulima.mkulima.views.HeadingView;

public class GuidelinesActivity extends AppCompatActivity {
    private ExpandablePlaceHolderView mExpandableView;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidlines);
        mContext = this.getApplicationContext();
        mExpandableView = (ExpandablePlaceHolderView)findViewById(R.id.expandableView);

        for(Item item:DataSource.getData()){
           mExpandableView.addView(new HeadingView(mContext,item.getHeading()));
           for(Content c: item.getContentList()){
             mExpandableView.addView(new ContentView(mContext,c));
           }

        }

    }


}
