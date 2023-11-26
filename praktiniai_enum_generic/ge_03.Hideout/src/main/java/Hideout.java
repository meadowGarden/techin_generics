import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {

    List<T> hideout;

    public Hideout() {
        hideout = new ArrayList<>();
    }

    public void putIntoFromHideout(T t) {
        if (hideout.size() == 0) {
            hideout.add(t);
        } else if (hideout.size() == 1) {
            hideout.clear();
            hideout.add(t);
        }
    }

    public T takeFromHideout() {
        if (hideout.isEmpty()) {
            return null;
        }
        return hideout.get(0);
    }




}
