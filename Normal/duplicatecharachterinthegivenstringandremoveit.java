package Normal;
public class duplicatecharachterinthegivenstringandremoveit {
    public static void main(String[] args)
    {
        String s="gurunanthanrameshkumarbhavatharanirameshkumarjayalakshmirameshkumaronceuponatimetherelivedaghosthewasmeanttobethekillerbutfearedthemostuiugyuguffuyfuyfyufuufuyfufugfuyfyufuyfuffyfyufiillifyfyfyfurufjfjhbkjbkjvjgtdydyrsyrssreatrsytdyhkgkhlpiouydyrsyrshtdjdutduyfufkhlhlhdlvhksdjgcjvcjsbcguytiusftuystfuftiuf uvufusytvuystfuysfteuytauauYytyawywqyfdhgfhgfhf YhgkushkhilsailhqihkhahkuqiukbqkuquqyvqgiugqsjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjxnsjfxdwdwkjdjnwdcejdhyejvawugdieikfnrugrkgherlgreiygheiguvrhfvefieuwofgwoefiewfhbcwehsycgwyefdquwiqwoeqqobfrwfhewkfjgwekufbdscksdjvseuhfpaekdwkdbwnufwegfeoufgowaikcsjabcaskufgwaiudVWGDWUKADDGASDFGHJKLQWERTYUIOPASDFGHJKLZXCVBNMQWERTYUIOPQASDFGHJKLZXCVBNM,QWERTYUIOP123456789SDFGHJKSDFGHJKLASDFGHJKSDFGHJKXCVGBHJKECRTVYBUWSERCTFVBYUNMCVBNWEXRDCTFVYBGUHNAZSXDCFVGBHJWERDTFYGUHIWESXDRCFTVGYBHUNJMKWZESXDCRFVBHNJM4DERTFYHUIJMKOSWEDRTFVBGYHJIMKS4ED5FRTYUHNIJMKOSED5RTFBGYNIJMK99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999KMMMMMMMM444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444";
        String withoutduplicate="";
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(i!=j)
                {
                    if(s.charAt(i)!=s.charAt(j))
                    {
                        count=1;
                    }
                    else
                    {
                       count=0;
                       break;
                    }
                }
            }
            if(count==1)
            {
                withoutduplicate+=s.charAt(i);
            }
        }
        System.out.println(withoutduplicate);
    }
}
