package com.example.yyt.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by YYT on 2017/1/17.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
