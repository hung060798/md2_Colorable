public class Main{
    public static void main(String[] args) {
        Square[] suares = new Square[3];
        suares[0] = new Square(2);
        suares[1] = new Square(3);
        suares[2] = new Square(4);

        for (Square s : suares
             ) {
            System.out.println(s.Area());
            if (s instanceof Colorable ){
                s.howToColor();
            }
        }

    }
}
