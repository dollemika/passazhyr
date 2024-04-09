import java.time.chrono.ThaiBuddhistChronology;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Passazhyr> a1 = new ArrayList<>();
        a1.add(new Passazhyr("a",11,50));
        a1.add(new Passazhyr("b",11,60));
        Bus b1 = new Bus(new ArrayList<>());
        b1.setPass(a1);

        ArrayList<Passazhyr> a2 = new ArrayList<>();
        a2.add(new Passazhyr("c",11,40));
        a2.add(new Passazhyr("d",11,45));
        Bus b2 = new Bus(new ArrayList<>());
        b2.setPass(a2);

        ArrayList<Passazhyr> a3 = new ArrayList<>();
        a3.add(new Passazhyr("e",11,65));
        a3.add(new Passazhyr("f",11,50));
        a3.add(new Passazhyr("j",11,40));
        Bus b3 = new Bus(new ArrayList<>());
        b3.setPass(a3);

        List<Bus> avtopark = new ArrayList<>();
        avtopark.add(b1);
        avtopark.add(b2);
        avtopark.add(b3);

        System.out.println(avtopark);
        avtopark.sort(Comparator.comparing(Bus::getTotWeight));
        System.out.println(avtopark);
        avtopark.sort(Comparator.comparing(Bus::getMedianeWeight));
        System.out.println(avtopark);
    }
}
