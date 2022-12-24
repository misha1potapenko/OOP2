import java.util.Iterator;

public class GroupListIterator implements Iterator<Students> {
    private  int index = 0;

    private Group groupList;

    public GroupListIterator(Group groupList) {
        this.groupList = groupList;
    }

    @Override
    public boolean hasNext() {
        return index < groupList.getSize()-1;
    }

    @Override
    public Students next() {
        System.out.println("Текущий индекс = " + index);
        return groupList.get(index++);
    }
}
