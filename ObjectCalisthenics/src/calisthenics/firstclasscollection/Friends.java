package calisthenics.firstclasscollection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by thaodang on 19/8/15.
 */
public class Friends {
    private final List<Person> friends;
    SimpleDateFormat dayFormat = new SimpleDateFormat("yyyyMMdd");

    public Friends(List<Person> friends) {
        this.friends = friends;
    }

    public List<Person> getFriendsWithBirthday(Date birthday) {
        return friends.stream().filter(p -> isSameDate(p.getBirthday(), birthday)).collect(Collectors.toList());
    }

    private boolean isSameDate(Date day1, Date day2) {
        return dayFormat.format(day1).equals(dayFormat.format(day2));
    }
}
