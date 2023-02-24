import java.util.Date;
import java.util.GregorianCalendar;

class Empleado extends Persona {
    private double sueldo;
    private Date altaContrato;
    private int Id;

    public Empleado(String nom, double sue, int año, int mes, int dia){
        super(nom);
        sueldo = sue;
        GregorianCalendar Calendario = new GregorianCalendar(año, mes-1, dia);
        altaContrato = Calendario.getTime();
    }
    public String dameDescripcion(){
        return "Este empleado tiene un Id=" + Id+" con un sueldo de: "+sueldo;
    }
    public double dameSueldo(){ //getter
        return sueldo;
    }
    public void subSueldo (double porcentaje) { //setter
        double aumento = (sueldo * porcentaje) / 100;
        sueldo += aumento;
    }

}
