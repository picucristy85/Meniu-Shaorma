public class ShaormaDulce extends Shaorma {

    public void addKetcheupDulce() {
        System.out.println("Adaugam ketchup dulce...");
    }

    @Override
    public void pregatesteShaorma() {
        super.pregatesteShaorma();
        addKetcheupDulce();
        System.out.println("Am pregatit SHAORMA DULCE!");
        System.out.println(" ");
    }
}
