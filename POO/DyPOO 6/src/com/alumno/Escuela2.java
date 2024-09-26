import java.util.*;

public class Escuela {

    private Map<String, Set<String>> estudiantesMaterias = new HashMap<>();

    public static void main(String[] args) {

        Escuela esc = new Escuela();

        esc.agregarEstudiante("Liam", new String[]{"Matemáticas", "Física", "Historia"});
        esc.agregarEstudiante("Marian", new String[]{"Química", "Física", "Inglés"});
        esc.agregarEstudiante("Paola", new String[]{"Programación", "Biología", "Inglés"});
        esc.agregarEstudiante("Carlo", new String[]{"Historia", "Inglés", "Biología", "Programación"});

        esc.mostrarEstudiantes();

        esc.mostrarMateriasEstudiante("Liam");

        esc.mostrarMateriasComoArray("Marian");
    }

    public void agregarEstudiante(String nombre, String[] materias) {
        Set<String> setMaterias = new HashSet<>(Arrays.asList(materias));
        //Set<String> setMaterias = new HashSet<>();
        for(String materia : materias){
            setMaterias.add(materia);
        }
        estudiantesMaterias.put(nombre, setMaterias);
    }

    public void mostrarEstudiantes() {
        System.out.println("Lista de estudiantes y sus materias:");
        for (Map.Entry<String, Set<String>> entry : estudiantesMaterias.entrySet()) {
            System.out.println("Estudiante: " + entry.getKey() + " -> Materias: " + entry.getValue());
        }
    }

    public void mostrarMateriasEstudiante(String nombre) {
        Set<String> materias = estudiantesMaterias.get(nombre);
        if (materias != null) {
            System.out.println(nombre + " está inscrito en las siguientes materias: " + materias);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
    public void mostrarMateriasComoArray(String nombre) {
        Set<String> materias = estudiantesMaterias.get(nombre);
        if (materias != null) {
            String[] materiasArray = materias.toArray(new String[0]);
            System.out.println("Materias de " + nombre + " en formato de arreglo: " + Arrays.toString(materiasArray));
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
