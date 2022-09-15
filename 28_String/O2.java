class A{
    public static void main(String[] args) {
        String str = "vikramaditya";

        int searchIndex = str.lastIndexOf('a');

        while(searchIndex!=1){
            searchIndex = str.lastIndexOf('a', searchIndex-1);

            if (searchIndex!=1) {
            System.out.println(searchIndex);
            } else {
                break;

            }

            }
        }

}