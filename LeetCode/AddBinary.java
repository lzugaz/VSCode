public class AddBinary {
    public String addBinary(String a, String b) {
        String c = "";
        int aint = Integer.parseInt(a);
        int bint = Integer.parseInt(b);
        int sum = aint + bint;
        c= Integer.toBinaryString(sum);
        return c;
    }
}
