package msh.myonlineshop.localDbHandler;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import msh.myonlineshop.localDbHandler.base.LocalDbHandler;
import msh.myonlineshop.models.User;

public class UserDbHandler extends LocalDbHandler<User> {

    public UserDbHandler(Context context) {
        super(context);
    }

    @Override
    public String getTableName() {
        return "User";
    }

    @Override
    public String getCreateTableQuery() {
        return "CREATE TABLE IF NOT EXISTS " + getTableName() +
                "(" + User.key_id + " INTEGER PRIMARY KEY," +
                User.key_customerId + " INTEGER," +
                User.key_username + " TEXT," +
                User.key_firstname + " TEXT," +
                User.key_lastname + " TEXT," +
                User.key_token + " TEXT)";
    }

    @Override
    public String getDropTableQuery() {
        return "DROP TABLE IF EXISTS " + getTableName();
    }

    public User getLatestUser() {
        String sqlStr = "select * from " + getTableName() + " order by " + User.key_id + " desc";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sqlStr, null);

        if (cursor != null)
            cursor.moveToFirst();

        User user;
        if (cursor.getCount() == 0)
            user = null;
        else
            user = new User(cursor);

        db.close();
        return user;
    }

    public  void deleteAllUsers()
    {
        String qryStr = "delete from "+getTableName();
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(qryStr);
        db.close();
    }

}