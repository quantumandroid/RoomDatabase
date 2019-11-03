package com.e.roomdatabase.room.database;


import com.e.roomdatabase.room.dao.TaskDao;
import com.e.roomdatabase.room.entity.Task;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}