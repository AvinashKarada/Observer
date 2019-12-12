package observerpattern;


public interface IObserver {
    //This is the observer interface
//    /f there are any changes in the state then it will do quick notification this changes can happen liek modification
    public void EditClimate(float climateTempreture, float climatehumidityity, float climatePressureure);

    public void add(IObserver obj);

    public boolean contains(IObserver obj);

    public void remove(IObserver obj);

}
