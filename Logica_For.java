public class Logica_For{

    int edad = 0, estadoCivil = 0, estatura = 0, sexo = 0; 
    int acomuladorEdad = 0, acomuladorEstatura = 0,  numeroPersona = 1;
    int cantidadPersonas, contadorPersonas;


    public Logica_For(int edad, int estadoCivil, int estatura, int sexo, int acomuladorEdad, int acomuladorEstatura,
            int numeroPersona, int cantidadPersonas, int contadorPersonas) {
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.estatura = estatura;
        this.sexo = sexo;
        this.acomuladorEdad = acomuladorEdad;
        this.acomuladorEstatura = acomuladorEstatura;
        this.numeroPersona = numeroPersona;
        this.cantidadPersonas = cantidadPersonas;
        this.contadorPersonas = contadorPersonas;
    }


    public void calcularPromedio(){

        double promedioEdad = acomuladorEdad / contadorPersonas;
        double promedioEstatura = acomuladorEstatura / contadorPersonas;
        double porcentajePersonas = (contadorPersonas/cantidadPersonas)*100;
        
        System.out.println("El promedio de edad de las personas que cumplen es: " + promedioEdad + " años ");
        System.out.println("El promedio de estatura de las personas que cumplen es: " + promedioEstatura + " centimetros ");
        System.out.println("El porcentaje de personas que cumplen con la condición es del: " + porcentajePersonas + " % ");
         
        
    }


        




}