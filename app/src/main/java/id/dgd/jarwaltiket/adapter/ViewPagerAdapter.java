package id.dgd.jarwaltiket.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import id.dgd.jarwaltiket.R;

/**
 * By rednull on 9/14/2017.
 */

public class ViewPagerAdapter extends PagerAdapter {

    // VARIABLES
    private Context context;
    private int[] images = {
            R.drawable.img_pager_1,
            R.drawable.img_pager_2,
            R.drawable.img_pager_3,
            R.drawable.img_pager_1
    };

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_viewpager, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_viewpager);
        imageView.setImageResource(images[position]);

        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view, 0);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);

    }
}
