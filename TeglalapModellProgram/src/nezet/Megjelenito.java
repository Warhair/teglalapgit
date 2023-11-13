/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.util.Scanner;

/**
 *
 * @author tegzes.marton
 */
public class Megjelenito {
    private int a, b;
    private void bekeres(){
        Scanner sc = new Scanner(System.in);
        a = oldalmegadas(sc);
        b = oldalmegadas(sc);
    }

    private int oldalmegadas(Scanner sc) {
        int z = 0;
        while(a < 0){
            System.out.println("Adja meg az oldal hoszzát");
            a = sc.nextInt();
        }
        return a;
    }
}
