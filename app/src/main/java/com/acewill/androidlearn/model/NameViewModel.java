package com.acewill.androidlearn.model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author: liyaxi
 * @date: 2020-11-05
 * @description:
 */
public class NameViewModel extends ViewModel {


    private MutableLiveData<String> currentName;

    public MutableLiveData<String> getCurrentName() {
        if (currentName == null) {
            currentName = new MutableLiveData<String>();
        }
        return currentName;
    }



}
