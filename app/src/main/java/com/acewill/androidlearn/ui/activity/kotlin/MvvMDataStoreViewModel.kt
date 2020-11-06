package com.acewill.androidlearn.ui.activity.kotlin

import androidx.lifecycle.ViewModel
import com.acewill.androidlearn.repository.IDataStoreRepository
import com.acewill.androidlearn.repository.IRepository

/**
 * @author: liyaxi
 * @date: 2020-11-06
 * @description:
 */
class MvvMDataStoreViewModel constructor(private val spRepo: IRepository,
                                         private val dataStoreRepo: IDataStoreRepository): ViewModel() {


}