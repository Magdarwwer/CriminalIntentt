package com.bignerdranch.android.criminalintent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.util.List;
import com.FragmentAdapterInterface;

public class CrimeAdapter extends RecyclerView.Adapter<CrimeAdapter.FragmentViewHolder> implements FragmentAdapterInterface {

    private List<Crime> mCrimes;
    public CrimeAdapter(List<Crime> crimes) {
        mCrimes = crimes;
    }

    @Override
    public FragmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item_crime, parent, false);
        return new FragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FragmentViewHolder holder, int position) {
        Crime crime = mCrimes.get(position);
        holder.bind(crime);
    }

    @Override
    public int getItemCount() {
        return mCrimes.size();
    }

    public class FragmentViewHolder extends RecyclerView.ViewHolder {
        private TextView mTitleTextView;
        private TextView mDateTextView;
        private CheckBox mSolvedCheckBox;
        public FragmentViewHolder(View itemView) {
            super(itemView);
            mTitleTextView = itemView.findViewById(R.id.crime_title);
            mDateTextView = itemView.findViewById(R.id.crime_date);
            mSolvedCheckBox = itemView.findViewById(R.id.crime_solved);
        }

        public void bind(Crime crime) {
            mTitleTextView.setText(crime.getTitle());
            mDateTextView.setText(crime.getDate().toString());
            mSolvedCheckBox.setChecked(crime.isSolved());
        }
    }

}
