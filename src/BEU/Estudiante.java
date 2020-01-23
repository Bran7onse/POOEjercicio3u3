package BEU;

import fonseca.Persona;
import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

    private String carrera;
    private final List<String> clubes = new ArrayList<>();

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void addClub(String club) {
        if (!club.isEmpty()) {
            clubes.add(club);
        }
    }

    public List<String> getClubes() {
        return clubes;
    }

}
