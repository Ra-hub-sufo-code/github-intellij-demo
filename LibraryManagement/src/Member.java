public class Member {
    private String memberName;
    private String memberFullName;
    private int memberId;
    private int counter=1001;
    private String contact;

    public Member(String memberName,String contact,String memberFullName) {
        this.memberFullName=memberFullName;
        this.memberId=counter++;
        this.memberName = memberName;
        this.contact = contact;
    }

    public Member() {}

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberFullName() {
        return memberFullName;
    }

    public void setMemberFullName(String memberFullName) {
        this.memberFullName = memberFullName;
    }

    public int getMemberId() {
        return memberId=counter;
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
