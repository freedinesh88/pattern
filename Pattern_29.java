class Pattern_29{
    public static void main(String[] args){
        int star=1;
        for(int i=1;i<=5;i++){
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
            }
            else{
                star--;
            }
            System.out.println();
        }
    }
}



//         *
// * * * * * *
// * * * * * * *
// * * * * * *
//         *