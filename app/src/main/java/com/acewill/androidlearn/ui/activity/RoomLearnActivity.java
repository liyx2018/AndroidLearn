package com.acewill.androidlearn.ui.activity;

import android.view.View;

import com.acewill.androidlearn.R;
import com.acewill.androidlearn.databinding.ActivityRoomLearnBinding;
import com.acewill.androidlearn.ui.base.BaseActivity;

public class RoomLearnActivity extends BaseActivity<ActivityRoomLearnBinding> implements View.OnClickListener {

    @Override
    protected void initView() {



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_add:

                break;
            case R.id.btn_remove:

                break;
            case R.id.btn_update:

                break;
            case R.id.btn_query:

                break;
            default:
                break;
        }
    }
}