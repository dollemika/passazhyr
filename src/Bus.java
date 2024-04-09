import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bus {
    private ArrayList<Passazhyr> array;
    private int totWeight = 0;
    private double medianeWeight = 0;

    public Bus(ArrayList<Passazhyr> a){
        array = a;
    }


    public ArrayList<Passazhyr> getPass(){
        return array;
    }
    public void setPass(ArrayList<Passazhyr> a){
        this.array = a;
        totWeight = countTotalWeightOfPas();
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
    public int countTotalWeightOfPas(){
//        int sum = 0;
//        for (Passazhyr x: array){
//            sum+= x.getWeight();
//        }
//        return sum;
        return array.stream().mapToInt(Passazhyr::getWeight).sum();
    }
    public double countMedianeWeightOfPas(ArrayList<Passazhyr> a){
        ArrayList<Passazhyr> tmp = (ArrayList<Passazhyr>) a.clone();
        tmp.sort(Comparator.comparing(Passazhyr::getWeight));
        double m = 0;
        if (tmp.size()>0) {
            if (tmp.size() % 2 == 0) {
                m = (tmp.get(tmp.size() / 2).getWeight() + tmp.get(tmp.size() / 2 - 1).getWeight()) / 2.0;
            } else
                m = tmp.get(tmp.size() / 2).getWeight();
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
