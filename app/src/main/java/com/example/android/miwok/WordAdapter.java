package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, ArrayList<Word> resource ,int mcolorResourceId) {
        super(context, 0,resource);
        mColorResourceId = mcolorResourceId;
    }

    @NonNull
    @Override
           public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }


        Word currentWord=getItem(position);

        TextView default_text_viewTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        default_text_viewTextView.setText(currentWord.getmDefaultTranslation());

        TextView miwok_text_viewTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwok_text_viewTextView.setText(currentWord.getmMiwokTranslation());

        // image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img);

        if (currentWord.hasImage()){

            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);

        }else {
            imageView.setVisibility(View.GONE);
        }

        // background color
        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(),mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;


    }
}
