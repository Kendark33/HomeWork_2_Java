/* Task_0


// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1” */

 class Task_0 {
    public static void findJewelsInStones(String jewels, String stones) {
        int[] jewelCount = new int[128]; // создаем счетчик для каждого символа ASCII
        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);
            jewelCount[stone]++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            result.append(jewel).append(jewelCount[jewel]);
        }
        System.out.println(result.toString());
    }
} 

//Task_1
class Task_1 {

    // Вам дается строка S и целочисленный массив индексов int index[s.length].
    // Напишите программу, которая перетасует символы в S таким образом,
    // что символ c i-й позиции переместится на индекс index[i] в результирующей
    // строке.
    //
    // Пример: s = “cba”, index = [3,2,1] result “abc”

    public String shuffle(final String s, final int[] index) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[index[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
