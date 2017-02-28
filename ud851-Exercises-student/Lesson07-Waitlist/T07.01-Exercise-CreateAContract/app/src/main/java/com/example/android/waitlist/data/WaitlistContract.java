package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public class WaitlistContract {



    // TODO (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface

        // TODO (2) Inside create a static final members for the table name and each of the db columns
        // TABLE_NAME -> waitlist;
        // COLUMN_GUEST_NAME -> guestName
        // COLUMN_PARTY_SIZE -> partySize
        // COLUMN_TIMESTAMP -> timestamp
    public static final class WaitListEntry implements BaseColumns{
            static final String TABLE_NAME = "waitlist";
            static final String COLUMN_GUEST_LIST = "guestName";
            static final String COLUMN_PARTY_SIZE = "partySize";
            static final String COLUMN_TIMESTAMP = "timestamp";
        }

}
