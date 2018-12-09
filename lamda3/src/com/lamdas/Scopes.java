package com.lamdas;

import jdk.nashorn.internal.objects.NativeInt16Array;

import javax.imageio.ImageTranscoder;

public class Scopes {
    private static double atributo1;
    private double atributo2;
    public double localVar(){
        double n3=3;
        double n4=4;
        //Operaciones operaciones = (t1,t2)->(t1*t2)+n3*n4;
        Operaciones operaciones = (t1,t2)->{return (t1*t2)+n3*n4;};
        return operaciones.prom(1,1);
    }
    public double StaticglobalsVar (){
        Operaciones operaciones = (t1,t2)->{
            atributo1=t1*t2+5;
            atributo2=atributo1 *5;
            return atributo2;
        };
        return operaciones.prom(1,5);

    }

}
