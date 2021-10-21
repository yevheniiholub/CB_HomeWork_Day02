public class Machine_math_HW {
    public static void main(String[] args) {
        // Дополнительное задание

        /*
        Задание
        Используя IntelliJ IDEA, создайте проект. Создайте необходимое количество переменных типа char,
        каждой переменной присвойте значение одного символа в формате UNICODE. Выведите в консоль
        фразу «Здравствуйте, ВАШЕ_ИМЯ !»
        */

        // Об'явлення і ініціалізація змінних
        char    letter1 = '\u0417',    // 'З'
                letter2 = '\u0434',    // 'д'
                letter3 = '\u0440',    // 'р'
                letter4 = '\u0430',    // 'а'
                letter5 = '\u0432',    // 'в'
                letter6 = '\u0441',    // 'с'
                letter7 = '\u0442',    // 'т'
                letter8 = '\u0432',    // 'в'
                letter9 = '\u0443',    // 'у'
                letter10 = '\u0439',   // 'й'
                letter11 = '\u0442',   // 'т'
                letter12 = '\u0435',   // 'у'
                letter13 = '\u002C',   // ','
                letter14 = '\u0020',   // ' '
                letter15 = '\u0415',   // 'Е'
                letter16 = '\u0432',   // 'в'
                letter17 = '\u0433',   // 'г'
                letter18 = '\u0435',   // 'е'
                letter19 = '\u043D',   // 'н'
                letter20 = '\u0438',   // 'и'
                letter21 = '\u0439',   // 'й'
                letter22 = '\u0021';   // '!'


        // Почерговий вивід символів

        System.out.print(letter1);
        System.out.print(letter2);
        System.out.print(letter3);
        System.out.print(letter4);
        System.out.print(letter5);
        System.out.print(letter6);
        System.out.print(letter7);
        System.out.print(letter8);
        System.out.print(letter9);
        System.out.print(letter10);
        System.out.print(letter11);
        System.out.print(letter12);
        System.out.print(letter13);
        System.out.print(letter14);
        System.out.print(letter15);
        System.out.print(letter16);
        System.out.print(letter17);
        System.out.print(letter18);
        System.out.print(letter19);
        System.out.print(letter20);
        System.out.print(letter21);
        System.out.print(letter22);
        System.out.print('\n');

        /*
        Вивід > Здравствуйте, Евгений!
        */

        /*
        Задание 2
        Используя IntelliJ IDEA, создайте проект.
        Дано значение числа pi, которое равно 3,141592653 и значение числа Эйлера е, которое равно
        2,7182818284590452. Создайте две переменные, присвойте им значения числа pi и числа е и выведите
        их на экран без потери точности.
        */

        double pi = 3.141592653d;
        double e = 2.7182818284590452d;

        System.out.println(pi);
        System.out.println(e);

        /*
        Вмвід > 3.141592653
                2.718281828459045
        Примітка: Все таки в числі ейлера була втрачена остання двійка. Не знайшов як це можна висправити.
        */

        /*
        Задание 3
        Используя IntelliJ IDEA, создайте проект.
        Создайте три строковые переменные и присвойте им значения:
        "\nмоя строка 1"
        "\tмоя строка 2"
        "\aмоя строка 3"
        Выведите значение каждой переменной на экран. Какие отличия вы увидели. Сделайте выводы.
        */

//        String  firstStrWrong = "\nмоя строка 1",
//                secondStrWrong = "\tмоя строка 2",
//                thirdStrWrong = "\\aмоя строка 3";

//        System.out.println(firstStrWrong);
//        System.out.println(secondStrWrong);
//        System.out.println(thirdStrWrong);

        // Отриманий результат : 86:30
        //java: illegal escape character
        /*
        Причина: На початку кожної строки стоять спец символи в першій строці це \n - перехід на нову строку
                 в другій \t табуляція і в третій \a - теж спецсимвол, але точно не знаю як називається
                 в інтернеті знайшов що це audible bell, тобто якийсь звуковий сигнал.
        Вирішення проблеми: Щоб вивести вміст строки можна екранізувати спецсимвол.
        * */
        String  firstStrCorrect = "\\nмоя строка 1",
                secondStrCorrect = "\\tмоя строка 2",
                thirdStrCorrect = "\\aмоя строка 3";

        System.out.println(firstStrCorrect);
        System.out.println(secondStrCorrect);
        System.out.println(thirdStrCorrect);
        /*
        Щоб вивести спец символ можна вивести його як один чар
        */

        char specSymbol = '\n';
        System.out.print(specSymbol);

         /*
        Або
        */

        System.out.print('\n');

    }
}
