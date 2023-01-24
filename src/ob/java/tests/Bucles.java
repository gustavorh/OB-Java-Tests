package ob.java.tests;

public class Bucles {
    public static void main(String[] args) {
        // Condicion if
        System.out.println("-------------------- CONDICION IF --------------------");
        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("La variable numeroIf con valor " + numeroIf + " es positiva.");
        } else if (numeroIf < 0){
            System.out.println("La variable numeroIf con valor " + numeroIf + " es negativa.");
        } else {
            System.out.println("La variable numeroIf con valor " + numeroIf + " es igual a 0.");
        }
        System.out.println("------------------------------------------------------");

        System.out.println("-------------------- BUCLE WHILE --------------------");
        // Bucle while
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        numeroWhile = 0;
        System.out.println("------------------------------------------------------");

        System.out.println("------------------- BUCLE DO-WHILE -------------------");
        // Bucle do-while
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 1);
        System.out.println("------------------------------------------------------");

        System.out.println("--------------------- BUCLE FOR ---------------------");
        // Bucle for
        for (int numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        System.out.println("------------------------------------------------------");

        System.out.println("-------------------- SWITCH CASE --------------------");
        // Switch-case
        String estacion = "Verano";
        switch (estacion) {
            case "Primavera":
                System.out.println("La estación es primavera.");
                break;
            case "Verano":
                System.out.println("La estación es verano.");
                break;
            case "Otoño":
                System.out.println("La estación es otoño.");
                break;
            case "Invierno":
                System.out.println("La estación es invierno.");
                break;
            default:
                System.out.println("La estación es incorrecta.");
        }
    }
}
