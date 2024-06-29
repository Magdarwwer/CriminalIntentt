package com.bignerdranch.android.criminalintent;

import androidx.fragment.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment(); // Replace with your fragment instance
    }
}

//. This new Activity will contain a fragment called CrimeListFragment
