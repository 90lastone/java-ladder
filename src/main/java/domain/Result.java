package domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Result {
    private Map<Name, Name> result = new HashMap<>();

    public Result(NameList personNameList, NameList resultNameList, Ladder ladder) {
        int index = 0;
        for (Name personName : personNameList.getList()) {
            int position = index;
            for (Line line : ladder.getLadder()) {
                if ((position - 1) >= 0
                        && line.getLine().get(position - 1)) {
                    position = position == 0 ? position : position - 1;
                    continue;
                } else if (position < line.getLine().size()
                        && line.getLine().get(position)) {
                    position += 1;
                    continue;
                }
            }
            result.put(personName, resultNameList.getList().get(position));
            index++;
        }
    }

    public Name search(String personName) {
        for (Name key: result.keySet()) {
            if (key.getName().equals(personName)) {
                return result.get(key);
            }
        }
        return null;
    }

    public Map<Name, Name> getResult() {
        return Collections.unmodifiableMap(this.result);
    }
}
