import java.util.Iterator;

public class GroupListIterator implements Iterator<Students> {
    private  int index = 0;

    public GroupListIterator(Group groupList) {
        this.groupList = groupList;
    }

    private Group groupList;

    @Override
    public boolean hasNext() {
        return index < groupList.getStudentsGroup().size();
    }

    @Override
    public Students next() {
        return groupList.getStudentsGroup().get(index++);
    }
}
