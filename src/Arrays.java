import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {


        Scanner scevert=new Scanner(System.in);

        String diasSemana[]=new String[7];
        String paisesAndcapitales[][]=new String[4][2];//0.1.2.3   //0.1

        diasSemana[0]="lunes";
        diasSemana[1]="martes";
        diasSemana[2]="miercoles";
        diasSemana[3]="jueves";
        diasSemana[4]="viernes";
        diasSemana[5]="sabado";
        diasSemana[6]="domingo";









        System.out.println("escribe un pais");
        paisesAndcapitales[0][0]=scevert.nextLine();//colombia
        paisesAndcapitales[0][1]="bogota";
        paisesAndcapitales[1][0]="argentina";
        paisesAndcapitales[1][1]="buenos aires";
        paisesAndcapitales[2][0]="españa";
        paisesAndcapitales[2][1]="madrid";
        paisesAndcapitales[3][0]="francia";
        paisesAndcapitales[3][1]="paris";

        /*
        System.out.println("la capital de "+ paisesAndcapitales[0][0] +" es "+ paisesAndcapitales[0][1]);
        System.out.println("la capital de "+ paisesAndcapitales[1][0] +" es "+ paisesAndcapitales[1][1]);
        System.out.println("la capital de "+ paisesAndcapitales[2][0] +" es "+ paisesAndcapitales[2][1]);
        System.out.println("la capital de "+ paisesAndcapitales[3][0] +" es "+ paisesAndcapitales[3][1]);

         */



        for (int i = 0; i < paisesAndcapitales.length; i++) {
            for (int j = 0; j < paisesAndcapitales[i].length; j++) {
                System.out.println(paisesAndcapitales[i][j]);
            }
        }

        System.out.println();
        System.out.println();


        System.out.println(paisesAndcapitales[3][1]);


        System.out.println(" y hoy es " + diasSemana[3]);
        for (int i = 0; i< diasSemana.length; i++) {
            System.out.println(diasSemana[i]);

        }










    }


}