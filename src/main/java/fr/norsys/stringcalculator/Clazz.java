package fr.norsys.stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class Clazz{
    int add(String numbers){
        // Split the input string by commas
        String[] num = numbers.split("[\n,]");

        int sum = 0;

        if (numbers.isEmpty()) {
            return sum;
        }


        for (String n : num) {
            if (n.contains("\n")) {
                throw new IllegalArgumentException("New lines between numbers");
            }
        }

        //
            if(num.length==1) {
                if (Integer.parseInt(num[0]) < 0){
                    throw new IllegalArgumentException("The Number Negative is : "+num[0]);
                }
                sum = Integer.parseInt(num[0]);
                return sum;
            }
            else if(num.length==0 ) {
                return sum;
            }else{
                List<Integer> negativeNumbers = new ArrayList<>();
                for (String n : num) {
                    int parsedInt = Integer.parseInt(n.trim());
                    if (parsedInt < 0) {
                        negativeNumbers.add(parsedInt);
                    }
                    if (parsedInt <= 1000) {
                        sum += parsedInt;
                    }

                }

                // 5 exception message for negative numbers
                if (!negativeNumbers.isEmpty()) {
                    throw new IllegalArgumentException("The Negative Numbers are: " + negativeNumbers);
                }




            }

        return sum;







    }

}