import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creamos un objeto con Scanner
        Scanner scanner = new Scanner(System.in);

        //ejercicio Nº 1.

//        System.out.printf("Introduce un dia de la semana: ");
//        String dia = scanner.nextLine().toLowerCase();
//
//        String asignatura;
//        switch (dia) {
//            case "lunes":
//                asignatura = "Matematicas";
//                break;
//            case "martes":
//                asignatura = "Fisica";
//                break;
//            case "miercoles":
//                asignatura = "Quimica";
//                break;
//            case "jueves":
//                asignatura = "Geografia";
//                break;
//            case "viernes":
//                asignatura = "Literatura";
//                break;
//            default:
//                asignatura = "dia no valido";
//                break;
//        }
//        //Imprimir la asignatura
//            System.out.printf("la asignatura que toca el " + dia + " es " + asignatura);



        //ejercicio Nº 2.

//        System.out.printf("Introduce una hora (0-23hrs): ");
//        int hora = scanner.nextInt();
//
//        //validacion
//
//        if (hora < 0 || hora > 23){
//            System.out.printf("hora no valida.");
//        }else {
//
//            //determinar los parametros de las horas
//            if (hora >= 6 && hora <= 12){
//                System.out.println("Buenos dias");
//            }else {
//                if (hora >= 13 && hora <=20) {
//                    System.out.println("Buenas tardes");
//                }else {
//                    System.out.println("Buenas noches");
//                }
//            }
//        }



        //ejercio Nº 3

//        System.out.printf("Introduce un numero del 1 al 7: ");
//        int numero = scanner.nextInt();
//
//        String diaSemana;
//        switch (numero) {
//            case 1:
//                diaSemana = "lunes";
//                break;
//            case 2:
//                diaSemana = "martes";
//                break;
//            case 3:
//                diaSemana = "miercoles";
//                break;
//            case 4:
//                diaSemana = "jueves";
//                break;
//            case 5:
//                diaSemana = "viernes";
//                break;
//            case 6:
//                diaSemana = "sabado";
//                break;
//            case 7:
//                diaSemana = "domingo";
//                break;
//            default:
//                diaSemana = "Número no válido. Debe estar entre 1 y 7.";
//                break;
//        }
//            System.out.println(diaSemana);


        //ejercicio Nº4

//        System.out.printf("Ingresa la primera nota: ");
//        double nota1 = scanner.nextDouble();
//
//        System.out.printf("Ingresa la segunda nota: ");
//        double nota2 = scanner.nextDouble();
//
//        System.out.printf("Ingresa la tercera nota: ");
//        double nota3 = scanner.nextDouble();
//
//        //calculamos la media de tres notas
//
//        double media = (nota1 + nota2 + nota3) / 3;
//
//        //resultado
//        System.out.println("La media de las tres notas es: " + media);


        //ejercicio Nº 5

//        System.out.println("Introduce los minutos (0-59): ");
//        int horas = scanner.nextInt();
//        int minutos = scanner.nextInt();
//
//
//        if ((horas < 0 || horas > 23) || (minutos < 0 || minutos > 59)) {
//            System.out.println("Hora o minutos no válidos. Las horas deben estar entre 0 y 23 y los minutos entre 0 y 59.");
//        } else {
//            int segundosEnUnDia = 24 * 60 * 60;
//            int segundosTranscurridos = (horas * 60 * 60) + (minutos * 60);
//            int segundosHastaMedianoche = segundosEnUnDia - segundosTranscurridos;
//
//            System.out.println("Faltan " + segundosHastaMedianoche + " segundos para la medianoche.");
//        }


        //cerrar el objeto Scanner
        scanner.close();
    }
}