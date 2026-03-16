public class Branch {

    private String BranchName;
    private String city;
    private String address;
    private Screen[] screens;

    public Branch(String BranchName,String city,String address,int NumberofScreens){

        this.BranchName=BranchName;
        this.city=city;
        this.address=address;

        screens=new Screen[NumberofScreens];
    }

    public void addScreen(int index,Screen screen){
        screens[index]=screen;
    }

    public void displayBranch(){

        System.out.println("Branch: " + BranchName +
                " City: " + city );

        for(Screen s : screens){
            if(s!=null)
                s.displayScreen();
        }
    }
}