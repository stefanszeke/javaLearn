public class CLArguments {
    public static void main(String[] args) {
        String[][] people = {
            {"John", "Smith", "123 Main St", "123-456-7890"},
            {"Jane", "Doe", "456 Main St", "123-456-7890"},
            {"John", "Doe", "789 Main St", "123-456-7890"},
            {"Jane", "Smith", "012 Main St", "123-456-7890"},
        };

        if(args.length == 0) {
            System.out.println("No arguments provided");
        } else {
            for(String[] person: people) {
                if(args[0].equals(person[0])) {
                    System.out.println(person[0] + " " + person[1] + " " + person[2] + " " + person[3]);
                }
            }
        }


    }
    
}
