package lesson3.streamsHomeWork;

import java.util.Optional;

public class WorkWithStreams {


    public static void main(String[] args) {
      Optional<Computer> computer =   ComputerCollection.computersList().stream().findAny();
     Computer computer1 =  computer.get();
        System.out.println(computer1.toString());
    }
}
