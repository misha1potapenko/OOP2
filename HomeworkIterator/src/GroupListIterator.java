import java.util.Iterator;

public class GroupListIterator implements Iterator<Students> {
    private  int index = -1;

    private Group groupList;

    public GroupListIterator(Group groupList) {
        this.groupList = groupList;
    }

    @Override
    public boolean hasNext() {
        return index < groupList.getSize();
    }

    @Override
    public Students next() {
        return groupList.get(index++);
    }
}
