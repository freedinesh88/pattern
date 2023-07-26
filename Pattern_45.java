class Pattern_45{
    public static void main(String[] args){
        int space=2,num=1;
        char ch='a';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            ch='a';
            for(int j=1;j<=num;j++){
                if(j<(num/2)+1){
                    System.out.print(ch++);
                }
                else{
                    System.out.print(ch--);
                }
            }
            if(i<3){
                space--;
                num+=2;
            }
            else{
                space++;
                num-=2;
            }
            System.out.println();
        }
    }
}


//   a
//  aba
// abcba
//  aba
//   a