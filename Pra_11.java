class Pra_11{
    public static void main(String[] args){
        int star=1,space=2,n=1;
        char ch='a';
        for(int i=1;i<=4;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                if(i%2==0){
                    System.out.print(ch);
                }
                
                else{
                   System.out.print(n); 
                }
            }
            System.out.println();
            star+=2;
            space--;
            ch++;
            n++;
        }
    }
}

//   1
//  bbb
// 33333
// ddddddd

