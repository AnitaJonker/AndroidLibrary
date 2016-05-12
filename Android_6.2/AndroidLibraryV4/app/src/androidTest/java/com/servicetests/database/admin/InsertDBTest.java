package com.servicetests.database.admin;

import android.content.Intent;
import android.test.AndroidTestCase;

/**
 * Created by Anita on 2016/05/12.
 */

/*
I used intent service to insert values since I am not receiving values back when inserting in the files.
 */

public class InsertDBTest extends AndroidTestCase{

    public void testUpdate() throws Exception
    {
        Intent intent = new Intent(this.getContext(), InsertDBTest.class);
        this.getContext().startService(intent);
    }
}
