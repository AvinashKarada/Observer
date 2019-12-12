package observerpattern;


public class PresentShowClimate  {

    private float climateTempreture;
    private float climatehumidity;
    private IFeature ClimateInformation;
    
    public PresentShowClimate()
    {
        
    }
    public PresentShowClimate(ClimateInfo ClimateInformation) {
        //Here we create the object
        this.ClimateInformation  = (IFeature) ClimateInformation;
        //ClimateInformation.Link(this);
    }
    
  
    public void EditClimate(float climateTempreture, float climatehumidityity, float climatePressureure) {
        this.climateTempreture = climateTempreture;
        this.climatehumidity = climatehumidityity;
        ShowClimate();

    }


    public void ShowClimate() {
        System.out.println("CurrentShowClimate: climateTempreture: " + climateTempreture + " climatehumidityity: " + climatehumidity);

    }

    public void detachObserver(){//Will detatch the observer after chanes 
        try{
        ClimateInformation.detachObserver((IObserver) this);
        }catch(Exception e){}
    }
        
    public void Link(IFeature w){
        try{
        ClimateInformation = w;
        w.Link((IObserver) this);
        }catch(Exception e){}

    }
}
