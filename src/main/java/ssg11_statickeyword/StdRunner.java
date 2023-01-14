package ssg11_statickeyword;

public class StdRunner {

    public static void main(String[] args) {

        class MyClass { String isim = "Ali Can";
            int yas = 33; int kilo = 85;
            MyClass(){
            }
            MyClass(String isim, int yas){
                this.isim = isim;
                this.yas = yas; }
            MyClass(String isim){ this.isim = isim;
            }

            StdRunner insan01 = new StdRunner();

        }

        System.out.println();
    }
}
