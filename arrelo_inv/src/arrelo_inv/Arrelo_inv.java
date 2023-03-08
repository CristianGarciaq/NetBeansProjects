package arrelo_inv;

import java.util.Scanner;

public class Arrelo_inv {

    public static void main(String[] args) {
        String inverso = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el rango de tu arreglo");
        int n = sc.nextInt();
        System.out.println("ingresa arreglo");
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = nums.length-1; i >= 0; i--) {
            inverso = inverso + nums[i] + ",";
        }
        System.out.println("Potencia=> "+Math.pow( n, 3));
        System.out.println("Raiz=> "+Math.sqrt(n));
        

        System.out.println(inverso);

    }

}
