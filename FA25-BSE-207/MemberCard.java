public class MemberCard{

private static int counter=1;
private static final String PREFIX="LIB-";
private String cardNo;
private String studentName;
private String department;
private int semester;
private double feePaid;
private boolean active=true;

public MemberCard() {
 this("Unknown", "BSSE", 1, 0.0, true);
 }

public MemberCard(String studentName, String department, int semester, double feePaid, boolean active){
this.cardNo=generateCardNO();
this.studentName=studentName;
this.department=department;
this.semester=semester;
this.feePaid=feePaid;
this.active=active;
}

public MemberCard(String studentName){
this(studentName,"unknown",1,0.0,true);
}

public MemberCard(String studentName, String department){
this(studentName,department,1,0.0,true);
}

public MemberCard(MemberCard other){
this(other.studentName,other.department,other.semester,other.feePaid,other.active);
}

public static String generateCardNO(){
return PREFIX + String.format("%04d",counter++);
}

public static int getTotalCards(){
return counter-1;
}

public void deactivateCard(){
this.active=false;
}

public void activateCard(){
this.active=true;
}

public void payFee(double amount) {
if (amount > 0) {
 this.feePaid += amount;
} else {
System.out.println("Cannot be negative.");
}}

public String toString() {
return cardNo + " " + studentName + " " + department + " " + semester +" Fee: " + feePaid + " Active: " + active;
}


















}