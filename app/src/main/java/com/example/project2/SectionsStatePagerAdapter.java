package com.example.project2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class SectionsStatePagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public SectionsStatePagerAdapter(FragmentManager fm){
        super(fm);
    }

    /* Method that adds fragment to Fragment List */
    public void addFragment(Fragment fragment, String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public static class LockableViewPager extends ViewPager {

        private boolean swipeable;

        public LockableViewPager(Context context) {
            super(context);
        }

        public LockableViewPager(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public boolean getSwipeLocked() {
            return swipeable;
        }

        public void setSwipeLocked(boolean swipeLocked) {
            this.swipeable = swipeLocked;
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            return !swipeable && super.onTouchEvent(event);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent event) {
            return !swipeable && super.onInterceptTouchEvent(event);
        }

        @Override
        public boolean canScrollHorizontally(int direction) {
            return !swipeable && super.canScrollHorizontally(direction);
        }


    }
}

