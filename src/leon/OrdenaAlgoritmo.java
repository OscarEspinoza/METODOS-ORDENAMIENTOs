/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leon;

import java.util.Scanner;

/**
 *
 * @author anon
 */
public class OrdenaAlgoritmo {

    public static int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int[] nums1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    
    
    public static void main(String... args) {
    Scanner a=new Scanner();
    String a=Scanner();
        System.out.println("bienvenido ");
        
        int op=0;    
        switch(op){
            case 1:
            case 2:
                default:
                
            }


        OrdenaAlgoritmo a1 = new OrdenaAlgoritmo();
        a1.Burbuja(nums);
        a1.BurbujaMejorado(nums1);


    }

    public void Burbuja(int[] arreglo) {

        int aux;

        for (int i = 0; i < nums.length; i++) {


            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] < nums[i]) {

                    aux = nums[i];
                    nums[i] = nums[j];
                    nums[j] = aux;

                }
            }
        }
        System.out.println("La matriz ordenada por metodo burbuja es");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public void BurbujaMejorado(int[] arreglo) {
        int AUX;
        int g = 0;
        int paso;
        int j;


        int bandera = 1;
        for (paso = 0; paso < g - 1 && bandera == 1; paso++) {
            bandera = 0;
            for (j = 0; j < g - paso - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    bandera = 1;
                    AUX = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = AUX;
                }
            }
        }
        System.out.println("La matriz ordenada por burbuja mejorada es");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
