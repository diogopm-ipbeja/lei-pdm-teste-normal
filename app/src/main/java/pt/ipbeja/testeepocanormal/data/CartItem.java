package pt.ipbeja.testeepocanormal.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CartItem {

    @PrimaryKey(autoGenerate = true)
    private long id;

    public CartItem(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
