class A{
    public static void main(String[] args) {
        String str = "om is my friend and he is a good guy and he is a good singer";

        int searchIndex= -1;

        while(true){
            searchIndex= str.indexOf("is",searchIndex+ 1);

            if(searchIndex!= -1){
                System.out.println(searchIndex);
            }
            
        }


    }
}