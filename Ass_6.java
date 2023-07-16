class Ass_6{
    public static void main(String[] args){
        int star=1, space=3;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                if(i==3&&j==3){
                    continue;
                }
                else{
                System.out.print("*");
                }
            }
            if(i<3){
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
            System.out.println();
        }
    }
}


// *   *
// ** **
// *****
// ** **
// *   *