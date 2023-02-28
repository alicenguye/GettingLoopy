public class Question6 {
    public static void main(String[] args) {
        //declaration of variable
        int i;
        int j;
        //start looping
        for(i = 1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
