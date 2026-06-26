package com.hillel.homework.lesson11;

import java.util.Random;

public class GenPWMain {
    public static void main(String[] args) {
        BaseGenPW genPW = new BaseGenPW() {
            private final String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_";
            private final Random random = new Random();

            @Override
            public char getNextChar() {
                int randomIndex = random.nextInt(allowedChars.length());
                return allowedChars.charAt(randomIndex);
            }

            @Override
            public boolean isValid(String password) {
                boolean hasUppercase = false;
                boolean hasLowercase = false;
                boolean hasDigits = false;
                boolean hasUnderScore = false;
                for (int i = 0; i < password.length(); i++) {
                    if (Character.isUpperCase(password.charAt(i))) {
                        hasUppercase = true;
                    } else if (Character.isLowerCase(password.charAt(i))) {
                        hasLowercase = true;
                    } else if (Character.isDigit(password.charAt(i))) {
                        hasDigits = true;
                    } else if (password.charAt(i) == '_') {
                        hasUnderScore = true;
                    }
                    if (hasUppercase && hasLowercase && hasDigits && hasUnderScore) {
                        return true;
                    }
                }
                return hasUppercase && hasLowercase && hasDigits && hasUnderScore;
            }
        };
        String myPw = genPW.generate(8);
        System.out.println("Згенерований пароль: " + myPw);
    }
}
