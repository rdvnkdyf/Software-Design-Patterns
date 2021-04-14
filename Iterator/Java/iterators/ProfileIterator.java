package  Java.iterators;
import Java.profile.Profile;

public interface ProfileIterator{
    boolean hasNext();

    Profile getNext();

    void reset();
}