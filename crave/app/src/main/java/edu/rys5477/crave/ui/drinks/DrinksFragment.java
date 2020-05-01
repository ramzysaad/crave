package edu.rys5477.crave.ui.drinks;


import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import edu.rys5477.crave.R;




public class DrinksFragment extends Fragment {
    AnimationDrawable desAnimotion;
    String[] drinkItem = {"CARAMEL FRAPUCCINO","CHOCOLATE FRAPUCCINO","FRAPUCCINO COFFE","STRAWBERRY FRAPUCCINO","TEA FRAPUCCINO","VANILLA FRAPUCCINO"};


    public DrinksFragment(){

    }




    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_drinks, container, false);

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView3);
        imageView.setBackgroundResource(R.drawable.animation1);
        desAnimotion= (AnimationDrawable)imageView.getBackground();
        desAnimotion.start();


        ListView listView =(ListView) view.findViewById(R.id.listDrinks);



        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                drinkItem
        );


        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if (position == 0) {

            Intent myIntent =new Intent(view.getContext(),Caramel.class);
            startActivityForResult(myIntent,0);
        }

        else if (position == 1) {

            Intent myIntent =new Intent(view.getContext(),Chocolate.class);
            startActivityForResult(myIntent,0);
        }
       else if (position == 2) {

            Intent myIntent =new Intent(view.getContext(),Coffe.class);
            startActivityForResult(myIntent,0);
        }

       else if (position == 3) {

            Intent myIntent =new Intent(view.getContext(),Strawberry.class);
            startActivityForResult(myIntent,0);
        }


        else if (position == 4) {

            Intent myIntent =new Intent(view.getContext(),Tea.class);
            startActivityForResult(myIntent,0);
        }

        if (position == 5) {

            Intent myIntent =new Intent(view.getContext(),Vanilla.class);
            startActivityForResult(myIntent,0);
        }


    }
});


        return view;



    }
}

