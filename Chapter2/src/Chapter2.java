

public class Chapter2{
    public static void main(String[] args){
        System.out.println("Hello");

        /* A1
        int max = Integer.parseInt(args[0]);
        int maxL = Integer.toString(max).length();
        int min = Integer.parseInt(args[0]);
        int minL = Integer.toString(max).length();


        for(int i=1; i<args.length; i++){
            if(max<Integer.parseInt(args[i])){
                max = Integer.parseInt(args[i]);
                maxL = Integer.toString(max).length();
            }
            if(min>Integer.parseInt(args[i])){
                min = Integer.parseInt(args[i]);
                minL = Integer.toString(max).length();
            }
        }

        System.out.println("max: " + max + ", length: " +maxL);
        System.out.println("max: " + min + ", length: " +minL);
        */

        /* A2
        String x;
        for(int i=0;i<args.length; i++){
            for(int j=0; j<args.length-1; j++){
                if(Integer.parseInt(args[j])<Integer.parseInt(args[j+1])){
                    x = args[j];
                    args[j]= args[j+1];
                    args[j+1] = x;
                }
            }
        }

        for(int i=0; i<args.length; i++){
            System.out.print(args[i] + " ");
        }
        */

        /* A4
        int n = args.length;
        int numbers[ ] = new int[n];
        int minNumber = 0;

        for (int i=0; i<args.length; i++){
            numbers[i] = args[i].length();
        }

        for (int j=0; j<args.length-1; j++){
            if(numbers[j]<numbers[j+1]){
                minNumber = j;
            }
        }

        System.out.println("Min: " + args[minNumber]);
        */

        /* B3
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        Double discr = (double) b*b - 4*a*c;

        double answer1 = (-b + Math.sqrt(discr))/(2*a);
        double answer2 = (-b - Math.sqrt(discr))/(2*a);

        System.out.println(answer1);
        System.out.println(answer2);
        */
    }
}


















