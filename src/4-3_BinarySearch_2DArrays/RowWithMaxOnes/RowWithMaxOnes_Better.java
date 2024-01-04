//better way
//use binary search as given that in each row,elements are sorted.
import java.util.ArrayList;

public class RowWithMaxOnes_Better
{
    private static int maximumOnesRowHelper(ArrayList<Integer> row, int low, int high)
    {
        if (high >= low)
        {
            //    Get the middle index.
            int mid = low + (high - low) / 2;

            //    Check if the element at middle index is first 1.
            if ((mid == 0 || row.get(mid - 1) == 0) && row.get(mid) == 1)
            {
                return mid;
            }

            //    If the element is 0, recur for the right side.
            else if (row.get(mid) == 0)
            {
                return maximumOnesRowHelper(row, (mid + 1), high);
            }

            //    If element is not first 1, recur for the left side.
            else
            {
                return maximumOnesRowHelper(row, low, (mid - 1));
            }
        }

        return -1;
    }

    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        //    Initialize max values
        int ans = -1, max = -1;

        // Traverse for each row and count number of 1s by finding the index of first 1
        int i, index;

        for (i = 0; i < n; i++)
        {

            index = maximumOnesRowHelper(matrix.get(i), 0, m - 1);

            if (index != -1 && m - index > max)
            {
                max = m - index;
                ans = i;
            }
        }

        //    Return the row with maximum number of ones.
        return ans;
    }
}