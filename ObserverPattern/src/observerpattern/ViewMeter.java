package observerpattern;


public class ViewMeter implements Ishow, IObserver {
    private float climatePressure;
    private IFeature ClimateInformation;
    
    public ViewMeter()
    {
        
    }
    public ViewMeter(IFeature ClimateInformation) {
        this.ClimateInformation  = ClimateInformation;
        ClimateInformation.Link(this);
    }
    
   //Viewmwter show the climate chnages and show the climate
    public void EditClimate(float climateTempreture, float climatehumidityity, float climatePressureure) {
        this.climatePressure = climatePressureure;
        ShowClimate();

    }

  //Show the cliemate
    public void ShowClimate() {
        System.out.println("BarometerShowClimate: climatePressureure: " + climatePressure);

    }

    public void detachObserver(){
        try{
        ClimateInformation.detachObserver(this);
        }catch(Exception e){}
    }
        
    public void Link(IFeature w){
         try{
        ClimateInformation = w;
        w.Link(this);
        }catch(Exception e){}
    }

    @Override
    public void add(IObserver obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(IObserver obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(IObserver obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
