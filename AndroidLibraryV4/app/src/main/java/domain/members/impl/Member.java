<<<<<<< HEAD
package domain.members.impl;

import domain.members.MemberDetails;
import domain.members.RegisterMember;

/**
 * Created by Anita on 2016/04/16.
 */
public class Member implements RegisterMember
{
    public MemberDetails registerMember()
    {
        MemberDetails member = new MemberDetails.Builder()
                .name("Anita")
                .surname("Jonker")
                .address("Almeria str4")
                .address("Gotham 87")
                .libraryBranch("Durbanville")
                .cardNumber("0N12586331")
                .build();
        return member;
    }

=======
package domain.members.impl;

import domain.members.MemberDetails;
import domain.members.RegisterMember;

/**
 * Created by Anita on 2016/04/16.
 */
public class Member implements RegisterMember
{
    public MemberDetails registerMember()
    {
        MemberDetails member = new MemberDetails.Builder()
                .name("Anita")
                .surname("Jonker")
                .address("Almeria str4")
                .address("Gotham 87")
                .libraryBranch("Durbanville")
                .cardNumber("0N12586331")
                .build();
        return member;
    }

>>>>>>> 3f4401acfd7d3290b2ac0e2f99049c6ccae0b211
}