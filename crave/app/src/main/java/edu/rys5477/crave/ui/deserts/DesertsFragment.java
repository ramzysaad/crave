package edu.rys5477.crave.ui.deserts;

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

public class DesertsFragment extends Fragment {

    private DesertsViewModel desertsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        desertsViewModel =
                ViewModelProviders.of(this).get(DesertsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_deserts, container, false);
        final TextView textView = root.findViewById(R.id.text_deserts);
        desertsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}