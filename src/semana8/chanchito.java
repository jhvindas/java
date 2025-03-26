package semana8;

import generico.Utils;

public class chanchito {
    public static void main(String[] args) {
        //Variables
        double saldo = 0;
        int opcionMenu;
        String movimientos = "";

        do {
            Utils.limpiarConsola();
            System.out.println("%2d %-20s\n",1,"Ver saldo");
            System.out.println("%2d %-20s\n",2,"Depositar");
            System.out.println("%2d %-20s\n",3,"Retirar");
            System.out.println("%2d %-20s\n",4,"Movimientos");
            System.out.println("%2d %-20s\n",0,"Salir");
            opcionMenu = Utils.leerRangosEnteros("Digite la opcion: ", 0, 4);
            Utils.limpiarConsola();
            switch (opcionMenu) {
                case 0:
                    
                    break;
            
                default:
                    break;
            }


                } while (condition);
        

        //Limpia consola
        Utils.limpiarConsola();




    }
}
