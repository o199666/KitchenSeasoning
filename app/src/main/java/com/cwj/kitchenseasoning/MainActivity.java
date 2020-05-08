package com.cwj.kitchenseasoning;

import android.os.Bundle;
import android.util.Log;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.cwj.kitchenseasoning.base.BaseActivity;
import com.cwj.kitchenseasoning.databinding.ActivityMainBinding;

import static androidx.navigation.Navigation.findNavController;

public class MainActivity extends BaseActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();
        NavHostFragment navHostFragment= (NavHostFragment) fragmentManager.findFragmentById(R.id.fragmen);
        NavController navController=navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.navViewBottom,navController);
        Log.d("MainActivity", "onCreate");

    }

    @Override
    public void initData() {

    }

    @Override
    public boolean onSupportNavigateUp() {
        return findNavController(this, R.id.nav_view_bottom).navigateUp();
    }
}
