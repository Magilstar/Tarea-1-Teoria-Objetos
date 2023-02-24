public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Empleado Empleado1 = new Empleado("juan", 1200, 2000, 07, 25);
        System.out.println("El empleado 1 se llama: " + Empleado1.nombre + ". Y tiene un sueldo de: "+ Empleado1.dameSueldo());

        Empleado Empleado2 = new Empleado("Alex", 100, 2001, 2, 17);
        System.out.println("El empleado 2 se llama: " + Empleado2.nombre + ". Y tiene un sueldo de: "+ Empleado2.dameSueldo());

        Empleado Empleado3 = new Empleado("Jose", 300, 2003, 02, 23);
        System.out.println("El empleado 3 se llama: " + Empleado3.nombre + ". Y tiene un sueldo de: "+ Empleado3.dameSueldo());

        Empleado Empleado4 = new Empleado("Dorielmeregildo", 7825, 2001, 04, 10);
        System.out.println("El empleado 4 se llama: " + Empleado4.nombre + ". Y tiene un sueldo de: "+ Empleado4.dameSueldo());

        Empleado Empleado5 = new Empleado("Dorime", 8416, 2000, 02, 23);
        System.out.println("El empleado 5 se llama: " + Empleado5.nombre + ". Y tiene un sueldo de: "+ Empleado5.dameSueldo());
    }



}