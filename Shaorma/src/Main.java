import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;          //contor pentru ciclul repetitiv, in cazul in care se doreste mai mult de o shaorma
        Scanner cititor = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        ShaormaDulce shaormaDulce = new ShaormaDulce();
        ShaormaPicanta shaormaPicanta = new ShaormaPicanta();

        System.out.println("Cate shaorma doriti?");
        int nrComenzi = sc.nextInt(); //se citeste de la tastatura numarul de shaorma dorite

        if (nrComenzi == 0) {   //verificam sa avem daca se doreste cel putin o shaorma,
            System.out.println("Va mai asteptam! La revedere!");                  //in caz contrar, se iese din program
        }

        for (i = 1; i <= nrComenzi; i++) {                               //se executa numarul de shaorma cerute
            System.out.println("Ce shaorma doriti: Dulce/Picanta?");    //verificam ce fel de sharma doreste clientul
            String raspuns = cititor.nextLine();
            if (raspuns.equalsIgnoreCase("dulce")) {
                shaormaDulce.pregatesteShaorma();

            } else if (raspuns.equalsIgnoreCase("picanta")) {
                shaormaPicanta.pregatesteShaorma();

            } else {
                System.out.println("Nu ati introdus un raspuns valid!"); //se verifica raspunsul pana se introduce unul corect
                System.out.println("Ce shaorma doriti: Dulce/Picanta?");    //verificam ce fel de sharma doreste clientul
                String raspuns1 = cititor.nextLine();
                if (raspuns1.equalsIgnoreCase("dulce")) {
                    shaormaDulce.pregatesteShaorma();

                } else if (raspuns1.equalsIgnoreCase("picanta")) {
                    shaormaPicanta.pregatesteShaorma();
                }
            }
        }
        System.out.println(" ");
    }
}
