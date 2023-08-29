public class quadtratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three coefficients");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The equation is:");
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Every number is a solution");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println(" NO number is solution");
        } else if (a == 0 && b != 0) {
            System.out.println(b + "x + " + c + " =0\n\tx= " + (float) -c / b);
        } else if (a != 0) {
            System.out.println(a + "x^2 + " + b + "x+ " + c + "=0");
        }
        int d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("No real number is a solution");
        } else if (d == 0) {
            System.out.println("\tx = " + (float) -b / (2 * a));
        } else if (d > 0) {
            double sd = Math.sqrt(d);
            System.out.println("\tx1 =" + (float) (-b + sd) / (2 * a));
            System.out.println("\tx2 =" + (float) (-b - sd) / (2 * a));
        }

    }

}
