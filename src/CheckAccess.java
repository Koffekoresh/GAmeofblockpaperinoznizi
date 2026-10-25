public class CheckAccess {
    public static void main(String[] args) {
        CheckAccess obj = new CheckAccess();
        System.out.println(obj.checkAccess(15));
        System.out.println(obj.checkAccess(20));
    }

    public String checkAccess(int age) {
        if (age >= 18) {
            return "Доступ разрешен";
        } else {
            return "Доступ запрещен";
        }
    }
}