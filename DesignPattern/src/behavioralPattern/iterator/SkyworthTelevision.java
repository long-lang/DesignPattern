package behavioralPattern.iterator;

public class SkyworthTelevision implements Television {
    protected  Object[] tvs= new Object[]{"CCTV-1","CCTV-2","CCTV-3","CCTV-4"};
    protected TvIterator tvIterator;
    @Override
    public TvIterator createIterator() {
        return new SkyworthIterator();
    }

    private class  SkyworthIterator implements TvIterator{
        private int count = 0;

        @Override
        public void setChannel(int i) {
            count = i;
        }

        @Override
        public Object currentChannel() {
            return tvs[count];
        }

        @Override
        public void next() {
                count++;
        }

        @Override
        public void previous() {
                count--;
        }

        @Override
        public boolean isLast() {
            if(count==tvs.length){
                return true;
            }
            return false;
        }

        @Override
        public boolean isFirst() {
            if(count==0){
                return  true;
            }
            return  false;
        }
    }
}
