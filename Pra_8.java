class Pra_8{
    public static void main(String[] args){
        int star=0;
            char ch='a';
        for(int i=1;i<=4;i++){
            int n=1;
            star++;
            for(int j=1;j<=star;j++){
                if(i%2==0){
                    System.out.print(ch);
                    
                }
                else{
                    System.out.print(n++);
                }
                
             }
             if(i%2==0){
                ch++;
             }
               
             System.out.println();
        }
    }
}


// 1
// aa
// 123
// bbbb