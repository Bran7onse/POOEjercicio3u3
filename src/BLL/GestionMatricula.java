package BLL;

import BEU.Curso;
import BEU.Estado;
import BEU.Estudiante;
import BEU.Matricula;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import fonseca.BaseBLLcrud;
import fonseca.BasePersistencia;
import fonseca.util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestionMatricula extends BasePersistencia<Matricula> implements BaseBLLcrud<Matricula> {
    
    private Matricula matricula;
    private final String directorio = "matriculas";
    
    public GestionMatricula() {
    }
    
    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
    
    public String calificar(float valor) {
        
        String mensaje = "";
        int num = this.matricula.addCalificacion(valor);
        
        switch (num) {
            case 0:
                mensaje = "Todas las notas estan registradas\n";
                break;
            case 1:
                mensaje = "Calificacion de la unidad I ingresada correctamente\n";
                break;
            case 2:
                mensaje = "Calificacion de la unidad II ingresada correctamente\n";
                break;
            case 3:
                mensaje = "Calificacion de la unidad III ingresada correctamente\n";
                break;
            default:
                mensaje = "Hubo un error al registrar calificaion\n";
                break;
            
        }
        return mensaje;
    }
    
    public void calificar() {
        this.matricula.calcularPromedio();
    }
    
    public List<Matricula> reportar(String titulo) throws IOException {
        
        List<Matricula> resultado = new ArrayList<>();
        List<String> contenido = this.leerDirectorio(directorio, titulo);
        contenido.forEach((txt) -> {
            GsonBuilder gb = new GsonBuilder();
            gb.setPrettyPrinting();
            Gson gson = gb.create();
            try {
                Matricula m = gson.fromJson(txt, Matricula.class);
                resultado.add(m);
            } catch (JsonSyntaxException ex) {
                util.print("El texto no se pudo convertir en matricula" + ex.toString());
            }
        });
        return resultado;
        
    }

    //Envoltorio
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante:").append(matricula.getEstudiante()).append("\n");
        sb.append("Curso:").append(matricula.getCurso()).append("\n");
        sb.append("Calificaiones:");
        sb.append("Promedio:");
        sb.append(matricula.getPromedio());
        sb.append("\n");
        sb.append(matricula.imprimirDetalle()).append("\n");
        return sb.toString();
    }

    //Abular matricula
    public void anular(boolean op) {
        if (op == true) {
            this.matricula.setEstado(Estado.ANULADA);
            util.print("033[35mMatricula anulada correctamente\n");
            float rubro = this.matricula.getCurso().getCosto() * 0.10f;
            util.print("033[31mRubro de anulacion: $" + rubro);
        }
    }
    
    public void archivar() throws IOException {
        this.escribir(directorio, this.matricula.getNumero(), matricula);
    }
    
    public void configurar(Curso cr, Estudiante est) {
        this.matricula.setCurso(cr);
        this.matricula.setEstudiante(est);
        
    }
    
    @Override
    public void crear() {
        matricula = new Matricula();
    }
    
    @Override
    public void consultar(String id) throws IOException {
        
        String archivo = id + ".json";
        String contenido = this.leer(directorio, archivo);
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        matricula = gson.fromJson(contenido, Matricula.class);
    }
    
    @Override
    public void actualizar() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void eliminar() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
