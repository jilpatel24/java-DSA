class butterFly{
    public static void main(String[] args) {
        int num = 4;
           for (int i = 0; i < num; i++) {
            //for * (upper part)
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            //for space
            for (int j = 1; j<2*(num-i); j++) {
                System.out.print(" ");
            }//for *
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
           System.out.println();
        }
    //for lower part
    for (int i = num; i >0; i--) {
        for (int j =0; j<i; j++) {
            System.out.print("*");
        }//for space
        for (int j = 0; j <=2*(num-i); j++) {
            System.out.print(" ");
        }
        for (int j = 0; j <i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
