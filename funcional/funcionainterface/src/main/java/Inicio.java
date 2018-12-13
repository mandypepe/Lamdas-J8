public class Inicio implements PersonaA, PersonaB{
    public static void main(String args[] ){
        Inicio app =new Inicio();
        //app.camina();
        app.hablar();
    }

   /* @Override
    public void hablar() {
        PersonaB.super.hablar();
    }*/
    @Override
    public void hablar() {
        //PersonaB.super.hablar();
        System.out.println("implement");
    }

    public void camina() {
        System.out.println("ajjaja");
    }
}
