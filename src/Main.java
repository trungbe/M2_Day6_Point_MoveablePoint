public class Main {

    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(6.4f, 5.6f);
        System.out.println(point.toString());

        System.out.println("----------------");
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setSpeed(3.4f, 2.3f);
        System.out.println(movablePoint.move());

    }
}
