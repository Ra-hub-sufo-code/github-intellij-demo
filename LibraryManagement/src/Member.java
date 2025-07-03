public class Member {
    private String memberName;
    private String memberId;
    private String contact;

    public Member(String memberName, String memberId, String contact) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.contact = contact;
    }

    public Member() {}

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return memberName+" ("+memberId+")";
    }
}
