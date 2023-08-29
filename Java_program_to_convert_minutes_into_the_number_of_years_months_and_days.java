public class years {
    public static void main(String[] args) {
        int days;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of days");
        days = sc.nextInt();
        int years = days / 365;
        days = days - (365 * years);
        int months = days / 30;
        days = days - (30 * months);
        System.out.println(years + " years " + months + "months " + days + "days ");
        sc.close();
    }

}
