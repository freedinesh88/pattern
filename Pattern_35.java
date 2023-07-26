class Pattern_35{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==j||i+j==6){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}



// 1 0 0 0 1
// 0 2 0 2 0
// 0 0 3 0 0
// 0 4 0 4 0
// 5 0 0 0 5