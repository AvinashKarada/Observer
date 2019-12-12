package observerpattern;


public interface IFeature {
    
    public void Link(IObserver obj);
    public void detachObserver(IObserver obj);
    
    public void AlertObservers();

}
