class Pattern_38{
    public static void main(String[] args){
        int a=3;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.printf("%2d ",a);
                a=a+3;
            }
            System.out.println();
        }
    }
}


//  3  6  9 12
// 15 18 21 24
// 27 30 33 36
// 39 42 45 48