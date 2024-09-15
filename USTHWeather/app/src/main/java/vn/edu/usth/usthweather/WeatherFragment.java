package vn.edu.usth.usthweather;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.graphics.Color;
import android.widget.RelativeLayout;

public class WeatherFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weather, container, false);

        // Set the background color to green for the RelativeLayout
        RelativeLayout relativeLayout = view.findViewById(R.id.weatherLayout);
        relativeLayout.setBackgroundColor(Color.GREEN);

        return view;
    }
}
