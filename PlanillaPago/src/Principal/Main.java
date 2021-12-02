/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Interfaz.Login;
import Planilla.PlanillaPago;

/**
 *
 * @author jezer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlanillaPago planilla = new PlanillaPago();

        Login login = new Login();
        login.setPlanillaPago(planilla);
        login.setVisible(true);
    }
    
}
