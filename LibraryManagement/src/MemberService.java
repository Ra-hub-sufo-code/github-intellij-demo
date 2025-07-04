import java.util.HashMap;
import java.util.Map;

public class MemberService {
    public static Map<String,Member> memberMap =new HashMap();
    private Member currentMember= null;

    public boolean registerMember(String memberName,String concat,String memberFullName){
        if (memberMap.containsKey(memberName)){
            System.out.println("Member Name Already taken,Please Choice another");
            return false;
        }
        Member member=new Member(memberName,concat,memberFullName);
        memberMap.put(memberName,member);
        System.out.println("Registration Successful!");
        return true;
    }

    public boolean loginMember(String memberName) {
        if (!memberMap.containsKey(memberName)){
            System.out.println("No Member Found with this Member Name");
            return false;
        }
        Member member=memberMap.get(memberName);
        currentMember = member;
        System.out.println("Welcome : "+currentMember.getMemberFullName()+"!");
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

