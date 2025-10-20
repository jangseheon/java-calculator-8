package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String input = Console.readLine();

        if (input == null || input.isEmpty()) {
            System.out.println("결과 : 0");
            return;
        }

        System.out.printf("결과 : " + add(input));
    }

    static int add(String input){
        int result = 0;
        String regex = "[,:]";

        if (input.startsWith("//")) {
            int index = input.indexOf("\n");
            if(index < 0) throw new IllegalArgumentException("커스텀 구분자 형식 오류입니다.");
            String new_regex = input.substring(2,index);
            if(new_regex.length() != 1) throw new IllegalArgumentException("커스텀 구분자는 하나만 가능합니다.");
            String Meta = ".^$*+?()[]{}|\\\\";
            if(Meta.contains(new_regex)) regex = "\\\\" + new_regex;
            else regex = new_regex;
            input = input.substring(index+1);
        }
        String[] tokens = input.split(regex);
        for (String s : tokens) {
            int n = Integer.parseInt(s);
            if(n <= 0)
                throw new IllegalArgumentException("양수가 아닌 값은 들어갈 수 없습니다.");
            result += n;
        }
        return result;
    }
}
