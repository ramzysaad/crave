package edu.rys5477.crave.ui.maindish;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import edu.rys5477.crave.R;

public class MaindishFragment extends Fragment {
    private MaindishViewModel maindishViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        maindishViewModel =
                ViewModelProviders.of(this).get(MaindishViewModel.class);
        View root = inflater.inflate(R.layout.fragment_maindish, container, false);
        final TextView textView = root.findViewById(R.id.text_maindish);
        maindishViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
