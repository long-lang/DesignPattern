package behavioralPattern.iterator;

public class TCLTelevision implements Television {
    protected  Object[] tvs= new Object[]{"CCTV-5","CCTV-6","CCTV-7","CCTV-8"};
    protected TvIterator tvIterator;
    @Override
    public TvIterator createIterator() {
        return new TCLIterator();
    }

    private class  TCLIterator implements TvIterator{
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
