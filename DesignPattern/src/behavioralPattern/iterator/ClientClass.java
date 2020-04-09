package behavioralPattern.iterator;

public class ClientClass {
    public static void main(String[] args) {
        Television television = new SkyworthTelevision();
        TvIterator iterator = television.createIterator();
        while (!iterator.isLast()){
            System.out.println((String) iterator.currentChannel());
            iterator.next();
        }
        System.out.println("=========================");
        Television tclTelevision = new TCLTelevision();
        TvIterator tclIterator = tclTelevision.createIterator();
        while (!tclIterator.isLast()){
            System.out.println((String) tclIterator.currentChannel());
            tclIterator.next();
        }
    }


}
