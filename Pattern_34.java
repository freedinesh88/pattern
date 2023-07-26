class Pattern_34{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==1||i==5||i==j){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


// 1
// 22
// 3 3
// 4  4
// 55555