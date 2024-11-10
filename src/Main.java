import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //עושים יותר שימןש ב ArrayList אשר עושים יותר חיפושים על הרשימה
        ArrayList<String> strings = new ArrayList<>();  //רשימה של מחרוזות
        System.out.println(strings.size());

        //רשימות תומכות אך ורק באחסון של אובייקטים.
        //כלומר, לא נוכל להגדיר רשימה של משתנים פרימטיביים למשל: מסוג int
        //
        //הפתרון, שימוש במחלקה עוטפת, באופן הבא

        ArrayList<Integer> numbersList = new ArrayList<>();
        System.out.println(numbersList.size());
        numbersList.add(2); //  המתודה מקבלת כפרמטר את האובייקט שיש להוסיף הוא יתווסף בסוף הרשימה.
        numbersList.add(8);
        numbersList.add(9);
        System.out.println(numbersList.size());


        // ברשימות יש מתודת toString מובנת ולכן ניתן להדפיס את הרשימה בעזרת פקודת הדפסה פשוטה
        System.out.println(numbersList);

        // ניתן להוסיף אובייקט לרשימה גם לפי האינדקס שאליו אנחנו רוצים להוסיף את האובייקט,
        // קודם נכתוב במתודה add את המיקום הרצוי ואז את הערך של האיבר שאותו אנחנו רוצים להוסיף לרשימה.

        numbersList.add(1, 10);
        System.out.println(numbersList);
        System.out.println(numbersList.get(0));  // איך לגשת לאיבר באינדקס מסוים ברשימה



        // עושים שימוש ב LinkedList יותר כאשר עושים יותר שינויים (תוספות והסרות) ברשימה
        LinkedList<String> strings2 = new LinkedList<>();

        strings2.add("Jon");
        strings2.add("Daniel");
        strings2.add("Bob");
        System.out.println(strings2.size());
        System.out.println(strings2);
        System.out.println(strings2.get(1)); // איך לגשת לאיבר באינדקס מסוים ברשימה
        strings2.remove("Jon");  // להסיר איבר מהרשימה בעזרת הערך שלו
        System.out.println(strings2);
        strings2.remove(1);  // להסיר איבר מהרשימה בעזרת האינדקס שלו
        System.out.println(strings2);


//        List<String> names = Arrays.asList("Greg", "David");  // ככה מאתחלים רשימה ישר עם איברים בתוכה
//
//        System.out.println(names);


    }
}