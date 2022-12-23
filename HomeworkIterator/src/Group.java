import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group implements Iterable<Students> {
    private List<Students> students;

    public Group(List<Students> students) {

        this.students = students;
    }


    public int getSize(){
        return students.size();
    }

    public Students get (int index){
        return students.get(index);
    }

    @Override
    public Iterator<Students> iterator() {
        return new GroupListIterator(this);
    }
}

