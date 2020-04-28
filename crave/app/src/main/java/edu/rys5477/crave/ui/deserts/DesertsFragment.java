package edu.rys5477.crave.ui.deserts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import edu.rys5477.crave.R;

public class DesertsFragment extends Fragment {

    public DesertsFragment(){

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText((getActivity()),"Hello Desert" ,Toast.LENGTH_LONG);
        return inflater.inflate(R.layout.fragment_deserts, container, false);
    }
}