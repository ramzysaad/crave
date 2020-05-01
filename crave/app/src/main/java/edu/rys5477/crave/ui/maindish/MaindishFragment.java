package edu.rys5477.crave.ui.maindish;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import edu.rys5477.crave.R;
import edu.rys5477.crave.ui.deserts.Carrot;
import edu.rys5477.crave.ui.deserts.Chocoltecake;
import edu.rys5477.crave.ui.deserts.Waffels;

public class MaindishFragment extends Fragment {


    String[] mainItem = {"CARROT CAKE","CHOCOLATE CAKE","STRAWBERRY WAFFLES","CHEESECAKE","STRAWBERRY CHEESECAKE ","BANANA CHEESECAKE" ,"CANNOLI"};

    public MaindishFragment(){

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText((getActivity()),"Hello MainDish" ,Toast.LENGTH_LONG);
        View view= inflater.inflate(R.layout.fragment_maindish, container, false);

        ListView listView =(ListView) view.findViewById(R.id.listMain);



        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                mainItem
        );


        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {

                    Intent myIntent =new Intent(view.getContext(), CraveS.class);
                    startActivityForResult(myIntent,0);
                }

                else if (position == 1) {

                    Intent myIntent =new Intent(view.getContext(), Tbone.class);
                    startActivityForResult(myIntent,0);
                }
                else if (position == 2) {

                    Intent myIntent =new Intent(view.getContext(), Spag.class);
                    startActivityForResult(myIntent,0);
                }
                else if (position == 3) {

                    Intent myIntent =new Intent(view.getContext(), Fried.class);
                    startActivityForResult(myIntent,0);
                }


            }
        });


        return view;





    }
}