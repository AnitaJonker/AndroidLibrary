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



