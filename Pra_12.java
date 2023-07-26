class Pra_12{
    public static void main(String[] args){
        int star=1,space=2;
            int n=1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                if(i==1){
                    System.out.print(1);
                }
                else{
                    System.out.print(n++);
                }
            }
            System.out.println();
            star+=2;
            space--;
        }
    }
}

//   1
//  123
// 45678

