import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        List<String> list = new ArrayList<String>();
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int size = chars.indexOf(a);
        int rows = size;
        int cols = size * 2;
        Character current;
        //String s2a = "";

        for (int i = 0; i <= rows; i ++) {
            String s2a = "";
            current = chars.charAt(i);
            for (int j = 0; j <= cols; j++) {
                if (j == size - i || j == size + i) {
                    //System.out.print(current);
                    s2a += current;
                }
                else {
                    //System.out.print(" ");
                    s2a += " ";
                }
            }
            //System.out.println();
            list.add(s2a);
        }

        for (int i = rows-1; i >= 0; i--) {
            String s2a = "";
            current = chars.charAt(i);
            for (int j = cols; j >= 0; j--) {
                if (j == size - i || j == size + i) {
//                    System.out.print(current);
                    s2a += current;
                }
                else {
//                    System.out.print(" ");
                    s2a += " ";
                }
            }
//            System.out.println();
            list.add(s2a);
        }

        return list;
    }
}
