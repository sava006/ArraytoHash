package Assignment4.com;

import java.util.*;
import java.util.Set;

public class Main {

//Consider keys = name of lakes ;  values = ArrayList<Double>   - list of times for that lake


    public static void main(String[] args) {
        // write your code here
        //enter values  with the two scanner classes
        Scanner input = new Scanner(System.in);
        Scanner namin = new Scanner(System.in);
        System.out.println("How many lake entries do you need");
        int lenght = input.nextInt() + 1;

        String AllLakes = "";
        String total3 = "";

        //enter lake names

        for (int j = 1; j < lenght; j++) {
            System.out.println("Enter Lake name: ");
            String name = namin.nextLine() + ",";
            AllLakes += name;
        }
        List<String> Lakelist = new ArrayList<String>(Arrays.asList(AllLakes.split(",")));
        String t2;
        for (int e = 0; e < Lakelist.size(); e++) {
            System.out.println("Enter time for Lake " + Lakelist.get(e) + " " + e + " below:");
            Double ttt = input.nextDouble();
            t2 = "" + ttt;
            total3 += t2 + ",";
        }
        System.out.println("");
        String runtimes[] = total3.split(",");
        //create values arrays for doubles
        double runtimesnums[] = new double[runtimes.length];
        for (int x = 0; x < runtimesnums.length; x++) {
            runtimesnums[x] = Double.parseDouble(runtimes[x]);
        }
        //Create list times
        List<Double> TimeList = new ArrayList<Double>();
        for (int r = 0; r < runtimesnums.length; r++){
            TimeList.add(runtimesnums[r]);
        }
        //set maximum value
        double maxin = 1000 ;
        double min = TimeList.get(0);
        Map<String, Double> runvalues = new HashMap<String, Double>();
        System.out.println("");
        String whilet = "";
        for (int t = 0; t < Lakelist.size(); t++) {

            while (Lakelist.equals(t) && TimeList.get(t) < min) {
                     min = TimeList.get(t);
                String mint = "" + min;
                whilet = mint + ",";
                System.out.println(whilet);
            }
           //runvalues.put(Lakelist.get(t), min);
            }
        whilet += whilet;
        System.out.println(whilet);
            for (int y = 0; y < Lakelist.size(); y++) {
                //
                System.out.println(" Lake " + Lakelist.get(y) + " " + y + " run time: " +
                        runtimesnums[y] + " minutes");
                // if(Lakelist.equals(y)){
                for (int qq = y; qq < runtimesnums.length; qq++) {
                    //is is the part where I am still running into problems
                    //it is jusst takeing the maxin value of 1000
                    if (runtimesnums[y] < runtimesnums[qq]) {
                        maxin = runtimesnums[qq];
                        runvalues.put(Lakelist.get(y), maxin);

                    } else if (runtimesnums[y] < runtimesnums[qq]){
                        maxin = runtimesnums[y];
                        runvalues.put(Lakelist.get(y), maxin);
                    }
                    //runvalues.put(Lakelist.get(y), maxin);
                }
                // runvalues.put(Lakelist.get(y), maxin);

               // runvalues.put(Lakelist.get(y), maxin);
            }
        System.out.println("");
            System.out.println(runvalues);

          Set keyset = runvalues.keySet();
          double best = runtimesnums[0];
        // print list.

          for (Object lakenamemax : keyset) {
           if (runvalues.get(lakenamemax) < best) {
               System.out.println("Lake " + lakenamemax + " Fastest lake time "
                       + runvalues.get(lakenamemax) + " in minutes");
           }

           }}}






