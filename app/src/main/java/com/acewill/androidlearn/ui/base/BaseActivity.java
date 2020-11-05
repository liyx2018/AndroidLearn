package com.acewill.androidlearn.ui.base;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BaseActivity<T extends ViewBinding> extends AppCompatActivity {

    protected T binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //通过反射获取当前Activity的ViewBinding
        Type type = this.getClass().getGenericSuperclass();
        if (type instanceof ParameterizedType){
            try {
                Class<T> clazz =  (Class<T>)((ParameterizedType) type).getActualTypeArguments()[0];
                Method method = clazz.getMethod("inflate", LayoutInflater.class);
                binding = (T)method.invoke(null,getLayoutInflater());
            }catch (Exception e){
                e.printStackTrace();
            }
            setContentView(binding.getRoot());
        }
        initView();
    }

    protected abstract void initView();

}