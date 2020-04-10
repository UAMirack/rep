public class Coronavirus{
 private float infeccio;
 private float mortaldat;
 Coronavirus(float x, float y)
 {
 infeccio=x;
 mortaldat=y;
 }

public Coronavirus(float infeccio, float mortaldat) {
        this.infeccio = infeccio;
        this.mortaldat = mortaldat;
    }
 
    public Coronavirus(Coronavirus c){

        infeccio=c.infeccio;
        mortaldat=c.mortaldat;

    }

    @Override
    public String toString() {
        return "Coronavirus{" + "infeccio=" + infeccio + ", mortaldat=" + mortaldat + '}';
    }
}
