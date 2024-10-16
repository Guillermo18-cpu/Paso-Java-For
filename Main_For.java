import java.util.Scanner;

public class Main_For {

    public static void main(String[] args) {
        Scanner FR = new Scanner(System.in);

        int edad = 0, estadoCivil = 0, estatura = 0, sexo = 0, contadorPersonas = 0, acomuladorEdad = 0, acomuladorEstatura = 0,  cantidadPersonas = 0;
        System.out.println("Ingrese el número de personas que deseas registar");
        cantidadPersonas = FR.nextInt();

        for (int numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {
            System.out.println("Ingrese la edad de la persona " + numeroPersona);
            edad = FR.nextInt();
            System.out.println("Ingrese el estado civil de la persona " + numeroPersona + " 1. Soltero   2. Casado");
            estadoCivil = FR.nextInt();
            System.out.println("Ingrese la estatura de la persona " + numeroPersona + " en cms");
            estatura = FR.nextInt();
            System.out.println("Ingrese el sexo de la persona " + numeroPersona + " 1. Hombre     2. Mujer");
            sexo = FR.nextInt();

            if ((edad >= 18)&&(estadoCivil==1)&&(estatura>170)&&(sexo==1)){
                contadorPersonas = contadorPersonas + 1;
                acomuladorEdad = acomuladorEdad + edad;
                acomuladorEstatura = acomuladorEstatura + estatura;
            }

        
        }
        Logica_For calculo1 = new Logica_For(edad, estadoCivil, estatura, sexo, contadorPersonas, acomuladorEdad, acomuladorEstatura, acomuladorEstatura, cantidadPersonas);
        calculo1.calcularPromedio();
        FR.close();

    }
}