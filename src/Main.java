public class Main {

    public static void main(String[] args){

        Prozor window1 = new Prozor("Prozor");

        window1.setA(1,3);
        window1.setB(5,4);
        window1.setC(6,9);
        window1.setD(8,10);
        window1.setBoja("bijela");
        window1.setOznaka("p1");
        window1.setOpen(false);


        System.out.println(window1.toString());

      //  System.out.println("Sirina: "+window1.width()+"\nVisina: "+window1.height());


       // window1.draw();


    }
}
