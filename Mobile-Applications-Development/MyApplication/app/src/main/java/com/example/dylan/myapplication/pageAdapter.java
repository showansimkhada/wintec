package com.example.dylan.myapplication;

import android.content.Context;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class pageAdapter extends PagerAdapter{
    private Context context;
    private LayoutInflater layoutInflater;
    private workoutitem image;


        public pageAdapter(Context context, workoutitem image) {
        this.context = context;
        this.image = image;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public  boolean isViewFromObject(View view, Object object){
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position){

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.sample, null);
        ImageView imageView1 = view.findViewById(R.id.workimage1);
        ImageView imageView2 = view.findViewById(R.id.workimage2);
        imageView1.setImageResource(image.image);
        imageView2.setImageResource(image.description);
        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);
        return view;

    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}
