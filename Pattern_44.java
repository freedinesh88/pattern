class Pattern_44{
    public static void main(String[] args){
        int space=2,num=1,k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            k=1;
            for(int j=1;j<=num;j++){
                if(j<=(num/2)+1){
                    System.out.print(k++);
                }
                else{
                    System.out.print(k--);
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


//   1
//  123
// 12343
//  123
//   1