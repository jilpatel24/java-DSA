class p2{
    public static void main(String[] args) {
        int num = 4;
        //for upper part
           for (int i = 0; i < num; i++) {
            //for 1st space
               for (int j = 0; j < i ;j++) {
                   System.out.print(" ");
               }
               System.out.print("*");
               //for 2nd space
               for (int j = 1; j <= 2*(num-i)-3; j++) {
                   System.out.print(" ");
               }if(i != num-1){
                System.out.print("*");
               }
               System.out.println();
           }
           //for lower part
           for (int i =3; i>0; i--) {
            //for space
               for (int j = 0; j < i-1; j++) {
                   System.out.print(" ");
               }
               System.out.print("*");
               //for space
               
               for (int j = 1; j <= 2*(num-i)-1; j++) {
                   System.out.print(" ");
               }
              
               System.out.print("*");
               System.out.println();
           }
    }
}
