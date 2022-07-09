package company.com; // package оператор для создания пакета // подключение пакета для вывода текста в консоль // любой класс объявленный в этом файле принадлежит указанному пакету // пакеты расширяют возможности
//import java.io.*;
//import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Calc { // public - модификатор доступа, доступ за пределами класса (открытый) // Основной класс
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException { // static для вызова функции main(), void не возвращает значений, функция main()
        // write your code here
        System.out.println("калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами : a + b, a - b, a * b, a / b"); //System - предопределенный класс с доступом, out - поток вывода, функция println() - вывод текста на консоль
        System.out.println("числа от 1 до 10 включительно (целые числа), не более"); // вывод текста на консоль
        //Animal number = Animal.valueOf("III"); // user input
        //System.out.println(number.getTranslation());
        Person0 asdf = new Person0(); // создает объект asdf класса Person0
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
                        strings0[i] = num.getTranslation(); // присвоить перевод, метода getTranslation()
                        if (i == 2) { // strings0[3] // Если условие истенно, выполняется
                            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)"); // вывод текста на консоль
                        }
                    } catch (IllegalArgumentException e){ // обработка Exception
                    if (i == 2) { // strings0[3] // Если условие истенно, выполняется // оператор if
                        System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)"); // блок кода // вывод текста на консоль
                    }
//                    Matcher matcher = pattern1.matcher(strings0[i]); // регулярные выражения
//                    while (matcher.find()) { // регулярные выражения//
//                        //strings0[i] = matcher.group(); // регулярные выражения
//                        Animal num = Animal.valueOf(strings0[i]);//
//                        strings0[i] = num.getTranslation();//
//                    }
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
                    System.out.println("throws Exception //т.к. строка не является математической операцией"); // вывод текста на консоль
                } catch (IllegalStateException e) { // обработка Exception
                }
            } while (!vvod0.equals("8*8")); // цикл do-while // equals сравнивает строку с принимаемой строкой (true-false)
        } catch (IllegalStateException e) { // обработка Exception
        }
        in.close(); // закрытие входного потока
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