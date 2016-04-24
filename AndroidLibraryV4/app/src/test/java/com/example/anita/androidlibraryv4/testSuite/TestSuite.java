<<<<<<< HEAD
package com.example.anita.androidlibraryv4.testSuite;

import com.example.anita.androidlibraryv4.testBookSystem.TestBooks;
import com.example.anita.androidlibraryv4.testMembers.TestMember;
import com.example.anita.androidlibraryv4.testAdmin.TestWorker;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


    @RunWith(Suite.class)
    @Suite.SuiteClasses({
    TestBooks.class,
            TestMember.class,
            TestWorker.class
    })


    public class TestSuite {}



=======
package com.example.anita.androidlibraryv4.testSuite;

import com.example.anita.androidlibraryv4.testBooks.TestBooks;
import com.example.anita.androidlibraryv4.testMember.TestMember;
import com.example.anita.androidlibraryv4.testWorker.TestWorker;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


    @RunWith(Suite.class)
    @Suite.SuiteClasses({
    TestBooks.class,
            TestMember.class,
            TestWorker.class
    })


    public class TestSuite {}



>>>>>>> 3f4401acfd7d3290b2ac0e2f99049c6ccae0b211
