class Pattern_28{
    public static void main(String[] args){
        int star=1,space=2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            if(i<3){
                space--;
                star++;
            }
            else{
                star--;
                space++;
            }
            for(int j=1;j<=4;j++){
                if(i>1 && i<5){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}


//     *
//   * * * * * *
// * * * * * * *
//   * * * * * *
//     *