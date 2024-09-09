public static void main(String[] args) {
    int n = 100;
    int steps = 0;
    while (n != 0){

        //Find out if n is divisible by 2
        boolean divisibleBy2 = n % 2 == 0;

        if (divisibleBy2){
            n = n / 2;
        }
        else{
            n--;
        }
        steps++;
    }
    System.out.println(steps);
}