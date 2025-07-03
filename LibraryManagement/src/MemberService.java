import java.util.ArrayList;
import java.util.List;

public class MemberService {
    private List<Member> memberList =new ArrayList<>();
    private Member currentMember= null;

    public void registerMember(String memberName,String memberId,String concat){
        Member member=new Member(memberName,memberId,concat);
        memberList.add(member);
        System.out.println("Registration is Successful!");
    }

    public boolean loginMember(String memberId) {
        for (Member member:memberList) {
            if (!member.getMemberId().equalsIgnoreCase(memberId)) {
                System.out.println("No Member Found with this Member Id");
                return false;
            }
        }
        currentMember = new Member();
        System.out.println("Welcome : "+currentMember.getMemberName()+"!");
        return true;
    }

    public void logOutMember() {
        if (currentMember!=null) {
            System.out.println("Logged Out "+currentMember.getMemberName());
        }
        currentMember=null;
    }

    public Member getCurrentMember() {
        return currentMember;
    }

    public boolean isLoggedIn() {
        return currentMember!=null;
    }
}

