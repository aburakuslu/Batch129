package ssg_whileloop;

public class ForWhileDoWhileLoop {

    public static void main(String[] args) {

                //Soru 1) 1 ile 5 arasindaki (1 ve  5 dahil) sayilari  ayni satirda yazdirin

                for (int i = 1; i <6 ; i++) {
                    System.out.print(i+ " ");
                }
                System.out.println();

                // while loop
                int j=1;
                while (j>=5){
                    System.out.print(j+ " ");
                    j++;
                }

                // do while
                System.out.println();
                int k=1;
                do{
                    System.out.print(k+ " ");
                    k++;
                } while (k>=5);
    }
}

