package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {


    public ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SectionsStatePagerAdapter mSectionsStatePagerAdapter = new SectionsStatePagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        //setup pager
        setupViewPager(mViewPager);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    public void setupViewPager(ViewPager viewPager) {
        SectionsStatePagerAdapter adapter = new SectionsStatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new opening_fragment(),"OpeningFragment1"); //0
        adapter.addFragment(new choice_fragment(), "ChoiceFragment2"); //1
        adapter.addFragment(new adopter_login_fragment(), "AdopterFragment3 "); //2
        adapter.addFragment(new adopter_register_fragment(), "AdopterRegisterFragment4"); //3
        adapter.addFragment(new adopter_home_fragment(), "AdopterHomeFragment");//4
        adapter.addFragment(new shelter_login_fragment(), "ShelterLoginFragment");//5
        adapter.addFragment(new shelter_register_fragment(), "ShelterRegisterFragment");//6
        adapter.addFragment(new shelter_home_fragment(), "ShelterHomeFragment");//7
        adapter.addFragment(new shelter_add_animal_fragment(), "ShelterAddAnimal");//8

        viewPager.setAdapter(adapter);
    }



    public void setViewPager(int fragmentNumber){ mViewPager.setCurrentItem(fragmentNumber);
    }

    /*private Stack<Integer> pageStack = new Stack<Integer>();

    @Override
    public void onBackPressed() {
        pageStack.pop();
        if (pageStack.isEmpty()){
            super.onBackPressed();
        }
        else{
            loadPage(pageStack.pop());
        }

    }*/
}

