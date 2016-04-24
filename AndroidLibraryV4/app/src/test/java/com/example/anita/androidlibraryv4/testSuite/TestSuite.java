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



