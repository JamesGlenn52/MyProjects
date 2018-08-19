package com.example.rc.earthquake;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> quake, int resource) {
        super(context, 0, quake);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(

                    R.layout.list_layout, parent, false);

        }
        Earthquake currentWord = getItem(position);

        TextView englishword = (TextView) listItemView.findViewById(R.id.textView);





        return super.getView(position, convertView, parent);
    }
}
