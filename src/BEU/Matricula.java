package BEU;

import fonseca.Persona;
import fonseca.Unidad;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class Matricula {

    private Calendar fecha;
    private Estado estado;
    private Persona estudiante;
    private Curso curso;

    private final String numero;

    private final List<Calificacion> calificaciones = new ArrayList<>();

    //Información 
    private float promedio;

    public Matricula() {
        UUID numeroAleatorio = UUID.randomUUID();
        this.numero = numeroAleatorio.toString();

        fecha = Calendar.getInstance();
        estado = Estado.REGISTRADA;
    }

    //Setters y Getters
    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Persona getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Persona estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNumero() {
        return numero;
    }

    //Getters
    public float getPromedio() {
        return promedio;
    }

    public void calcularPromedio() {

        if (this.calificaciones.isEmpty()) {
            return;
        }
        float suma = 0;

        for (Calificacion c : calificaciones) {
            suma += c.valor;//Sepuede acceder porque es una clase interna
        }

        int divisor = this.calificaciones.size();
        promedio = (float) suma / divisor;

        if (divisor == 3) {
            if (this.promedio > 14) {
                this.estado = Estado.APROBADA;
            } else {
                this.estado = Estado.REPROBADA;
            }
        }
    }

    public int addCalificacion(float v) {

        //Agregga una caificacion y retorna un numero
        //1 si es la nota de la unidad I
        //2 si es la nota de la unidad II
        //3 si es la nota de la unidad III
        //0 YA TIENE TODAS LAS NOTAS
        Calificacion cal = new Calificacion();
        int cuentaNotas = this.calificaciones.size();

        switch (cuentaNotas) {
            case 0:
                cal.setUnidad(Unidad.I);
                break;
            case 1:
                cal.setUnidad(Unidad.II);
                break;
            case 2:
                cal.setUnidad(Unidad.III);
                break;
            default:
                return 0;//Encaso de tener todas las notas retorna ""0""
        }
        cal.setValor(v);
        cal.setFecha(Calendar.getInstance());
        this.calificaciones.add(cal);
        this.calcularPromedio();
        return this.calificaciones.size(); //Retorna el tamaño de la lsta
    }

    //CLASE INTERNA
    class Calificacion {

        private Calendar fecha;
        private float valor;
        private Unidad unidad;

        public Calificacion() {
        }

        //Getters y Setters
        public Calendar getFecha() {
            return fecha;
        }

        public void setFecha(Calendar fecha) {
            this.fecha = fecha;
        }

        public float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

        public Unidad getUnidad() {
            return unidad;
        }

        public void setUnidad(Unidad unidad) {
            this.unidad = unidad;
        }

    }

    public String imprimirDetalle() {
        String str = "\n\t" + this.estudiante;
        for (Calificacion c : this.calificaciones) {
            str += "\t\t" + c.getValor();
        }
        str += "\t\t" + this.promedio + "\n";
        return str;
    }

    @Override
    public String toString() {

        return "-Nombre: " + "" + estudiante.toString() + "" + " #" + numero;
    }

}
