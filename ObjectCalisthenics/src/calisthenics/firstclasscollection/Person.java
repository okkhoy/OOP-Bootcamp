package calisthenics.firstclasscollection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Created by thaodang on 18/8/15.
 */
public class Person {
    private final List<Person> friends;
    private final Date birthday;
    SimpleDateFormat dayFormat = new SimpleDateFormat("yyyyMMdd");

    public Person(List<Person> friends, Date birthday) {
        this.friends = friends;
        this.birthday = birthday;
    }

    public List<Person> getSameAgeFriends() {
        return friends.stream().filter(p -> isSameBirthday(p)).collect(Collectors.toList());
    }

    private boolean isSameBirthday(Person friend) {
        return dayFormat.format(friend.birthday).equals(dayFormat.format(birthday));
    }
}
