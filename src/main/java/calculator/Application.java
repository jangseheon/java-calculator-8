package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String input = Console.readLine();
        if(input.equals("")){
            System.out.println("결과 : 0");
            return;
        }
    }
}
