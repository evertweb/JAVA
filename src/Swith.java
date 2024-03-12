public class Swith {
    public static void main(String[] args) {
        String colormode="dark";

        switch (colormode){
            case "dark":
                int a=23;
                a+=2;

                System.out.println("estas en el modo oscuro" +a);
                break;
            case "light":
                System.out.println("estas en el modo claro");
                break;
            case "blue":
                System.out.println("hola");
            default:
                System.out.println("selecciona ");
        }


    }
}
