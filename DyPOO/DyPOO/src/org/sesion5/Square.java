package org.sesion5;

public class Square implements Shape {

    @Override
    public void draw() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
