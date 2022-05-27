import java.util.Scanner;

public class taxiMetre {
    public static void main(String[] args) {
        // gkm= Gidilecek km
        // tau:Taksimetre acilis ucreti
        // kmu: km basina ucret
        //agu: Asgari odenmesi gereken ucret
        double gkm,tau=10.0,kmu=2.20,agu=20.0,ucret1;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen kac km gitmek istediginizi rakamlarla belirtiniz : ");
        gkm=input.nextDouble();
        ucret1=tau+(gkm*kmu);

        ucret1= (ucret1<agu)? 20:ucret1;


        System.out.print("Odemeniz Gereken Ucret : "+ ucret1);








    }
}
