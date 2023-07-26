class Pattern_43{
    public static void main(String[] args){
        int space=2,num=1;
        char c1='a';
        for(int i=1;i<=3;i++){
            c1='a';
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                if(j<(num/2)+1){
                    System.out.print(c1++);
                }
                else{
                    System.out.print(c1--);
                }
            }
            System.out.println();
            space--;
            num+=2;

        }
    }
}


//   a
//  aba
// abcba