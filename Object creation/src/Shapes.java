public abstract class Shapes{
    int x,y;

    abstract void Draw();
    abstract void Remove();

    public void moveShape(int newX,int newY){
        this.x=newX;
        this.y=newY;
        System.out.println("Shape is moving to:" +"("+ newX + "," + newY +")" );
    }
}