class One{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Runtime r = Runtime.getRuntime();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        System.out.println(r.totalMemory() - r.freeMemory());
        int arr [] = {10,20,120,30,190,100,200};

        int max = arr[0];
        for(int element : arr){
            if(element>max){
                max = element;
            }
        }
       // int hash [] = new int[1000];
        int hash [] = new int[max+1];
        for(int i = 0 ; i<arr.length; i++){
            if(hash[arr[i]]==0){
                hash[arr[i]]=1;
            }
            else{
                System.out.println("Boys Party");
                return ;
            }
        }
        System.out.println("Girls Party");
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        System.out.println(r.totalMemory() - r.freeMemory());

    }
}