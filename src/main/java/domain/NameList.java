package domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NameList {
    private List<Name> nameList;

    public NameList(String names) {
        split(names);
    }

    public void split(String names) {
        this.nameList = Stream.of(names.split(","))
                .map(name -> new Name(name))
                .collect(Collectors.toList());
    }

    public List<Name> getList() {
        return Collections.unmodifiableList(this.nameList);
    }

    public int size() {
        return nameList.size();
    }
}
