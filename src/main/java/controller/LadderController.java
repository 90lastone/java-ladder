package controller;

import domain.Ladder;
import domain.Name;
import domain.NameList;
import domain.Result;
import view.InputView;
import view.ResultView;

public class LadderController {
    public static void gameStart() {
        String names = InputView.participationNames();
        NameList personNameList = new NameList(names);

        String results = InputView.executeResults();
        NameList resultNameList = new NameList(results);

        int ladderHeight = InputView.ladderHeight();
        Ladder ladder = new Ladder(ladderHeight, personNameList.size());

        ResultView.printLadder(personNameList, resultNameList, ladder);

        Result result = new Result(personNameList, resultNameList, ladder);
        // all 입력될떄까지 반복
        boolean flag = true;
        while (flag) {
            String test = InputView.resultName();
            if (test.equals("all")) {
                flag = false;
            } else {
                ResultView.printResult(result.search(test));
            }
        }

        // all 출력
        ResultView.printResultAll(result);
    }
}
