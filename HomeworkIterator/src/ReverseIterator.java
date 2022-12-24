import java.util.Iterator;

public class ReverseIterator implements Iterator<Students> {
    private  int index;
    private Group group;

    public ReverseIterator(Group group) {
        this.group = group;
        index = group.getSize()-1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Students next() {
        System.out.println("Текущий индекс = " + index);
        return group.get(index--);

    }


}
