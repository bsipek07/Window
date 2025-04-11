public class Main {

    public static void main(String[] args){

        Prozor window1 = new Prozor("Prozor");
try {
    window1.setA(10,30);
    window1.setB(90,30);
    window1.setC(10,55);
    window1.setD(90,55);

    if(window1.A.getX() == window1.B.getX() || window1.C.getX() == window1.D.getX() || window1.A.getY()==window1.C.getY() || window1.C.getY()==window1.B.getY()){
        throw new IllegalArgumentException("Koordinate ne smiju biti iste");
    }
}catch (IllegalArgumentException e){
    System.out.println(e.getMessage());

}

        window1.setBoja("bijela");
        window1.setOznaka("p1");
        window1.setOpen(false);

        System.out.println(window1.toString());

       System.out.println("Sirina: "+window1.width()+"\nVisina: "+window1.height());


     //  window1.draw();


    }
}
