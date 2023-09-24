package Normal;
    /**
     * ReverseEachWord
     */
    public class ReverseEachWord {

        public static void main(String[] args)
        {
            long start=System.currentTimeMillis();
            String orgi="Hello World";
            String finals="";
            String[] Wordarr=orgi.split(" ");
            for (String string : Wordarr) {
                for (int i = string.length()-1;i>=0;i--) {
                    finals+=string.charAt(i);
                }
                finals+=" ";
            }
            System.out.println(finals);
            long end = System.currentTimeMillis();
            System.out.println("The program executed with a time of "+(end-start)/1000+"S");
        }
    }