package com.acewill.androidlearn.roomdb;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.acewill.androidlearn.roomdb.dao.UserDao;
import com.acewill.androidlearn.roomdb.entity.User;

/**
 * @author: liyaxi
 * @date: 2020-11-05
 * @description:
 */
@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
