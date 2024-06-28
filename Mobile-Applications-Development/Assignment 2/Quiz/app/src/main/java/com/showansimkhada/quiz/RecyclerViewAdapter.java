package com.showansimkhada.quiz;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    // creating variables
    private Context context;
    private Cursor cAdp;

    // creating the constructor for the RecyclerViewAdapter
    public RecyclerViewAdapter(Context context, Cursor cursor)
    {
        this.context = context;
        this.cAdp = cursor;
    }


    // using the super class RecyclerView.ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView_profile_display;
        public TextView textView_score_display;
        public LinearLayout sample_layout;

        // passing the item to the ViewHolder
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_profile_display = itemView.findViewById(R.id.textView_profile_display);
            textView_score_display = itemView.findViewById(R.id.textView_score_display);
            sample_layout = itemView.findViewById(R.id.sample_layout);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        // inflating the layout
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.sample, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        if(!cAdp.moveToPosition(i))
        {
            return;
        }
        final String profile = cAdp.getString(cAdp.getColumnIndex(Data.dataEntry.COLUMN_PROFILE));
        final int score = cAdp.getInt(cAdp.getColumnIndex(Data.dataEntry.COLUMN_SCORE));
        long num = cAdp.getLong(cAdp.getColumnIndex(Data.dataEntry._ID));

        viewHolder.textView_profile_display.setText(profile);
        viewHolder.textView_score_display.setText(String.valueOf(score));
        viewHolder.itemView.setTag(num);

        viewHolder.sample_layout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent quiz = new Intent(context, Quiz.class);
                // sending the profile value to next activity
                quiz.putExtra("profile", profile);
                context.startActivity(quiz);
            }
        });
    }

    // counting the items using the cursor
    @Override
    public int getItemCount()
    {
        return  cAdp.getCount();
    }

    // changing the cursor in the sql database
    public void chageCursor(Cursor newCursor)
    {
        if(cAdp != null)
        {
            cAdp.close();
        }

        cAdp = newCursor;

        if(newCursor != null)
        {
            notifyDataSetChanged();
        }
    }

}
