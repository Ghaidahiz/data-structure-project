package src;

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] line =createIndexList();
        for (String value : line)
        System.out.println(value+"\n");
    }

    //public static LinkedList2<Integer,String > createIndexList() throws Exception{
        public static String[] createIndexList() throws Exception{
        File dataset = new File("C:\\Users\\EMAN\\Desktop\\data-structure-project-2\\dataset.csv");
        LinkedList2<Integer,String> indextList = new LinkedList2<Integer,String>();
        BufferedReader br = new BufferedReader(new FileReader(dataset));
        String line = br.readLine();
         line = br.readLine();
        
        //while ((line = br.readLine()) != null);
        String[] arr=line.split("[,; .\"]+");
          

        return arr ;
       // return new LinkedList2<>();
    } 

    public static void removeStopWords(LinkedList2<Integer,String> indexList){

    }

    public static LinkedList2<String, Integer> createInvertedIndexList (){
        return new LinkedList2<>();
    }
}
