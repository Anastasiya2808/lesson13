package methods;

public class CustomUtils {
    // тепизированные методы (generic methods)
    // метод, который проверяет наличие элемента в массиве
    // примитивы и generic НЕсовместимы
    public static <T> boolean inArray(T[] arr, T element){
        if (arr == null || element == null){
            throw new IllegalArgumentException("arr и element " + "не могут быть null");
        }
       /* String[] strings = {"s", "de", "d"};
        for (String elem: strings){
        }*/
        for (T t: arr){
            if (element.equals(t)) return true;
        }
        return false;
    }

    /* <Т,К,S,P>*/
    // при вызове Т модет быть Number
    // при вызове К модет быть String
    public static <T extends Number, K extends String> int compareHashCode (T first, K second){
        // у first можно вызвать метод Number и его родителей (только выше)
        // у second можно вызвать метод String и его родителей (только выше)
        return Integer.compare(first.hashCode(), second.hashCode());
    }
}
