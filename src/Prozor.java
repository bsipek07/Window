public class Prozor {

    private String naslov;
    private String oznaka;
    private String boja;
    private boolean open;
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Prozor(String naslov, String oznaka, String boja, boolean open, double x1, double y1, double x2, double y2) throws IllegalArgumentException{

        if(x1<0 || x2<0 || y1<0 || y2<0){
            throw new IllegalArgumentException("Koordinata ne smije biti negativna");
        }


        this.naslov = naslov;
        this.oznaka = oznaka;
        this.boja = boja;
        this.open = open;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
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

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "naslov='" + naslov +
                ", oznaka='" + oznaka +
                ", boja='" + boja +
                ", open=" + open +
                ", A(" + x1 +"," +y1 +")"
                +", B("+x2+","+y2+")";
    }

    public double width(){
        double veci=x1;
        double manji=x2;
        if(veci<x2){
            veci=x2;
            manji=x1;
        }

        return veci-manji;
    }

    public double height(){
        double veci=y1;
        double manji=y2;
        if(veci<y2){
            veci=y2;
            manji=y1;
        }
        return veci-manji;
    }

    public double area(){
        return height()*width();
    }

    public double perimiter(){
        return 2*(height()+width());
    }

    public void draw(){
       int sirina=(int)Math.round(width());
       int visina=(int)Math.round(height());
        for(int i=0;i<sirina;i++){
            for(int j=0;j<visina;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }




}
