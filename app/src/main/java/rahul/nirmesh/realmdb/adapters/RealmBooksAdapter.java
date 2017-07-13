package rahul.nirmesh.realmdb.adapters;

import android.content.Context;

import io.realm.RealmResults;
import rahul.nirmesh.realmdb.model.Book;

/**
 * Created by N I R M E S H on 2017-07-13.
 */

public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {
        super(context, realmResults, automaticUpdate);
    }
}
