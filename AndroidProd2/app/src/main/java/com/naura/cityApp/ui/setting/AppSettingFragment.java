package com.naura.cityApp.ui.setting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.naura.cityApp.observercode.Observable;
import com.naura.cityApp.observercode.Observer;
import com.naura.cityApp.ui.BaseActivity;
import com.naura.myapplication.R;

public class AppSettingFragment extends Fragment implements Observer {
    private FloatingActionButton floatingActionButton;
    private Switch switchHumidity;
    private Switch switchDescription;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.app_settings, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        floatingActionButton=view.findViewById(R.id.applySettfloatingActionButton);
        switchHumidity=view.findViewById(R.id.switchHumidity);
        switchDescription=view.findViewById(R.id.switchDescription);
    }


    @Override
    public <T> void update(String eventName, T val) {

    }
}
