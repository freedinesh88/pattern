class Pra_4{
    public static void main(String[] args){
        int star=0;
        
        for(int i=1;i<=4;i++){
            star++;
            for(int j=1;j<=star;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
             }
             System.out.println();
        }
    }
}




// 1
// 01
// 101
// 0101