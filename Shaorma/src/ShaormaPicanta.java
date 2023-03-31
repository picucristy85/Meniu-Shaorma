public class ShaormaPicanta extends Shaorma{

    public void addKetcheupPicant(){
            System.out.println("Adaugam ketchup picant...");
    }

    public void addUsturoi(){
        System.out.println("Se adauga usturoi...");
    }

    @Override
    public void pregatesteShaorma() {
        super.pregatesteShaorma();
        addKetcheupPicant();
        addUsturoi();
        System.out.println("Am pregatit SHAORMA PICANTA!");
        System.out.println(" ");
    }
}
