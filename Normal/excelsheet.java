package Normal;
public class excelsheet {
    public static void main(String[] args)
    {
        String excel="AA";
        int flag =0;
        int rot=excel.length()-1;
        for (int i = 0; i <  excel.length(); i++) {
            flag+=(int)(excel.charAt(i)-64);
            //System.out.println(flag);
        }
        if(excel.length() > 1)
        {
            while(rot!=0)
            {
                flag+=25;
                rot --;
            }
        }
        System.out.println(flag);
    }
}
