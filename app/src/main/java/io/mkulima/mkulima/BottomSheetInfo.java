package io.mkulima.mkulima;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.rengwuxian.materialedittext.MaterialEditText;

import io.mkulima.mkulima.utils.SharedPrefs;
import lib.kingja.switchbutton.SwitchMultiButton;
import mehdi.sakout.fancybuttons.FancyButton;

/**
 * Created by walter on 8/31/18.
 */

public class BottomSheetInfo extends BottomSheetDialogFragment {

    public static BottomSheetInfo getInstance() {
        return new BottomSheetInfo();
    }
    String measurement ="Acres";
    int selectedTab=0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.bottom_sheet_layout, container, false);
        FancyButton btn = view.findViewById(R.id.btn_enter);
        final Spinner spinner=view.findViewById(R.id.spinnerCrops);
        final MaterialEditText edtLandSize = view.findViewById(R.id.inputLandSize);
        SwitchMultiButton switchMultiButton=view.findViewById(R.id.btnMeasurement);
        final TextView txtLandSize = view.findViewById(R.id.txtLandSize);
        final SharedPrefs prefs=new SharedPrefs(getActivity());

        edtLandSize.setText(prefs.getItem("size"));
        if (!prefs.getItem("selected").equals("")) {
            switchMultiButton.setSelectedTab(Integer.parseInt(prefs.getItem("selected")));
        }
        if (!prefs.getItem("spinner").equals("")) {
           spinner.setSelection(Integer.parseInt(prefs.getItem("spinner")));
        }


        switchMultiButton.setOnSwitchListener(new SwitchMultiButton.OnSwitchListener() {
            @Override
            public void onSwitch(int position, String tabText) {
              selectedTab=position;
              if (position==0){
                  txtLandSize.setText("Whats your land size in acres");
                  measurement ="Acres";
              } else{
                  txtLandSize.setText("Whats your land size in hectares");
                  measurement ="Hectares";
              }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO save farmer crop,land information, go to next activity
                String crop = spinner.getSelectedItem().toString();
                String landSize = edtLandSize.getText().toString().trim();
                if (landSize.isEmpty()){
                    Snackbar.make(view,"You must specify your land size",Snackbar.LENGTH_SHORT).show();
                    return;
                }
                prefs.saveItem("crop",crop);
                prefs.saveItem("size",landSize);
                prefs.saveItem("measurement",measurement);
                prefs.saveItem("selected",selectedTab+"");
                prefs.saveItem("spinner",spinner.getSelectedItemPosition()+"");
                Log.d("BOTTOM_SHEET", "onClick: "+crop+" "+landSize+" "+measurement);
               // Toast.makeText(getActivity(),  "onClick: "+crop+" "+landSize+" "+measurement, Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(getActivity(), ProfileActivity.class);
                intent.putExtra("crop",crop);
                intent.putExtra("size",landSize);
                intent.putExtra("measurement",measurement);
                startActivity(intent);



            }
        });

        return view;
    }
}
