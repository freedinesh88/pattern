class Pattern_25{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||j==1||i==5||j==5){
                    System.out.print("*");
                }
                else if(i==3&&j==3){
                    System.out.print("@");
                }
                else if(i%2==0&&j%2==0){
                    System.out.print("~");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


// *****
// *~ ~*
// * @ *
// *~ ~*
// *****