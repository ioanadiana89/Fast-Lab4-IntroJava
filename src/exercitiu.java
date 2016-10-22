/**
 * Created by Ioana on 10/22/2016.
 */
public class exercitiu {
    public static void main(String[] args) {
        int max = SkeletonJava.readIntGUI("cate nr. vrei");;

        int suma =0;
        int counter=0;

            while(true){
            counter++;
            int nrCurent = SkeletonJava.readIntGUI("introduceti numarul" + counter + ":");
                if(nrCurent<0) {
                    counter--;
                    break;
                }
            suma = suma + nrCurent;
        }
        double avg = suma/(double)counter;

        SkeletonJava.printGUI("media este:"+avg);

    }
}
