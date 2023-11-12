package leetcodequestions;

import java.util.ArrayList;
import java.util.List;

public class RomanToInteger {
    /*For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.
    -önce alinan roman rakamini toChar yapip bir liste olusturmali.
    -olusturulan listedeki tüm char'lar for döngüsüyle islenip if lerle toplanmali.
    -bunun icin bir integer sum degeri belirlenmeli.
    */
    public static void main(String[] args) {
        System.out.println(romanToNumber("XXVII"));
    }

    public static int romanToNumber(String roman) {
//        List<Character>  charRoman   =   new ArrayList<Character>();
//        for (Character w: roman.toCharArray()){
//            charRoman.add(w);
//        }

        int number = 0;
        for (Character w : roman.toCharArray()) {

            if (w == 'I' || w == 'i') {
                number += 1;
            } else if (w == 'V' || w == 'v') {
                number += 5;
            } else if (w == 'X' || w == 'x') {
                number += 10;
            } else if (w == 'L' || w == 'l') {
                number += 50;
            } else if (w == 'C' || w == 'c') {
                number += 100;
            } else if (w == 'D' || w == 'd') {
                number += 500;
            } else if (w == 'M' || w == 'm') {
                number += 1000;
            }

        }
        return number;
    }
}
