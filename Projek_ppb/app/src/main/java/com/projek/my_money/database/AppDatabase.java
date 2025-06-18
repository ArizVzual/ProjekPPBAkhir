package com.projek.my_money.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.projek.my_money.database.dao.DatabaseDao;
import com.projek.my_money.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
