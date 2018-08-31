package io.mkulima.mkulima.views;

import android.content.Context;
import android.widget.TextView;

import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.expand.ChildPosition;
import com.mindorks.placeholderview.annotations.expand.ParentPosition;

import io.mkulima.mkulima.R;
import io.mkulima.mkulima.models.Content;

/**
 * Created by walter on 8/31/18.
 */

@Layout(R.layout.item_content)
public class ContentView {
    @ParentPosition
    private int mParentPosition;

    @ChildPosition
    private int mChildPosition;

    @View(R.id.textContent)
    private TextView textContent;

    private Content mContent;
    private Context mContext;

    public ContentView(Context context, Content content) {
        mContent = content;
        mContext = context;
    }
    @Resolve
    private void onResolved() {
        textContent.setText(mContent.getText());
    }

}
