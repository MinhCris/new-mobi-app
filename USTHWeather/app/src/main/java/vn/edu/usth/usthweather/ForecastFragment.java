package vn.edu.usth.usthweather;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    private static final String TAG = "FragmentLifecycle";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = new View(getActivity());


        int color = Color.parseColor("#20FF0000");
        view.setBackgroundColor(color);

        Log.i(TAG, "onCreateView() called and background set to #" + Integer.toHexString(color));

        return view;  // Return the created view
    }
}
