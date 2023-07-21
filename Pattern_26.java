class Pattern_26{
    public static void main(String[] args){
        int star=2,space=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                if(i==3&&j==3){
                    System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<3){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();
        }

    }
}



// ** **
// *   *
//   @
// *   *
// ** **