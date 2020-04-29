package edu.rys5477.crave.ui.drinks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import edu.rys5477.crave.R;

public class ListAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.drinks, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);

    }

    @Override
    public int getItemCount() {

        return DrinkList.drinktitle.length;

    }


    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mDrinkTitle;
        private TextView mDrinkDesc;
        private ImageView mDrinkImage;


        public ListViewHolder(View itemView) {
            super((itemView));
            mDrinkTitle = (TextView) itemView.findViewById(R.id.DrinkTitle);
            mDrinkDesc = (TextView) itemView.findViewById(R.id.DrinkDesc);
            mDrinkImage = (ImageView) itemView.findViewById(R.id.DrinkImage);
            itemView.setOnClickListener(this);


        }


        public void bindView(int position) {
            mDrinkTitle.setText(DrinkList.drinktitle[position]);
            mDrinkDesc.setText(DrinkList.drinkdesc[position]);
            mDrinkImage.setImageResource(DrinkList.drinkimage[position]);
        }

        public void onClick(View view) {


        }
    }
}
