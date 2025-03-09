package error;

public class NullPointerException {
    static class Person {
        String name = null;
    }
    public static String getName() {
        return null;
    }

    public static void main(String[] args) {
        // NPE(NullPointerException) 에러 발생 예시
        String name = getName(); 
        if(name != null)
        System.out.println(name.length()); // NPE 발생
        else
        System.out.println("name = null");

        // Person person = null;
        // System.out.println(person.name);

        // String str = null;
        // System.out.println(str.length()); // NPE 발생

        // String[] arr = new String[3]; // 초기값 null
        // System.out.println(arr[0].length()); // NPE 발생

        

    }
}
