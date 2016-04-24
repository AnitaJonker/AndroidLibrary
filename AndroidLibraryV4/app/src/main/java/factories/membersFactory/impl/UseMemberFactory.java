package factories.membersFactory.impl;

import factories.membersFactory.MemberFactory;
import domain.members.MemberDetails;
import domain.members.impl.Member;

/**
 * Created by Anita on 2016/04/16.
 */
public class UseMemberFactory implements MemberFactory {

    public MemberDetails getMember() {
        return new Member().registerMember();
    }
}

