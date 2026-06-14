class Solution
{
    public boolean lemonadeChange(int[] bills)
    {
        int num_of_fives = 0;
        int num_of_tens = 0;

        for(int bill : bills)
        {
            if(bill == 5)
            {
                num_of_fives++;
            }
            else if(bill == 10)
            {
                if(num_of_fives == 0)
                {
                    return false;
                }

                num_of_fives--;
                num_of_tens++;
            }
            else
            {
                if(num_of_tens >= 1 && num_of_fives >= 1)
                {
                    num_of_tens--;
                    num_of_fives--;
                }
                else if(num_of_fives >= 3)
                {
                    num_of_fives -= 3;
                }
                else
                {
                    return false;
                }
            }
        }

        return true;
    }
}