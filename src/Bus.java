import java.util.List;

public class Bus {
    private List<Passazhyr> array;
    private int totWeight;
    private double medianeWeight;
    public Bus(List<Passazhyr> a){
        array = a;
        totWeight = countTotalWeightOfPas(array);
        medianeWeight = countMedianeWeightOfPas(array);
    }
    public List<Passazhyr> getPass(){
        return array;
    }
    public void setPass(List<Passazhyr> a){
        this.array = a;
        totWeight = countTotalWeightOfPas(array);
        medianeWeight = countMedianeWeightOfPas(array);
    }
    public int getTotWeight(){
        return totWeight;
    }
    public double getMedianeWeight(){
        return medianeWeight;
    }
    public int numOfPas(){
        return array.size();
    }
    public int countTotalWeightOfPas(List<Passazhyr> a){
        int sum = 0;
        for (Passazhyr x: array){
            sum+= x.getWeight();
        }
        return sum;
    }
    public double countMedianeWeightOfPas(List<Passazhyr> a){
        double m = 0;
        if (a.size()>0) {
            if (a.size() % 2 == 0) {
                m = (a.get(a.size() / 2).getWeight() + a.get(a.size() / 2 - 1).getWeight()) / 2.0;
            } else
                m = a.get(a.size() / 2).getWeight();
        }
        return m;
    }
    @Override
    public String toString() {
        return  this.getClass().getName()+ "{" +
                " totalWeight = " + totWeight + " medianeWeight = " + medianeWeight +
                array.toString() +
                " }";
    }
}
