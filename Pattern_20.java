class Pattern_20{
    public static void main(String[] args){
        int star=1,space=2;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
            star+=2;
            space--;
        }
    }
}


//   *
//  ***
// *****