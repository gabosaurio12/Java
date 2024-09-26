package com.dypoo;

public class ComparaObjetos {

    public static void main(String[] args) {
        Alumno a1 = new Alumno("S190202020", "Pedro Perez", 20);
        Alumno a2 = new Alumno("S190202020", "Aldo Perez", 20);
        Alumno a3 = new Alumno("S230140389", "Gabriel Lopez", 18);
        Alumno a4 = new Alumno("S237393493", "Lizeth Bello", 19);

        List<Alumno> lista = new ArrayList();
        


        if(a1.equals(a2)){
            System.out.println("a1 y a2 son el mismo alumno");
        }else{
            System.out.println("a1 y a2 difieren en nombre y/o matrícula");
        }
    }

}
