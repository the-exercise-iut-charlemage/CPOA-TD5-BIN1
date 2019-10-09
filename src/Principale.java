public class Principale {;

    public static void main(String[] args) {
        CompterJusque2 cmp = new CompterJusque2(1);
        CompterJusque2 cmp2 = new CompterJusque2(2);
        CompterJusque2 cmp3 = new CompterJusque2(3);

        cmp.start();
        cmp2.start();
        cmp3.start();
        System.out.println("traitements encore en attente");
    }
}
