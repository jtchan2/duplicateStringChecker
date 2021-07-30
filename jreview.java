import java.util.*;
public class jreview{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //for(int i=0; i<3; i++){
        //    int num= scan.nextInt();
        //    System.out.println(num);
        //}
        System.out.println("Enter a String to be tested for duplicates");
        String input= scan.nextLine();
        String copy= input.toLowerCase();
        String []split= input.split(" ");
        String []split2= copy.split(" ");
        //int [] dupes= new int[100];
        //System.out.println(input);
        int length= split.length;
        for(int i=0; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(split2[i].equals(split2[j])){
                    split2[j]=" ";
                }
            }
        }
        for(int k=0; k<length; k++){
            if(split2[k].equals(" ")==false){
                System.out.print(split[k]+" ");
            }
        }
        System.out.println();
        scan.close();
    }
}