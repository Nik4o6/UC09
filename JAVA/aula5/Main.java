/*
package aula5;

public class Dist {
    
    //EXEMPLO DE DESENVOLVIMENTO INCREMENTAL:

    //CALCULAR A DISTANCIA ENTRE DOIS PONTOS

    //distancia dada por: dist = {(x2 - 1x)^2 + (y2 - y1)}^1/2

    //ATIVIDADE 1: realizar o calculo dentro de um metodo
    //static void calculaDistancia(double x1, double x2, double y1){
    
    //}

    public static void main(String[] args) {
    //declaração de variáveis

        double x1,x2,y1,y2;
        double dist,dx,dy;
       x1 = 0;
       x2 = 4;
       y1 = 0;
       y2 = 0;
       dx = x2 - x1;
       dy = y2 - y1;
       distX = Math.pow(dx, 2.0);
       distY = Math.pow(dy, 2.0);

       System.out.println("Distancia do eixo x: = " + dist);
       System.out.println("Distancia do eixo y: = " + dist);
       resultado - Math.sqrt((distX+distY));
       System.out.println(resultado);
    
    
     //System.out.println("esse programa roda?");

    
    }

}

*/

public class Main {

    // ATIVIDADE 1: realizar o cálculo dentro de um método
    public static double calculaDistancia(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;

        double distX = Math.pow(dx, 2);
        double distY = Math.pow(dy, 2);

        double resultado = Math.sqrt(distX + distY);
        return resultado;
    }

    public static void main(String[] args) {

        double x1 = 0;
        double y1 = 0;
        double x2 = 4;
        double y2 = 0;

        double distancia = calculaDistancia(x1, y1, x2, y2);

        System.out.println("Distância entre os pontos: " + distancia);
    }
}
