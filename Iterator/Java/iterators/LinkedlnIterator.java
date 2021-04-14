package  Java.iterators;
import Java.profile.Profile;
import Java.social_networks.Linkedln;

import java.util.ArrayList;
import java.util.List;

public class LinkedlnIterator implements ProfileIterator{
    private Linkedln linkedln;
    private String type;
    private String email;
    private int currentPosition=0;
    private List<String>emails=new ArrayList<>();
    private List<Profile>contacts=new ArrayList<>();

    public LinkedlnIterator(Linkedln linkedln,String type,String email){
        this.linkedln=linkedln;
        this.type=type;
        this.email=email;
    }
    private void lazyLoad(){
        if (emails.size() == 0) {
            List<String> profiles = linkedln.requestRelatedContactsFromLinkedInAPI(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.contacts.add(null);
            }
        }
    }
    @Override 
    public boolean hasNext(){
        lazyLoad();
        return currentPosition<emails.size();
    }
    @Override 
    public Profile getNext(){
        if (!hasNext()) {
            return null;
        }
        String friendEmail=emails.get(currentPosition);
        Profile friendContact=contacts.get(currentPosition);
        if (friendContact == null) {
            friendContact = linkedln.requestContactInfoFromLinkedInAPI(friendEmail);
            contacts.set(currentPosition, friendContact);
        }
        currentPosition++;
        return friendContact;
    }

    @Override
    public void reset(){
        currentPosition=0;

    }
}