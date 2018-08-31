package io.mkulima.mkulima;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by walter on 8/31/18.
 */

public class SharedPrefs {
    Context mContext;

    public SharedPrefs(Context context) {
        mContext = context;
    }

    public void saveItem(String item,String key){
        SharedPreferences preferences=mContext.getSharedPreferences("info", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString(key,item);
        editor.commit();
    }

    public  String getItem(String key){
        SharedPreferences preferences=mContext.getSharedPreferences("info", Context.MODE_PRIVATE);
        return preferences.getString(key,"");
    }

}
