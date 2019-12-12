package observerpattern;

import java.util.ArrayList;

public  class ClimateInfo
{
    
    private ArrayList<IObserver> obj;
    private float climateTempreture=10;
    private float climatehumidity=20;
    private float climatePressure=30;
    
    public ClimateInfo() {
        obj = new ArrayList<IObserver>();
    }
    
    public void setCalculateClimate(float climateTempreture, float climatehumidity, float climatePressure) {
       //Here we set the value to memeber of class
        this.climateTempreture = climateTempreture;
        this.climatehumidity = climatehumidity;
        this.climatePressure = climatePressure;
        Alertobjervers();
    }

    
    public void Link(IObserver obj) {
        obj.add(obj);

    }

   //This will detatch observer
    public void detachObserver(IObserver obj) {
        if (obj.contains(obj)) {
            obj.remove(obj);
        }
    }

  //This will send notification 
    public void Alertobjervers() {
        PresentShowClimate obj=new PresentShowClimate();
        //for ( IObserver obj : obj) {
            obj.EditClimate(climateTempreture, climatehumidity, climatePressure);
      //  }

    }

}
