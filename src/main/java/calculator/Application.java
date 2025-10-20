package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String input = Console.readLine();
        String regex = "[,:]";
        if(input.equals("")){
            System.out.println("결과 : 0");
            return;
        }

        String[] tokens = input.split(regex);
    }
}
