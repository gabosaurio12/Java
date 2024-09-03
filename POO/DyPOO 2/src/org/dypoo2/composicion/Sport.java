package org.dypoo2.composicion;

import org.dypoo2.agregacion.*;

public class Sport extends Vehiculo {

    public Sport() {
        super(new Motor("V10"));
    }
}
