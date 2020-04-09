package behavioralPattern.iterator;

public interface TvIterator {
    void setChannel(int i);
    Object currentChannel();
    void next();
    void previous();
    boolean isLast();
    boolean isFirst();
}
