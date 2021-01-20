package myPackage;

public class Hello {
    public static void main(String[] args) {
        try {
            chia2So(1, 0);
        } catch (Demo e) {
            System.out.println(e.getError());
        }
    }
    public static void chia2So(int a, int b) throws Demo {
        try {
            int sum = a / b;

            System.out.println(sum);
        } catch (Exception e) {
            throw new Demo("loi chia cho 0");
        }
    }
}
// ke thua Exception hoac lop con exception deu duoc;