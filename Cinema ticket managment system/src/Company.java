public class Company {
    private String companyName;
    private Branch[]branches;

    public Company(String companyName,int numberofBranches){
        this.companyName=companyName;
        branches=new Branch[numberofBranches];
    }
    public void addBranch(int index,Branch branch){
        branches[index]=branch;
    }
    public void displayCompany(){

        System.out.println("Company Name: " + companyName);

        for(int i = 0; i < branches.length; i++){

            if(branches[i] != null){
                System.out.println("Branch " + (i+1) + ":");
                branches[i].displayBranch();
            }
        }
    }
    }

