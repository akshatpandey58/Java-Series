class rem {
    static void java(int x, int y) // added static keyword, changed from int to void
    {
        int r = 0;
        while (y > 0) {
            r = y % 10;
            y = y / 10;
            System.out.println("No. of " + x + " is..." + r);
            x = x * 10;
        }

    }

    public static void main(String args[]) {
        int n = 502020;
        // int r; //not required
        int p = n;
        // int pv; //not required
        java(1,p);

}
}
