public class FirstProgram {
    int a, b, c;
    public FirstProgram(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int add(int a, int b) {
        return c = a + b;
    }
    public static void main(String[] args){
        FirstProgram fp = new FirstProgram(5, 5, 5);
        System.out.println("Add is : " +fp.add(5, 5));
    }
}
