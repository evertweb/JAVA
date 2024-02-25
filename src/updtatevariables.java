public class updtatevariables {
    public static void main(String[] args) {
        /*
        +=  variable + = valor      variable =variable + valor
        -=  a-=b
        y asi sucesivamente
         */

        int salariojuan = 10000;
        int horasextrastotal = 6 * 20;


        //bono 200
        //pension 2000
        //hora extras 6 20 c/u
        //cupon 45 comida
        System.out.println("el salario de juan es de" + salariojuan);
        salariojuan = (salariojuan + horasextrastotal);
        System.out.println("mas las horas extras es de " + salariojuan);
        salariojuan = salariojuan + 200;
        System.out.println("mas el bono es de " + salariojuan);


        salariojuan = (salariojuan - 2000) - 45;
        System.out.println("el salario deducido es de " + salariojuan);
        //actualizando cadenas de texto
        String nombredelempleado = "evert";
        nombredelempleado = nombredelempleado + " cardenas";
        System.out.println(nombredelempleado);

        int edad = 12;
        int edadreal = edad += 1;
        System.out.println(edadreal);



        int vida=5;
        vida--;
        System.out.println(vida);//4
        vida--;
        System.out.println(vida);//3
        vida++;
        System.out.println(vida);






    }








    }

