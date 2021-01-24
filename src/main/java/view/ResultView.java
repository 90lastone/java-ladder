package view;

import domain.*;

public class ResultView {
    private static String printName(String name) {
        return String.format("%5s", name);
    }

    private static void printNames(NameList personList) {
        personList.getList()
                .stream()
                .map(person -> printName(person.getName()) + " ")
                .forEach(System.out::print);
    }

    private static void printPoint(boolean point) {
        String printMessage = point ? "-----" : "     ";
        System.out.print(printMessage);
        System.out.print("|");
    }

    private static void printLine(Line line) {
        System.out.print("   |");
        line.getLine()
                .forEach(point -> printPoint(point));
        System.out.println();
    }

    public static void printLadder(NameList personList, NameList resultList, Ladder ladder) {
        System.out.println("사다리 결과");
        System.out.println();

        printNames(personList);
        System.out.println();
        ladder.getLadder()
                .forEach(line -> printLine(line));

        printNames(resultList);
        System.out.println();
    }

    public static void printResult(Name resultName) {
        System.out.println("실행 결과");
        System.out.println(resultName.getName());
    }

    public static void printResultAll(Result result) {
        System.out.println("실행 결과");

        for (Name key: result.getResult().keySet()) {
            System.out.println(key.getName() + " : " + result.getResult().get(key).getName());
        }
    }
}
