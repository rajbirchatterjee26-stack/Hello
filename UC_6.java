//UC6

public class UC_6
{
    static String[] getopattern()
    {
        return new String[]{
            "   ****    ",
            " **    **  ",
            " **    **  ",
            " **    **  ",
            " **    **  ",
            " **    **  ",
            "   ****    ",};
    } 
    static String[] getppattern()
    {
        return new String[]{
            "   ****  ",
            " **    ** ",
            " **    ** ",
            " *****   ",
            " **       ",
            " **       ",
            " **       "};
    }
    static String[] getspattern()
    {
        return new String[]{
            "  *****  ",
            " **       ",
            " **       ",
            "  *****  ",
            "      ** ",
            " *    ** ",
            "  *****  "};
    }
    public static void main(String[] args)
    {
        String[] opattern = getopattern();
        String[] ppattern = getppattern();
        String[] spattern = getspattern();
        for(int i=0;i<opattern.length;i++)
            System.out.println(opattern[i]+" "+opattern[i]+" "+ppattern[i]+" "+spattern[i]);
    }
}