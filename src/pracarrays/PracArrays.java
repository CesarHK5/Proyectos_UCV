/*
ingrese una n numero de productos con su precio ,donde diga el promedio,la suma de los precios 
cuantos numeros ingreso el usuario,mostrar en pantalla cada cassilla que puso el usuario con su respectivo precio
el mayor de todos y el menor  de todos y caro usando el retorno y una opcion donde el usuario si quiere puede seleccionar
cualquiera de las casillas que puso :v
 */
package pracarrays;

import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class PracArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0, opc = 0, opc2 = 0, resta = 0;
        double suma = 0.0, prom = 0.0, mayor = 0.0, menor = 9999;
        String a = "", mayore = "", menore = "";
        a = JOptionPane.showInputDialog("Ingrese su nombre del que se encargado ");
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos  numeros ingresara "));
        String nompro[] = new String[n];
        double precio[] = new double[n];
        for (int i = 0; i < nompro.length; i++) {
            nompro[i] = JOptionPane.showInputDialog("Ingrese el nombre del producto numero: " + (i + 1));
            precio[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
            suma = suma + precio[i];
            mayor = mayo(precio, n);
            resta=restar(n);
            if (precio[i] < menor) {
                menor = precio[i];
                if (precio[i] == menor) {
                    menore = nompro[i];
                }
            }
            if (precio[i] == mayor) {
                mayore = nompro[i];
            }
        }
        prom = promedio(precio, n);
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Le gustaria ver los productos que puso? 1.Si \n 2.No "));
             while(opc!=1 && opc!=2){
            opc = Integer.parseInt(JOptionPane.showInputDialog(" ERROR DATO INCORRECTO!: \nLe gustaria ver los productos que puso? 1.Si \n 2.No "));
             }
             if(opc==1){
              opc2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una camtidad del 0 al "+resta+" \n para que puedas ver los productos "));
             while (opc2>resta){
             opc2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una camtidad del 0 al "+resta+" para que puedas ver los productos "));
             }
             JOptionPane.showMessageDialog(null,"El dato que escojio para ver es  "+nompro[opc2]+" con el precio de S/"+precio[opc2]);
             }
            
             
        } while (opc==2);
        JOptionPane.showMessageDialog(null, "Segun los tados ingresdos de " + a + "es: \n El promedio es: " + prom + "\n La suma es:" + suma + "\n La cantidad de numeros que ingreso e:" + n + "\n El producto mayor es: " + mayore + " con el precio de S/" + mayor + "\n El menor producto es: " + menore + " con el precio de S/" + menor);
        switch (opc) {
            case 1:
               
                break;//aqui falta
        }
    }

    static double promedio(double a[], int b) {
        double suma = 0.0, prome = 0.0;
        for (int i = 0; i < b; i++) {
            suma = suma + a[i];
        }
        prome = suma / b;
        return prome;
    }

    static double mayo(double b[], int c) {
        double mayor = 0.0;
        for (int i = 0; i < c; i++) {
            if (b[i] > mayor) {
                mayor = b[i];
            }
        }
        return mayor;
    }
    static int restar(int a){
    int resta;
    resta=a-1;
    return resta;
    }
}

//falta xd
