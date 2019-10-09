public class CompterJusque2 extends Thread {

    int idTraitement;

    public CompterJusque2(int n) {
        this.idTraitement= n;
    }

    @Override
    public void run() {
        System.out.println("traitement " +idTraitement + "-> se lance");
        for (int i = 1; i < 3; i++) {
            System.out.println("traitement " + idTraitement + "-> " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("traitement " + idTraitement + "-> se finit");
    }
}
