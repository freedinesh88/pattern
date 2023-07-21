class Pattern_22{
    public static void main(String[] args){
        int star=1,space=2;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<3){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
            System.out.println();
        }
    }
}

//   *
//  ***
// *****
//  ***
//   *