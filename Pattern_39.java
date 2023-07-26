class Pattern_39{
    public static void main(String[] args){
        int n1=0,n2=1;
        for(int i=0;i<=4;i++){
            for(int j=1;j<=4;j++){
                int n3=n1+n2;
                System.out.printf("%4d ",n1);
                n1=n2;
                n2=n3;
            }
            System.out.println();
        }
    }
}



//    0    1    1    2
//    3    5    8   13
//   21   34   55   89
//  144  233  377  610
//  987 1597 2584 4181
