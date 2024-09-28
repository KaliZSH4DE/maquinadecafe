/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinacafe;

import java.util.Scanner;

/**
 *
 * @author SH4DE
 */
public class MaquinaCafe {

    public static void main(String[] args) {
        
        int pedido = 1;
        Scanner scan = new Scanner(System.in);
        int cantCafe = 0;
        int continuar;
        
        
        do{
            System.out.println("==CAFETERIA BATIZIANA== \n 1-Expresso \n 2-Capuchino \n 3-Café con leche");
            int cafe = scan.nextInt();
            
            switch(cafe){
                case 1:
                    System.out.print("Ingrese la cantidad de unidades de Expresso: ");
                    
                    int canti1 = scan.nextInt();
                    
                    if(canti1 >= 0){
                        cantCafe = cantCafe + canti1;
                        
                        System.out.println("Deseas agregar mas bebidas ? \n 1- Si \n 2- No ");
                    
                        continuar = scan.nextInt();
                        
                        do{
                            if(continuar == 2){
                                pedido = 0;
                            }
                            if(continuar == 1){
                                pedido = 1;
                            }
                        }while(continuar < 1 && continuar > 2);

                    }
                    
                    
                    
                    
                break;
                case 2:
                    System.out.print("Ingrese la cantidad de unidades de Capuchino: ");
                    
                    int canti2 = scan.nextInt();
                    if(canti2 >= 0){
                        cantCafe = cantCafe + canti2;
                        
                        System.out.println("Deseas agregar mas bebidas ? \n 1- Si \n 2- No ");

                        continuar = scan.nextInt();

                        do{
                            if(continuar == 2){
                                pedido = 0;
                            }
                            if(continuar == 1){
                                pedido = 1;
                            }
                        }while(continuar < 1 && continuar > 2);
                    }
                    
                    
                    
                break;
                case 3:
                    System.out.print("Ingrese la cantidad de unidades de Cafe con Leche: ");
                    
                    int canti3 = scan.nextInt();
                    if(canti3 >= 0){
                        cantCafe = cantCafe + canti3;
                        
                        System.out.println("Deseas agregar mas bebidas ? \n 1- Si \n 2- No ");
                    
                        continuar = scan.nextInt();
                        do{
                            if(continuar == 2){
                                pedido = 0;
                            }
                            if(continuar == 1){
                                pedido = 1;
                            }
                        }while(continuar < 1 && continuar > 2);
                        
                    }
                    
                    
                    
                    
                break;
                
            }
        }while(pedido >= 1);
        
        
        int total = cantCafe*10;
        
        int pagado = 0;
        
        do{

            do{
                System.out.println("==PAGAR== \n Total restante a pagar: $" + total + " MXN \n Introduzca monedas de: \n 1- $1 \n 2- $2 \n 3- $5 \n 4- $10");

                pagado = scan.nextInt();
            }while(pagado < 0 && pagado > 4);

                switch(pagado){
                    case 1:
                        System.out.print("Ingrese la cantidad de unidades de esta moneda: ");

                        int canti1 = scan.nextInt();

                        if(canti1 >=0){
                            int canti1t = canti1*1;

                            total = total - canti1t;

                        }
                    break;
                    case 2:
                        System.out.print("Ingrese la cantidad de unidades de esta moneda: ");

                        int canti2 = scan.nextInt();

                        if(canti2 >=0){
                            int canti2t = canti2*2;

                            total = total - canti2t;

                        }
                    break;
                    case 3:
                        System.out.print("Ingrese la cantidad de unidades de esta moneda: ");

                        int canti3 = scan.nextInt();

                        if(canti3 >=0){
                            int canti3t = canti3*5;

                            total = total - canti3t;

                        }
                    break;
                    case 4:

                        System.out.print("Ingrese la cantidad de unidades de esta moneda: ");

                        int canti4 = scan.nextInt();

                        if(canti4 >=0){
                            int canti4t = canti4*10;

                            total = total - canti4t;

                        }

                    break;

                }
        }while(total > 0);
        
        
        if(total < 0){
            int cambio = (-1)*total;
            System.out.println("Su cambio es de $" + cambio + "MXN");
        }
        
        
    }
}
