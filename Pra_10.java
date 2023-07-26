class Pra_10{
    public static void main(String[] args){
        int star=1,space=2 , num=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print(num++);
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
//   1
//  234
// 56789
//  101112
//   13
