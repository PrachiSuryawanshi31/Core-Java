/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/

class Pattern11
{
    public static void main(String[] args) 
    {

        int n = 5;

        for(int i = n; i >= 1; i--) 
        {
            for(int j = n; j >= (n - i + 1); j--) 
            {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}