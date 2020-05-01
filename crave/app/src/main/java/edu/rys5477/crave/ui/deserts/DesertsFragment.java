package edu.rys5477.crave.ui.deserts;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import edu.rys5477.crave.R;
import edu.rys5477.crave.R;
import edu.rys5477.crave.ui.drinks.Caramel;
import edu.rys5477.crave.ui.drinks.Chocolate;
import edu.rys5477.crave.ui.drinks.Coffe;
import edu.rys5477.crave.ui.drinks.Strawberry;
import edu.rys5477.crave.ui.drinks.Tea;
import edu.rys5477.crave.ui.drinks.Vanilla;

public class DesertsFragment extends Fragment {


    AnimationDrawable desAnimotion;

    String[] dessertItem = {"CARROT CAKE","CHOCOLATE CAKE","STRAWBERRY WAFFLES","CHEESECAKE","STRAWBERRY CHEESECAKE ","BANANA CHEESECAKE" ,"CANNOLI"};


    public DesertsFragment(){

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_deserts, container, false);



        ImageView imageView = (ImageView) view.findViewById(R.id.imageView3);
        imageView.setBackgroundResource(R.drawable.animation1);
        desAnimotion= (AnimationDrawable)imageView.getBackground();
        desAnimotion.start();

        ListView listView =(ListView) view.findViewById(R.id.listDessert);



        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                dessertItem
        );


        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {

                    Intent myIntent =new Intent(view.getContext(), Carrot.class);
                    startActivityForResult(myIntent,0);
                }

                else if (position == 1) {

                    Intent myIntent =new Intent(view.getContext(), Chocoltecake.class);
                    startActivityForResult(myIntent,0);
                }
                else if (position == 2) {

                    Intent myIntent =new Intent(view.getContext(), Waffels.class);
                    startActivityForResult(myIntent,0);
                }



            }
        });


        return view;





    }
}