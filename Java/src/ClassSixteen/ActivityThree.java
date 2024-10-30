package ClassSixteen;

import Utils.TerminalFunctions;

public class ActivityThree {
    public static void primo () {
        int nNum = TerminalFunctions.inputInt("Ingrese cantidad de numeros primos que desea: ");
        
        if (nNum > 0) {
            System.out.print("2 ");
            int num = 3;
            int i = 1;
            int j;
            boolean esPrimo;
            while( i < nNum) {
                j = 3;
                esPrimo = true;
                while (esPrimo && j <= Math.sqrt(num)) {
                    if (num % j == 0) {
                        esPrimo = false;
                    }
                    j = j + 2;
                }
                if (esPrimo) {
                    System.out.print(num + " ");
                    i++;
                }
                num = num + 2;
            }
            System.out.println();
        }
    }
}
