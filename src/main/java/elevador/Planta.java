/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package elevador;

/**
 *
 * @author aiman
 */
public enum Planta {
        PLANTA_0(0),
        PLANTA_1(1),
        PLANTA_2(2),
        PLANTA_3(3),
        PLANTA_4(4),
        PLANTA_5(5),
        PLANTA_6(6),
        PLANTA_7(7),
        PLANTA_8(8);

        private final int numPlanta;

        Planta(int numPlanta) {
            this.numPlanta = numPlanta;
        }

        public int getNumPlanta() {
            return numPlanta;
        }
}
