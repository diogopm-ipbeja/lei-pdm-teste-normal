package pt.ipbeja.testeepocanormal.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.Objects;

@Database(entities = {CartItem.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE = null;


    public static AppDatabase getInstance(Context context) {
        Context appContext = Objects.requireNonNull(context).getApplicationContext();
        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(appContext, AppDatabase.class, "shop_db")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }

    public abstract CartItemDao cartItemDao();

}
