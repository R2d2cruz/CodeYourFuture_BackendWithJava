package ClassTen;

import Utils.TerminalFunctions;

public class ActivityFive {
    public static void copingInArray() {
        int[] originalInts = { 32, 16, 25 };
        int[] copyInts = { originalInts[0], originalInts[1], originalInts[2], 0, 0 };

        int aux = TerminalFunctions.inputInt("Ingrese nuevo valor para el arreglo");
        copyInts[3] = aux;
        
        aux = TerminalFunctions.inputInt("Ingrese nuevo valor para el arreglo");
        copyInts[4] = aux;

        System.out.println("[" + copyInts[0] + ", " + copyInts[1] + ", " + copyInts[2] + ", " + ", " + copyInts[3]
                + ", " + copyInts[4] + "]");
    }
}
