package com.example.android.hackathonapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Shubhang on 4/3/2015.
 */
public class ListAdapter extends ArrayAdapter<String> {
    Context context;
    String[] items;
    String[]quantities;

    public ListAdapter(Context context, String[] items, String[] quantities) {
        super(context, R.layout.list_item, items);
        /*
        this.context = context;
        this.items = items;
        this.quantities = quantities;
        */
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        /*
        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService (Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.list_item, null);
        }
        TextView item = (TextView) rowView.findViewById(R.id.item);
        TextView quantity = (TextView) rowView.findViewById(R.id.quantity);

        item.setText(items[position]);
        quantity.setText(quantities[position]);
        */

        return rowView;
    }
}
