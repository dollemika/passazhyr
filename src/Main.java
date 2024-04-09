import java.time.chrono.ThaiBuddhistChronology;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Passazhyr[] a1 = {new Passazhyr("a",11,50),new Passazhyr("b",11,60)};
        Bus b1 = new Bus(new ArrayList<>());
        b1.setPass(List.of(a1));

        Passazhyr[] a2 = {new Passazhyr("c",11,40),new Passazhyr("d",11,45)};
        Bus b2 = new Bus(new ArrayList<>());
        b2.setPass(List.of(a2));

        Passazhyr[] a3 = {new Passazhyr("e",11,65),new Passazhyr("f",11,50),new Passazhyr("j",11,40)};
        Bus b3 = new Bus(new ArrayList<>());
        b3.setPass(List.of(a3));

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
