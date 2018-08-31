package io.mkulima.mkulima.views;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.Collapse;
import com.mindorks.placeholderview.annotations.expand.Expand;
import com.mindorks.placeholderview.annotations.expand.Parent;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;
import com.mindorks.placeholderview.annotations.expand.SingleTop;
import com.mindorks.placeholderview.annotations.expand.Toggle;

import io.mkulima.mkulima.R;

/**
 * Created by walter on 8/31/18.
 */
@Parent
@SingleTop
@Layout(R.layout.item_heading)
public class HeadingView {

    @View(R.id.textHeading)
    private TextView headingTxt;

    @View(R.id.toggleIcon)
    private ImageView toggleIcon;

    @Toggle(R.id.toggleView)
    private LinearLayout toggleView;

    @ParentPosition
    private int mParentPosition;

    private Context mContext;
    private String mHeading;

    public HeadingView(Context context, String heading) {
        mContext = context;
        mHeading = heading;
    }

    @Resolve
    private void onResolved() {
        toggleIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.baseline_keyboard_arrow_up_24));
        headingTxt.setText(mHeading);
    }

    @Expand
    private void onExpand(){
        toggleIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.baseline_keyboard_arrow_down_24));
    }

    @Collapse
    private void onCollapse(){
        toggleIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.baseline_keyboard_arrow_up_24));
    }
}
