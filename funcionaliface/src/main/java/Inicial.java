public class Inicial {
    public int operar(double x, double y)
    {
        Operacion operacion=(n1,n2)->n1 +n2;
        return (int) operacion.calcular(x, y);
    }
    public static void main (String args []){
        Inicial inicial =new Inicial();
        System.out.println(inicial.operar(12, 16));

    }
}
