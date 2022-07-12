package company.com; // package оператор для создания пакета // подключение пакета для вывода текста в консоль // любой класс объявленный в этом файле принадлежит указанному пакету // пакеты расширяют возможности
//import java.io.*;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Calc { // public - модификатор доступа, доступ за пределами класса (открытый) // Основной класс
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, IllegalArgumentException { // static для вызова функции main(), void не возвращает значений, функция main()
        // write your code here
        System.out.println("калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами : a + b, a - b, a * b, a / b"); //System - предопределенный класс с доступом, out - поток вывода, функция println() - вывод текста на консоль
        System.out.println("числа от 1 до 10 включительно (целые числа), не более"); // вывод текста на консоль
        //Animal number = Animal.valueOf("III"); // user input
        //System.out.println(number.getTranslation());
        PersonZero fdsa = new PersonZero();
        Person0 asdf = new Person0(); // создает объект asdf класса Person0
        //PersonZero fdsa = new PersonZero(); // создает объект asdf класса Person0
        Scanner in = new Scanner(System.in); //для считывания ввода
        String str0; // декларация переменной (выделение в памяти место)
        String vvod0; // декларация переменной (выделение в памяти место)
        String pattern0 = "\\*|\\+|, \\+|\\-|, \\-|\\/|, \\/";  // \\ - для специальных символов экранирование символа
        Pattern pattern = Pattern.compile("(\\+|\\-|\\*|\\/)"); // регулярные выражения
        //Pattern pattern1 = Pattern.compile("(I|II|III|IV|V|VI|VII|VIII|IX|X)");
        //String d1 = new String("I");
        //System.out.println(df.codePointAt(0));
        try { // попытаться выполнить
            do { // цикл do-while
                vvod0 = in.nextLine(); // Значение вводится с клавиатуры // user input number type String // строковый ввод
                String[] strings0 = vvod0.split(pattern0); // split разделение строки в массив, как встретит символ pattern0
                for (int i = 0; i < strings0.length; i++) { // цикл for, strings0.length число символов в строке с пробелами, инкремент post префиксная запись
                    strings0[i] = strings0[i].trim(); // strings0[i] обращение по индексу, trim обрезает пробелы в начале и в конце
                    try { // попытаться выполнить
                        Animal num = Animal.valueOf(strings0[i]); // num переменная, Animal имя класса enum в единственном числе, valueOf - из строки в enum, strings0[i] - user ввел
                        //System.out.println(num); //num - 1 4 strings0 - I IV
                        if (i == 0) {
                            //strings0[i] = num.getTranslation();
                            fdsa.x = strings0[0];
                        }
                        if (i == 1) {
                            //strings0[i] = num.getTranslation();
                            fdsa.y = strings0[1];

                            Matcher matcher = pattern.matcher(vvod0);
                            int j = 0;
                            String month_days[] = new String[strings0.length];
                            while (matcher.find()) { // регулярные выражения
                                month_days[j] = matcher.group(); // регулярные выражения
                                j++; // инкремент post префиксная запись
                            }
                            String tion;
                            tion = month_days[0];
                            fdsa.calc(tion); //отправка данных asdf в method speak
                        }

                        //strings0[i] = num.getTranslation(); // присвоить перевод, метода getTranslation()
                        if (i == 2) { // strings0[3] // Если условие истенно, выполняется
                            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)"); // вывод текста на консоль
                        }
                    } catch (IllegalArgumentException e){ // обработка Exception
                        //System.out.println("throws Exception //т.к. используется одновременно разные системы счисления");

                    if (i == 2) { // strings0[3] // Если условие истенно, выполняется // оператор if
                        System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)"); // блок кода // вывод текста на консоль
                    }
                        //System.out.println("throws Exception //т.к. используется одновременно разные системы счисления");

//                    Matcher matcher = pattern1.matcher(strings0[i]); // регулярные выражения
//                    while (matcher.find()) { // регулярные выражения//
//                        //strings0[i] = matcher.group(); // регулярные выражения
//                        Animal num = Animal.valueOf(strings0[i]);//
//                        strings0[i] = num.getTranslation();//
//                    }
                }
                catch (NullPointerException e){
                        System.out.println("throws Exception //т.к. используется одновременно разные системы счисления");
                    }

                }

                try { // попытаться выполнить
                    asdf.a = Integer.parseInt(strings0[0]); // преобразование in int с помощью метода parseInt // копии переменной a, хранящейся в объекте asdf, присвоить значение, Integer class, method parseInt


                    if (asdf.a >= 1 && asdf.a <= 10) { // &&-И // Если условие истенно, выполняется
                        try { // попытаться выполнить
                            asdf.b = Integer.parseInt(strings0[1]); // преобразование in int с помощью метода parseInt // копии переменной b, хранящейся в объекте asdf, присвоить значение, method parseInt
                            if (asdf.b >= 1 && asdf.b <= 10) { // &&-И // Если условие истенно, выполняется
                                Matcher matcher = pattern.matcher(vvod0);
                                int j = 0; // декларация переменной (выделение в памяти место) and инициализация
                                String month_days[] = new String[strings0.length]; // объявление одномерного массива с выделением памяти массиву, new ключевое слово, strings0.length число символов в строке с пробелами
                                while (matcher.find()) { // регулярные выражения
                                    month_days[j] = matcher.group(); // регулярные выражения
                                    j++; // инкремент post префиксная запись
                                }
                                asdf.operation = month_days[0]; // копии переменной operation, хранящейся в объекте asdf, присвоить значение
                                try { // попытаться выполнить
                                    if (month_days[1] != null) { // НЕ равно // Если условие истенно, выполняется
                                        System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)"); // вывод текста на консоль
                                    } else { // иначе
                                        try { // попытаться выполнить
                                            str0 = asdf.speak(); //отправка данных asdf в method speak
                                        } catch (NullPointerException e) { // обработка Exception
                                        }
                                    }
                                } catch (ArrayIndexOutOfBoundsException e) { // обработка Exception
                                }
                            } else { // иначе
                                System.out.println("числа от 1 до 10 включительно, не более"); // вывод текста на консоль
                            }
                        } catch (ArrayIndexOutOfBoundsException e) { // обработка Exception
                            System.out.println("throws Exception //т.к. строка не является математической операцией"); // вывод текста на консоль
                        } catch (NumberFormatException e) { // обработка Exception
                            System.out.println("throws Exception //т.к. строка не является математической операцией"); // вывод текста на консоль
                            break;
                        } catch (IllegalStateException e) { // обработка Exception
                        }
                        //str0 = asdf.speak();
                        //System.out.println(str0);
                        //}
                        //while (str0 == "operation не распознана [повторите ввод]");
                    } else { // иначе
                        System.out.println("числа от 1 до 10 включительно, не более"); // вывод текста на консоль
                        in.close(); // закрытие входного потока
                    }
                } catch (NumberFormatException e) { // обработка Exception
                    //System.out.println("throws Exception //т.к. строка не является математической операцией"); // вывод текста на консоль
                    if (strings0[0] != null ) {
                        //System.out.println("throws Exception //т.к. используется одновременно разные системы счисления");
                        break;
                    } else {
                        System.out.println("throws Exception //т.к. используется одновременно разные системы счисления");
                    }
//                    if (h == Integer.parseInt(null)) {
//                        System.out.println("throws Exception //т.к. используется одновременно разные системы счисления");
//                    }
                    //System.out.println("throws Exception //т.к. используется одновременно разные системы счисления");
                } catch (IllegalStateException e) { // обработка Exception
                    //System.out.println("throws Exception //т.к. используется одновременно разные системы счисления");
                }
            } while (!vvod0.equals("8*8")); // цикл do-while // equals сравнивает строку с принимаемой строкой (true-false)
        } catch (IllegalStateException e) { // обработка Exception
        }
        in.close(); // закрытие входного потока
    }
}


class PersonZero{
    static String x;
    static String y;


    static void volumeOne(String resuone) {
        //String t = "V";
        //System.out.println(t);
        switch (resuone) {
            case "0":
                System.out.println("NullPointerException");
                break;
            case "1":
                System.out.println("result: "+"I");
                break;
            case "2":
                System.out.println("result: "+"II");
                break;
            case "3":
                System.out.println("result: "+"III");
                break;
            case "4":
                System.out.println("result: "+"IV");
                break;
            case "5":
                System.out.println("result: "+"V");
                break;
            case "6":
                System.out.println("result: "+"VI");
                break;
            case "7":
                System.out.println("result: "+"VII");
                break;
            case "8":
                System.out.println("result: "+"VIII");
                break;
            case "9":
                System.out.println("result: "+"IX");
                break;
            case "10":
                System.out.println("result: "+"X");
                break;
            case "11":
                System.out.println("result: "+"XI");
                break;
            case "12":
                System.out.println("result: "+"XII");
                break;
            case "13":
                System.out.println("result: "+"XIII");
                break;
            case "14":
                System.out.println("result: "+"XIV");
                break;
            case "15":
                System.out.println("result: "+"XV");
                break;
            case "16":
                System.out.println("result: "+"XVI");
                break;
            case "17":
                System.out.println("result: "+"XVII");
                break;
            case "18":
                System.out.println("result: "+"XVIII");
                break;
            case "19":
                System.out.println("result: "+"XIX");
                break;
            case "20":
                System.out.println("result: "+"XX");
                break;
            case "21":
                System.out.println("result: "+"XXI");
                break;
            case "22":
                System.out.println("result: "+"XXII");
                break;
            case "23":
                System.out.println("result: "+"XXIII");
                break;
            case "24":
                System.out.println("result: "+"XXIV");
                break;
            case "25":
                System.out.println("result: "+"XXV");
                break;
            case "26":
                System.out.println("result: "+"XXVI");
                break;
            case "27":
                System.out.println("result: "+"XXVII");
                break;
            case "28":
                System.out.println("result: "+"XXVIII");
                break;
            case "29":
                System.out.println("result: "+"XXIX");
                break;
            case "30":
                System.out.println("result: "+"XXX");
                break;
            case "31":
                System.out.println("result: "+"XXXI");
                break;
            case "32":
                System.out.println("result: "+"XXXII");
                break;
            case "33":
                System.out.println("result: "+"XXXIII");
                break;
            case "34":
                System.out.println("result: "+"XXXIV");
                break;
            case "35":
                System.out.println("result: "+"XXXV");
                break;
            case "36":
                System.out.println("result: "+"XXXVI");
                break;
            case "37":
                System.out.println("result: "+"XXXVII");
                break;
            case "38":
                System.out.println("result: "+"XXXVIII");
                break;
            case "39":
                System.out.println("result: "+"XXXIX");
                break;
            case "40":
                System.out.println("result: "+"XL");
                break;
            case "41":
                System.out.println("result: "+"XLI");
                break;
            case "42":
                System.out.println("result: "+"XLII");
                break;
            case "43":
                System.out.println("result: "+"XLIII");
                break;
            case "44":
                System.out.println("result: "+"XLIV");
                break;
            case "45":
                System.out.println("result: "+"XLV");
                break;
            case "46":
                System.out.println("result: "+"XLVI");
                break;
            case "47":
                System.out.println("result: "+"XLVII");
                break;
            case "48":
                System.out.println("result: "+"XLVIII");
                break;
            case "49":
                System.out.println("result: "+"XLIX");
                break;
            case "50":
                System.out.println("result: "+"L");
                break;
            case "51":
                System.out.println("result: "+"LI");
                break;
            case "52":
                System.out.println("result: "+"LII");
                break;
            case "53":
                System.out.println("result: "+"LIII");
                break;
            case "54":
                System.out.println("result: "+"LIV");
                break;
            case "55":
                System.out.println("result: "+"LV");
                break;
            case "56":
                System.out.println("result: "+"LVI");
                break;
            case "57":
                System.out.println("result: "+"LVII");
                break;
            case "58":
                System.out.println("result: "+"LVIII");
                break;
            case "59":
                System.out.println("result: "+"LIX");
                break;
            case "60":
                System.out.println("result: "+"LX");
                break;
            case "61":
                System.out.println("result: "+"LXI");
                break;
            case "62":
                System.out.println("result: "+"LXII");
                break;
            case "63":
                System.out.println("result: "+"LXIII");
                break;
            case "64":
                System.out.println("result: "+"LXIV");
                break;
            case "65":
                System.out.println("result: "+"LXV");
                break;
            case "66":
                System.out.println("result: "+"LXVI");
                break;
            case "67":
                System.out.println("result: "+"LXVII");
                break;
            case "68":
                System.out.println("result: "+"LXVIII");
                break;
            case "69":
                System.out.println("result: "+"LXIX");
                break;
            case "70":
                System.out.println("result: "+"LXX");
                break;
            case "71":
                System.out.println("result: "+"LXXI");
                break;
            case "72":
                System.out.println("result: "+"LXXII");
                break;
            case "73":
                System.out.println("result: "+"LXXIII");
                break;
            case "74":
                System.out.println("result: "+"LXXIV");
                break;
            case "75":
                System.out.println("result: "+"LXXV");
                break;
            case "76":
                System.out.println("result: "+"LXXVI");
                break;
            case "77":
                System.out.println("result: "+"LXXVII");
                break;
            case "78":
                System.out.println("result: "+"LXXVIII");
                break;
            case "79":
                System.out.println("result: "+"LXXIX");
                break;
            case "80":
                System.out.println("result: "+"LXXX");
                break;
            case "81":
                System.out.println("result: "+"LXXXI");
                break;
            case "82":
                System.out.println("result: "+"LXXXII");
                break;
            case "83":
                System.out.println("result: "+"LXXXIII");
                break;
            case "84":
                System.out.println("result: "+"LXXXIV");
                break;
            case "85":
                System.out.println("result: "+"LXXXV");
                break;
            case "86":
                System.out.println("result: "+"LXXXVI");
                break;
            case "87":
                System.out.println("result: "+"LXXXVII");
                break;
            case "88":
                System.out.println("result: "+"LXXXVIII");
                break;
            case "89":
                System.out.println("result: "+"LXXXIX");
                break;
            case "90":
                System.out.println("result: "+"XC");
                break;
            case "91":
                System.out.println("result: "+"XCI");
                break;
            case "92":
                System.out.println("result: "+"XCII");
                break;
            case "93":
                System.out.println("result: "+"XCIII");
                break;
            case "94":
                System.out.println("result: "+"XCIV");
                break;
            case "95":
                System.out.println("result: "+"XCV");
                break;
            case "96":
                System.out.println("result: "+"XCVI");
                break;
            case "97":
                System.out.println("result: "+"XCVII");
                break;
            case "98":
                System.out.println("result: "+"XCVIII");
                break;
            case "99":
                System.out.println("result: "+"XCIX");
                break;
            case "100":
                System.out.println("result: "+"C");
                break;
            default: // если не один case условие не выполнилось
                String ss = "throws Exception //т.к. в римской системе нет отрицательных чисел";
                System.out.println(ss);



        }

    }


    public static String calc(String input) {
        Animal xx = Animal.valueOf(x);
        Animal yy = Animal.valueOf(y);
        int xxx = Integer.parseInt( xx.getTranslation() );
        int yyy = Integer.parseInt( yy.getTranslation() );

        int resu;
        String resuone;
        if (input.equals("+")) {
            resu = (xxx + yyy);
            resuone = String.valueOf(resu);
            volumeOne(resuone);
        }
        if (input.equals("-")) {
            resu = (xxx - yyy);
            resuone = String.valueOf(resu);
            volumeOne(resuone);
        }
        if (input.equals("*")) {
            resu = (xxx * yyy);
            resuone = String.valueOf(resu);
            volumeOne(resuone);
        }
        if (input.equals("/")) {
            resu = (xxx / yyy);
            resuone = String.valueOf(resu);
            volumeOne(resuone);
        }



        //String strings0;
        //Animal num = Animal.valueOf(input); // num переменная, Animal имя класса enum в единственном числе, valueOf - из строки в enum, strings0[i] - user ввел
        //strings0 = num.getTranslation(); // присвоить перевод, метода getTranslation()
        //System.out.println(strings0);
        return null;
    }


    }


class Person0{ // классы с большой буквы согласно конвекции
    int a; // декларация переменной (выделение в памяти место), 32bit number, данные объекта
    int b; // определяем тип_данных
    int c;
    String operation; // декларация переменной (выделение в памяти место), данные объекта, String является классом с большой буквы согласно конвекции

    // method speak:
    String speak(){ // String type возвращаемого значения, методы с маленькой буквы
        int result; // декларация переменной (выделение в памяти место), 32bit number
        switch (operation) { // switch
            case "+":   // "+" ввод строкой
                result = (a+b); // вычисление
                System.out.println("result: "+result); // вывод текста на консоль
                return String.valueOf(result);
            case "-":   // "-" ввод строкой
                result = (a-b); // вычисление
                System.out.println("result: "+result); // вывод текста на консоль
                return String.valueOf(result);
            case "*":   // "*" ввод строкой
                result = (a*b); // вычисление
                System.out.println("result: "+result); // вывод текста на консоль
                return String.valueOf(result);
            case "/":   // "/" ввод строкой
                result = (a/b); // вычисление
                System.out.println("result: "+result); // вывод текста на консоль
                return String.valueOf(result);
            default: // если не один case условие не выполнилось
                String s = "operation не распознана [повторите ввод]"; //String является классом, s ссылается на объект класса String, объект "ХхХ" созданный из класса String
                System.out.println(s); // вывод текста на консоль
                return s;
        }
    }
}