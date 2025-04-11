public class Prozor {

    private String naslov;
    private String oznaka;
    private String boja;
    private boolean open;
    Koordinata A = new Koordinata(0, 0);
    Koordinata B = new Koordinata(0, 0);
    Koordinata C = new Koordinata(0, 0);
    Koordinata D = new Koordinata(0, 0);

    public Prozor(String naslov) {

        this.naslov = naslov;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public int getD() {
        return D.getX() + D.getY();
    }

    public void setD(int x, int y) {
        D.setX(x);
        D.setY(y);
    }

    public int getC() {
        return C.getX() + C.getY();
    }

    public void setC(int x, int y) {
        C.setX(x);
        C.setY(y);
    }

    public int getB() {
        return B.getX() + B.getY();
    }

    public void setB(int x, int y) {
        B.setX(x);
        B.setY(y);
    }


    public int getA() {
        return A.getX() + A.getY();
    }

    public void setA(int x, int y) {
        A.setX(x);
        A.setY(y);
    }


    @Override
    public String toString() {
        return "naslov='" + naslov +
                ", oznaka='" + oznaka +
                ", boja='" + boja +
                ", open=" + open +
                ", A(" + A.getX() + "," + A.getY() + ")"
                + ", B(" + B.getX() + "," + B.getY() + ")" +
                ", C(" + C.getX() + "," + C.getY() + ")" +
                ", D(" + D.getX() + "," + D.getY() + ")";
    }

    public double width() {
        double veci = A.getX();
        double manji = B.getX();
        if (veci < B.getX()) {
            veci = B.getX();
            manji = A.getX();
        }

        return veci - manji;
    }

    public double height() {
        double veci = A.getY();
        double manji = C.getY();
        if (veci < C.getY()) {
            veci = C.getY();
            manji = A.getY();
        }
        return veci - manji;
    }

    public double area() {
        return height() * width();
    }

    public double perimiter() {
        return 2 * (height() + width());
    }

    public void draw() {
        int sirina = (int) Math.round(width());
        int visina = (int) Math.round(height());
        for (int i = 0; i < sirina; i++) {
            for (int j = 0; j < visina; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
