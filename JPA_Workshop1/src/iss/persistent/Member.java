package iss.persistent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Members")
public class Member extends Person implements Comparable<Member> {

	@Id
	private int memberNumber;

	public Member () {}
	
    public Member (String surname, String firstName, String secondName,
						int memberNumber) {
        super (surname, firstName, secondName);
        this.memberNumber = memberNumber;
    }

    public int getMemberNumber () {
        return memberNumber;
    }
    
    public void setMemberNumber (int memberNumber) {
    	this.memberNumber = memberNumber;
    }
    
    public String toString () {
        return (memberNumber + " - " + super.toString ());
    }
    //  Added so that Members can be sorted by membership number
    public int compareTo (Member other) {
        return (getMemberNumber() - other.getMemberNumber());
    }
}
