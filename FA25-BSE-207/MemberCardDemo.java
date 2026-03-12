public class MemberCardDemo {
public static void main(String[] args) {
        
MemberCard m1 = new MemberCard();
MemberCard m2 = new MemberCard("Ali"); 
MemberCard m3 = new MemberCard("Sana", "BBA");
MemberCard m4 = new MemberCard("John", "BSSE", 3, 500, true);
MemberCard m5 = new MemberCard("Lisa", "BBA", 2, 300, false);
MemberCard m6 = new MemberCard(m4); 

m2.payFee(200);
m5.activateCard();
m3.deactivateCard();

System.out.println(m1);
System.out.println(m2);
System.out.println(m3);
System.out.println(m4);
System.out.println(m5);
System.out.println(m6);
        
System.out.println("Total Cards Created: " + MemberCard.getTotalCards());}
}