package ExceptionHandling;

public class TryCatchPart2 {
    String name = "Tom";

//    public static void main(String[] args) {
//
//        System.out.println("Hello Testing");
//
//        TryCatchPart2 obj = new TryCatchPart2();
//
//        obj = null;
//
//        try {
//            int i = 7/0;
//            System.out.println(obj.name);
//        }
//        catch (NullPointerException e) {
//            System.out.println("NPE is coming....");
//        }
//        catch(ArithmeticException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        m();
    }

    static void m()  {

        int a = 10;
        int b = 0;
        System.out.println("method 1");
        try{
            m2(a, b);
        }catch(ArithmeticException e){
            System.out.println("art exe");
        }
    }

    static void m2(int a, int b)throws ArithmeticException {
        System.out.println("method 2");
        m3(a, b);
    }

    static void m3(int x, int y) throws ArithmeticException {
        int c = 0;
        int arr[] = new int[1];
        System.out.println("method 3");
        try {

            c = x / y;
            System.out.println(c);
            arr[45] = 45;
            System.out.println(arr);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("caught array exception");
        } finally {
            System.out.println("exeute");
        }
    }
}
