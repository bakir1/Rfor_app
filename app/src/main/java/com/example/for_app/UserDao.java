package com.example.for_app;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {

    @Insert
    void registerUser(UserEntitiy userEntitiy);

    @Query("SELECT * from users where userId=(:userId) and password=(:password)")
    UserEntitiy login(String userId, String password);
}
