class Pattern_30{
    public static void main(String[] args){
        int space=2, star=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=4;j++){
                if(i==1 || i==5){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            for(int j=1;j<=star;j++){
                System.out.print("* ");
            }
            if(i<3){
                star++;
                space--;
            }
            else{
                star--;
                space++;
            }
            System.out.println();
        }
    }
}


//     *         *
//   * * * * * * * *
// * * * * * * * * * *
//   * * * * * * * *
//     *         *