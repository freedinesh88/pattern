class Pattern_42{
    public static void main(String[] args){
        int space=2,num=1,k=2;
        char c1='a', c2='a';
        for(int i=1;i<=3;i++){
            c2=c1;
            k=2;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=num;j++){
                if(j<=(num/2)+1){
                    System.out.print(c2--);
                }
                else{
                    System.out.print(k++);
                }
            }
            c1++;
            System.out.println();
            space--;
            num+=2;
        }
    }
}

//   a
//  ba2
// cba23