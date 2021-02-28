package tallersantiago;
import java.text.DecimalFormat;
import java.util.Scanner;
public class TallerSantiago {
    public static void main(String[] args) {        
        Scanner sa=new Scanner(System.in);        
        boolean fin= false;        
        int punto;
        String sn;               
        while(!fin){
            System.out.println("\n*******************************"
                    + "\n1. Prueba de variables.\n2. Suma, producto y diferencia de dos numeros."
                    + "\n3. suma, promedio, producto, cociente y modulo de tres numeros."
                    + "\n4. Longitud y area de un circulo sabiendo el su radio.\n5. Lector de dato y da su valor en Ascci."
                    + "\n6. índice de masa corporal BMI el cual está dado por la formula (pesoenKg/ alturaenmetros*alturaenmetros)."
                    + "\n7. Porcentaje de utilidad de productos.\n8. Menu.\n9. Calculo de gasto de viaje por carretera."
                    + "\n10. Conversion de kilogramos a gramos, libras y toneladas."
                    + "\n11. Calculo de unidad, decena y centena (solo numeros entre 0 y 1000).\n12. Salir del programa.");           
            System.out.println("\nElija una opcion: "); punto=sa.nextInt();            
            switch(punto){
                case 1:
                    System.out.println("\n\nPunto 1");
                    int x,y;
                    System.out.println("Ingrese el valor de X : "); x=sa.nextInt();
                    System.out.println("Ingrese el valor de Y : "); y=sa.nextInt();
                    System.out.println("Sus resultados son ....");
                    System.out.printf("a) x= %d\n",x);
                    System.out.printf("b) El valor de %d + %d es %d\n",x,x,(x+x));
                    System.out.printf("c) x= %.2f\n",(float)x);
                    System.out.printf("d) %d - %d\n",(x + y), (y + x));
                    break;
                case 2:
                    System.out.println("\n\nPunto 2");
                    int n1, n2, sum, res, mul;
                    System.out.println("Ingrese el primer numero: "); n1=sa.nextInt();
                    System.out.println("Ingrese el segundo numero :"); n2=sa.nextInt();
                    sum=(n1+n2);
                    res=(n1-n2);
                    mul=(n1*n2);
                    System.out.println("La suma es: "+sum);
                    System.out.println("La diferencia es: "+res);
                    System.out.println("El producto es: "+mul);
                    break;
                case 3:
                    System.out.println("\n\nPunto 3");
                    double one, two, suma, prome, cos, mod;
                    System.out.println("Ingrese el primer numero (agregue mas de dos decimales) : "); one=sa.nextDouble();
                    System.out.println("Ingrese el segundo numero (agregue mas de dos decimales) : "); two=sa.nextDouble();
                    suma=(one+two);
                    prome=((one+two)/2);
                    cos=(one/two);
                    mod=(one%two);
                    DecimalFormat df=new DecimalFormat("#.00");
                    System.out.println("La suma es : "+df.format(suma));
                    System.out.println("El promedio es : "+df.format(prome));
                    System.out.println("El cociente es : "+df.format(cos));
                    System.out.println("El modulo es : "+df.format(mod));
                    break;
                case 4:
                    System.out.println("\n\nPunto 4");
                    double radio, area, lon;
                    System.out.println("Ingrese el radio (agregue mas de dos decimales) : "); radio=sa.nextDouble();
                    area=(Math.PI*Math.pow(radio, 2));
                    lon=(2*Math.PI*radio);
                    DecimalFormat dff=new DecimalFormat("#.00");
                    System.out.println("El area es : "+dff.format(area));
                    System.out.println("La longitud es : "+dff.format(lon));                            
                    break;    
                case 5:
                    System.out.println("\n\nPunto 5");
                    System.out.println("Ingrese su caracter : ");
                    char dato= sa.next().charAt(0);
                    int asc=(int)dato;
                    System.out.println("El valor Ascii del dato "+dato+" es : "+asc);
                    break;
                case 6:
                    System.out.println("\n\nPunto 6");
                    double alt, altu, peso, bmi;
                    System.out.println("Ingrese su peso (agregue mas de dos decimales) : "); peso=sa.nextDouble();
                    System.out.println("Ingrese su altura (agregue mas de dos decimales) : "); alt=sa.nextDouble();
                    altu=Math.pow(alt, 2);
                    bmi=(peso/altu);
                    System.out.println("Su BMI es : "+ bmi);
                    break;
                case 7:
                    System.out.println("\n\nPunto 7");
                    double precioVenta, precioCompra, total;
                    System.out.println("Ingrese el precio de compra (agregue mas de dos decimales) : "); precioCompra=sa.nextDouble();
                    System.out.println("Ingrese el precio de venta (agregue mas de dos decimales) : "); precioVenta=sa.nextDouble();
                    total=(precioVenta -  precioCompra);
                    System.out.println("La ganancia es de : "+total);
                    break;
                case 8:
                    System.out.println("\n\nPunto 8\nActualmente se esta trabajando en un menu.");
                    break; 
                case 9:
                    System.out.println("\n\nPunto 9");
                    int dias;
                    double kilof, preGas, proKilGas, pagEst, pagPea, uno, dos, tres, cuatro, totall;
                    System.out.println("Ingrse el numero de dias que viajo : "); dias=sa.nextInt();
                    System.out.println("Ingrese el numero de km que recorrio (agregue mas de dos decimales) : "); kilof=sa.nextDouble();
                    System.out.println("Gasto en litros de gasolina (agregue mas de dos decimales) : "); preGas=sa.nextDouble();
                    System.out.println("Promedio de km recorridos por litro de gasolina (agregue mas de dos decimales) : "); proKilGas=sa.nextDouble();
                    System.out.println("Costo de estacionamiento diario (agregue mas de dos decimales) : "); pagEst=sa.nextDouble();
                    System.out.println("Costo de peaje diario (agregue mas de dos decimales) : "); pagPea=sa.nextDouble();
                    uno=(kilof/proKilGas);
                    dos=(uno*preGas);
                    tres=(pagEst*dias);
                    cuatro=(pagPea*dias);
                    totall=(uno+dos+tres+cuatro);
                    System.out.println("El costo total del viaje es de : $"+totall);
                    break;
                case 10:
                    System.out.println("\n\nPunto 10");
                    double kg, g, lb, ton;
                    System.out.println("Ingrese su peso en kg (agregue mas de dos decimales) : "); kg=sa.nextDouble();
                    g=(kg*1000);
                    lb=(kg*2.205);
                    ton=(kg/1000);
                    System.out.println("La conversion de kg a g es de : "+g+" g");
                    System.out.println("La coversion de kg a lb es de : "+lb+" lb");
                    System.out.println("La conversion de kg a ton es de : "+ton+" ton");
                    break;
                case 11:
                    System.out.println("\n\nPunto 11");
                    int num, unidad, decena, centena;
                    
                    System.out.println("Ingrese el numero entre 1 y 1000 : "); num=sa.nextInt();
                    if (num>=0 & num<=1000){
                        unidad=(int)(num%10);          
                        centena=(int)(num/100);
                        if (centena != 0){
                        num=(num-(centena*100));      
                        }
                        decena=(num/10);
                        System.out.println("Unidad : "+unidad);
                        System.out.println("Decena : "+decena);
                        System.out.println("Centena : "+centena);
                        
                    } else {
                        System.out.println("Fuera de rango");
                    }
                    break;
                case 12:
                    System.out.println("Gracias por usar el programa\nBy: Santiago Jaimes - 2021.");
                    fin=true;
                    break;
                default:
                    System.out.println("Solo hay 11 opciones para elegir.");           
            }       
        }
    }
}
