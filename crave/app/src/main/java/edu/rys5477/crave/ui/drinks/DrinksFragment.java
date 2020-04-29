package edu.rys5477.crave.ui.drinks;


import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import edu.rys5477.crave.R;
public class DrinksFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater,@NonNull
            ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_drinks, container, false);


        RecyclerView recyclerView =(RecyclerView) view.findViewById(R.id.listRecycleView);


        return view;
    }
}