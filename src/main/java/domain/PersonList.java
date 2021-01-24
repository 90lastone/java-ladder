package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonList {
    private List<Person> personList;

    public PersonList(String names) {
        this.personList = Util.split(names);
    }

    public List<Person> getList() {
        return Collections.unmodifiableList(this.personList);
    }

    public int size() {
        return personList.size();
    }
}
