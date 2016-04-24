package com.example.anita.androidlibraryv4.testMembers;


import junit.framework.Assert;

import org.junit.Test;

import factories.membersFactory.impl.UseMemberFactory;

/**
 * Created by Anita on 2016/04/16.
 */
public class TestMember {
    @Test
    public void testMemberName() throws Exception {
        UseMemberFactory memberFactory = new UseMemberFactory();
        Assert.assertEquals(memberFactory.getMember().getName(),"Anita");
    }

}
