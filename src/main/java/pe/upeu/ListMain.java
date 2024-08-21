package pe.upeu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMain {

    public static void main(String[] args) {
        String continuar;

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        LocalDate fecha = LocalDate.now();

        Persona p1 = new Persona("Valeria", 17, true, fecha);
        Persona p2 = new Persona("Mateo", 17, true, fecha);
        Persona p3 = new Persona("Sofia", 17, true, fecha);
        Persona p4 = new Persona("Alejandro", 17, true, fecha);
        Persona p5 = new Persona("Luna", 17, true, fecha);
        Persona p6 = new Persona("Gabriel", 17, true, fecha);
        Persona p7 = new Persona("Isabella", 17, true, fecha);
        Persona p8 = new Persona("Diego", 17, true, fecha);
        Persona p9 = new Persona("Clara", 17, true, fecha);
        Persona p10 = new Persona("Lucas", 17, true, fecha);
        Persona p11 = new Persona("Camila", 17, true, fecha);
        Persona p12 = new Persona("Andrés", 17, true, fecha);
        Persona p13 = new Persona("Natalia", 17, true, fecha);
        Persona p14 = new Persona("Javier", 17, true, fecha);
        Persona p15 = new Persona("Mariana", 17, true, fecha);
        Persona p16 = new Persona("Samuel", 17, true, fecha);
        Persona p17 = new Persona("Gabriela", 17, true, fecha);
        Persona p18 = new Persona("Nicolás", 17, true, fecha);
        Persona p19 = new Persona("Rafael", 17, true, fecha);
        Persona p20 = new Persona("Laura", 17, true, fecha);
        Persona p21 = new Persona("Daniel", 17, true, fecha);
        Persona p22 = new Persona("Valentina", 17, true, fecha);
        Persona p23 = new Persona("Hugo", 17, true, fecha);
        Persona p24 = new Persona("Paula", 17, true, fecha);
        Persona p25 = new Persona("Martín", 17, true, fecha);
        Persona p26 = new Persona("Ana", 17, true, fecha);
        Persona p27 = new Persona("Esteban", 17, true, fecha);
        Persona p28 = new Persona("Renata", 17, true, fecha);
        Persona p29 = new Persona("Tomás", 17, true, fecha);
        Persona p30 = new Persona("Luis", 17, false, fecha);

        System.out.println("LISTA DE ESTUDIANTES");
        System.out.println("------------------------------");
        System.out.println("Valeria");
        System.out.println("Mateo");
        System.out.println("Sofia");
        System.out.println("Alejandro");
        System.out.println("Luna");
        System.out.println("Gabriel");
        System.out.println("Isabella");
        System.out.println("Diego");
        System.out.println("Clara");
        System.out.println("Lucas");
        System.out.println("Camila");
        System.out.println("Andrés");
        System.out.println("Natalia");
        System.out.println("Javier");
        System.out.println("Mariana");
        System.out.println("Samuel");
        System.out.println("Gabriela");
        System.out.println("Nicolás");
        System.out.println("Emma");
        System.out.println("Rafael");
        System.out.println("Laura");
        System.out.println("Daniel");
        System.out.println("Valentina");
        System.out.println("Hugo");
        System.out.println("Paula");
        System.out.println("Martín");
        System.out.println("Ana");
        System.out.println("Esteban");
        System.out.println("Renata");
        System.out.println("Tomás");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        Scanner scanner;
        do {
            for (Persona persona : listaPersonas) {
                System.out.println(persona.toString());
            }
            System.out.println("Escriba el nombre del estudiante para verificar su asistencia");
            scanner = new Scanner(System.in);
            String seleccionado = scanner.nextLine();
            switch (seleccionado) {
                case "Valeria":
                    listaPersonas.add(p1);
                    break;
                case "Mateo":
                    listaPersonas.add(p2);
                    break;
                case "Sofia":
                    listaPersonas.add(p3);
                    break;
                case "Alejandro":
                    listaPersonas.add(p4);
                    break;
                case "Luna":
                    listaPersonas.add(p5);
                    break;
                case "Gabriel":
                    listaPersonas.add(p6);
                    break;
                case "Isabella":
                    listaPersonas.add(p7);
                    break;
                case "Diego":
                    listaPersonas.add(p8);
                    break;
                case "Clara":
                    listaPersonas.add(p9);
                    break;
                case "Lucas":
                    listaPersonas.add(p10);
                    break;
                case "Camila":
                    listaPersonas.add(p11);
                    break;
                case "Andrés":
                    listaPersonas.add(p12);
                    break;
                case "Natalia":
                    listaPersonas.add(p13);
                    break;
                case "Javier":
                    listaPersonas.add(p14);
                    break;
                case "Mariana":
                    listaPersonas.add(p15);
                    break;
                case "Samuel":
                    listaPersonas.add(p16);
                    break;
                case "Gabriela":
                    listaPersonas.add(p17);
                    break;
                case "Nicolás":
                    listaPersonas.add(p18);
                    break;
                case "Emma":
                    listaPersonas.add(p19);
                    break;
                case "Rafael":
                    listaPersonas.add(p20);
                    break;
                case "Laura":
                    listaPersonas.add(p21);
                    break;
                case "Daniel":
                    listaPersonas.add(p22);
                    break;
                case "Valentina":
                    listaPersonas.add(p23);
                    break;
                case "Hugo":
                    listaPersonas.add(p24);
                    break;
                case "Paula":
                    listaPersonas.add(p25);
                    break;
                case "Martín":
                    listaPersonas.add(p26);
                    break;
                case "Ana":
                    listaPersonas.add(p27);
                    break;
                case "Esteban":
                    listaPersonas.add(p28);
                    break;
                case "Renata":
                    listaPersonas.add(p29);
                    break;
                case "Tomás":
                    listaPersonas.add(p30);
                    break;
            }

            System.out.println("¿Desea continuar? Si/No");
            continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("Si")) {
                System.out.println("Volviendo");
                break;
            }

        } while (true);
        scanner.close();

    }
}