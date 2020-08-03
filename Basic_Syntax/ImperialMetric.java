package Basic_Syntax_Name.zip;

public class ImperialMetric
{

    public static void main(String[] args)
    {
        System.out.println(
                "\n     |    0\"    1\"    2\"    3\"    4\"    5\"    6\"    7\"    8\"    9\"    10\"    11\" \n" );

        for ( int feet = 5 ; feet <= 9 ; feet++ )
        {
            System.out.printf(feet + "\'");
            System.out.print("   |   ");
            for (int inches = 0 ; inches < 12 ; inches++)
            {
                double DoubleMetres = (feet*12+inches)*0.0254;
                System.out.printf("%6.3f",DoubleMetres);
            }
            System.out.println();
        }
    }

}
