class Ass_2 {
    public static void main(String[] args) {
        int star=-1,space=3;
        for(int i=1;i<=3;i++){
            space--;
            star+=2;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}

//   *
//  ***
// *****