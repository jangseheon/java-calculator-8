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
        if(input.startsWith("//")){
            regex = String.valueOf(input.charAt(2));
            input = input.substring(4);
        }
        String[] tokens = input.split(regex);
    }
}
