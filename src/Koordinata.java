public class Koordinata {

    private int x;
    private int y;

    public Koordinata(int x, int y)throws IllegalArgumentException{

        if(x<0 || y<0 ){
            throw new IllegalArgumentException("Koordinata ne smije biti negativna");
        }
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
