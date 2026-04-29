public class Main {
    static void main(String[] args) {

        Shapes s1;

        s1=new Rectangle();
        s1.Draw();
        s1.Remove();
        s1.moveShape(4,8);

        s1=new Pentagon();
        s1.Draw();
        s1.Remove();
        s1.moveShape(3,7);

        Shapes [] shapes=new Shapes[5];
        shapes[0]=new Rectangle();
        shapes[1]=new Pentagon();
        shapes[2]=new Pentagon();
        shapes[3]=new Rectangle();
        shapes[4]=new Rectangle();


        Util.DrawShape(shapes);
        Util.RemoveShape(shapes);

        System.out.println("=========================");
        System.out.println("Moving only Rectangles");
        for(Shapes s:shapes) {
            if (s instanceof Rectangle)
                s.moveShape(5, 9);
        }
    }
}
