package com.acewill.androidlearn.ui.activity;

import android.content.Intent;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.acewill.androidlearn.databinding.ActivityMainBinding;
import com.acewill.androidlearn.ui.activity.kotlin.RecyclerViewSelectionActivity;
import com.acewill.androidlearn.ui.adapter.MainAdapter;
import com.acewill.androidlearn.ui.base.BaseActivity;
import com.acewill.androidlearn.ui.view.DividerDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    private static final List<String> dataSource;

    static {
        dataSource = new ArrayList<>();
        dataSource.add("Room数据库");
        dataSource.add("LiveData");
        dataSource.add("Rxjava");
        dataSource.add("Kotlin");
    }

    @Override
    protected void initView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.rvMain.setLayoutManager(layoutManager);
        binding.rvMain.addItemDecoration(new DividerDecoration(this,DividerDecoration.VERTICAL_LIST));
        MainAdapter adapter = new MainAdapter(dataSource);
        binding.rvMain.setAdapter(adapter);
        adapter.setOnItemClickListener(position -> {
            switch (position){
                case 0:
                    startActivity(new Intent(this,RoomLearnActivity.class));
                    break;
                case 3:
                    startActivity(new Intent(this, RecyclerViewSelectionActivity.class));
                    break;
                default:
                    break;
            }

        });
    }
}