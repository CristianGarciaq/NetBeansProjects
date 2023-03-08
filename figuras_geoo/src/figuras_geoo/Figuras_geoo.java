/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras_geoo;

import java.util.Scanner;

/**
 *
 * @author cr7ga
 */
public class Figuras_geoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bandera=0;
        do{
        System.out.println("Selecciona una opcion"+"\n"+"1.-circulo"+"\n"+"2.-cudrado"+"\n"+"3.-triangulo"+"\n"+"4.-rectangulo"+"\n"+"5.-rombo");
        int opcion=sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("1.-circulo"); 
                System.out.println("ingresa valor de radio"); 
                int rad=sc.nextInt();
                System.out.println("diametro del circulo"); 
                int dia=sc.nextInt();
                double per =dia*3.1416;     
                double are =rad*rad*3.1416;     
                System.out.println("perimetro="+per); 
                System.out.println("area="+are);
                break;
                case 2:                                   
                    System.out.println("2.-cuadrado"); 
                    System.out.println("valor de lado"); 
                    int lado=sc.nextInt();
                    double area= lado*lado;
                    double perimetro= lado*4;
                    System.out.println("tu perimetro es="+perimetro);
                    System.out.println("tu area ="+area);
                    break;
                case 3:
                    System.out.println("3.-triangulo");
                    System.out.println("valor de base");
                    int base=sc.nextInt();
                    System.out.println("valor de altura");   
                    int altura=sc.nextInt();
                    System.out.println("valor de lado");  
                    int lad=sc.nextInt();
                    double peri=lad*3;
                    double ar=base*altura/2;
                    System.out.println("permetro="+peri);
                    System.out.println("area="+ar);
                    break;
                case 4:
                    System.out.println("4.-rectangulo");
                    System.out.println("valor de base");
                    int b=sc.nextInt();
                    System.out.println("valor de altura");
                    int al=sc.nextInt();
                    double pr=b*4;
                    double a=b*al;
                    System.out.println("tu perimetro es="+pr);
                    System.out.println("tu area es="+a);
                    break;
                case 5:
                    System.out.println("5.-rombo");
                    System.out.println("valor de lado ");
                    int la=sc.nextInt();
                    System.out.println("valor de diadonal mayor ");
                    int dm=sc.nextInt();
                    System.out.println("valor de diadonal menor ");
                    int dme=sc.nextInt();
                    double p4=la*4;
                    double p5=dm*dme/2;
                    System.out.println("perimetro="+p4);
                    System.out.println("area="+p5);
                    break;
                default:
                    System.out.println("ingresa otra opcion");
                    
       }       
        System.out.println("deseas que se repita el proceso"+"\n"+"1.-si"+"\n"+"2.-no");
    }while(bandera==1);
    }
    
}
