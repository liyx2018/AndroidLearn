package com.acewill.androidlearn.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/**
 * @author: liyaxi
 * @date: 2020-11-05
 * @description:
 */
public class TestViewModel extends ViewModel {


    private final String mKey;
    private MutableLiveData<String> mNameEvent = new MutableLiveData<>();

    public MutableLiveData<String> getNameEvent() {
        return mNameEvent;
    }

    public TestViewModel(String key) {
        mKey = key;
    }

    public static class Factory implements ViewModelProvider.Factory {
        private String mKey;

        public Factory(String key) {
            mKey = key;
        }

        @Override
        public <T extends ViewModel> T create(Class<T> modelClass) {
            return (T) new TestViewModel(mKey);
        }
    }

    public String getKey() {
        return mKey;
    }



}
