package com.string;

/**
 * 2135
 * 零佰零拾零万贰仟壹佰叁拾伍元
 */
public class AmountConversion {
    public static void main(String[] args) {
        amountConversion(2135);
    }

    public static void amountConversion(int amount) {
        String res = "";
        String[] units = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String[] upperCaseNumber = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        for (int i = units.length - 1; i >= 0; i--) {
            if (amount != 0) {
                int num = amount % 10;
                amount = amount / 10;
                res = upperCaseNumber[num] + units[i] + res;
            } else {
                res = upperCaseNumber[0] + units[i] + res;
            }
        }
        System.out.println(res);
    }
}
