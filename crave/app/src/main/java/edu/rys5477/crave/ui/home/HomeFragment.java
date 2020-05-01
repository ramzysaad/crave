package edu.rys5477.crave.ui.home;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import edu.rys5477.crave.R;

public class HomeFragment extends Fragment   {

AnimationDrawable homeAnimotion;
    public HomeFragment(){

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText((getActivity()),"Hello home" ,Toast.LENGTH_LONG);
         View view= inflater.inflate(R.layout.fragment_home, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView2);
        imageView.setBackgroundResource(R.drawable.animation);
        homeAnimotion= (AnimationDrawable)imageView.getBackground();
        homeAnimotion.start();

return view;
    }



}