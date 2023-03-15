package world_of_java.world;

public class Point2D {

    //Attribut
    private int x;
    private int y;

    public void translater(int pDx, int pDy){
       /*
       *  x += pDx;
       *  y += pDy;
       * */
        setX(getX() + pDx);
        setY(getY() + pDy);
    }

    public void afficherPoint() {
        System.out.println("["+getX()+" , "+getY()+"]");

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
