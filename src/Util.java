public class Util {

    public static void DrawShape(Shapes shapes[]){
        for(Shapes s:shapes){
            if (s!=null)
                s.Draw();

        }
    }

    public static void RemoveShape(Shapes shapes[]){
        for(Shapes s:shapes) {
            if (s != null)
                s.Remove();
        }

    }
}
