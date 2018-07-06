package com.udacity.gradle.builditbigger.paid;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        return root;
    }
}
