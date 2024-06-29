package com;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import com.bignerdranch.android.criminalintent.R;

public class FragmentAdapter extends RecyclerView.Adapter<FragmentAdapter.FragmentViewHolder> implements FragmentAdapterInterface {

    private final FragmentActivity fragmentActivity;

    public FragmentAdapter(FragmentActivity fragmentActivity) {
        this.fragmentActivity = fragmentActivity;
    }

    @NonNull
    @Override
    public FragmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate a container for the fragment
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_container, parent, false);
        return new FragmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FragmentViewHolder holder, int position) {
        // Dynamically add fragment to the container
        FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = new MyFragment();
        fragmentTransaction.replace(holder.fragmentContainer.getId(), fragment);
        fragmentTransaction.commit();
    }

    //@Override
    public int getItemCount() {
        // Return the number of items (for demonstration, assuming a fixed size)
        return 10;
    }

    static class FragmentViewHolder extends RecyclerView.ViewHolder {
        ViewGroup fragmentContainer;

        FragmentViewHolder(View itemView) {
            super(itemView);
            fragmentContainer = itemView.findViewById(R.id.fragment_container);
        }
    }



}
