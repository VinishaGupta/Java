public class Main9 {
    public static void main(String[] args) {
        if(true){
            System.out.println("Hello World");
        }

        int a=10;

        if(a==10){
            System.out.println("Hello World");
        }

        int count=1;
        while(count !=5){
            System.out.println(count);
            count++;
            // when you don't know how many times the loop is going to run, use while loop
        }

        for(int i=1; i<5;i++){
            System.out.println("Value: "+i);
            // when you know how many times the loop is going to run, use while loop
        }
    }
}
