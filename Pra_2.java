class Pra_2 {
    public static void main(String[] args) {
        int star=5,space=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if(i<=2){
                star -= 2;
                space++;
            }
            else{
                star += 2;
                space--;
            }
            System.out.println();
        }
    }
}


// *****
//  ***
//   *
//  ***
// *****