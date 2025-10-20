package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String input = Console.readLine();

        if (input.equals("")) {
            System.out.println("결과 : 0");
            return;
        }

        System.out.printf("결과 : " + add(input));
    }

    static int add(String input){
        int result = 0;
        String regex = "[,:]";


        if (input.startsWith("//")) {
            if(input.indexOf("\n") != 3) throw new IllegalArgumentException("커스텀 구분자는 하나만 가능합니다.");
            regex = String.valueOf(input.charAt(2));
            input = input.substring(4);
        }
        String[] tokens = input.split(regex);
        for (String s : tokens) {
            if (!(s.charAt(0) >= '1' && s.charAt(0) <= '9'))
                throw new IllegalArgumentException("양수가 아닌 값은 들어갈 수 없습니다.");
            result += Integer.parseInt(s);
        }
        return result;
    }
}
