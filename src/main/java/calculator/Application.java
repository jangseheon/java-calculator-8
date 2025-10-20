package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        try {
            String input = Console.readLine();
            String regex = "[,:]";
            int result = 0;
            if (input.equals("")) {
                System.out.println("결과 : 0");
                return;
            }
            if (input.startsWith("//")) {
                regex = String.valueOf(input.charAt(2));
                input = input.substring(4);
            }
            String[] tokens = input.split(regex);
            for (String s : tokens) {
                if (!(s.charAt(0) >= '1' && s.charAt(0) <= '9'))
                    throw new IllegalArgumentException("양수가 아닌 값은 들어갈 수 없습니다.");
                result += Integer.parseInt(s);
            }
            System.out.printf("결과 : " + result);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
