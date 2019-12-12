/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author 
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ClimateInfo ci = new ClimateInfo();
        
        PresentShowClimate disp = new PresentShowClimate();
        ViewMeter vm = new ViewMeter();
        
        ci.setCalculateClimate(1.1f, 21.1f, 1111.1f );
        ci.setCalculateClimate(21.1f, 81.1f, 921.1f );
        ci.setCalculateClimate(31.1f, 111.1f, 871.1f );
        System.out.println("Next");
        vm.detachObserver();
        ci.setCalculateClimate(1.1f, 21.1f, 1111.1f );
        ci.setCalculateClimate(21.1f, 81.1f, 921.1f );
        ci.setCalculateClimate(31.1f, 111.1f, 871.1f );
        System.out.println("Next");
        disp.detachObserver();
        
        ci.setCalculateClimate(1.1f, 21.1f, 1111.1f );
        ci.setCalculateClimate(21.1f, 81.1f, 921.1f );
        ci.setCalculateClimate(31.1f, 111.1f, 871.1f );
        
        vm.ShowClimate();
    }
    }
    

