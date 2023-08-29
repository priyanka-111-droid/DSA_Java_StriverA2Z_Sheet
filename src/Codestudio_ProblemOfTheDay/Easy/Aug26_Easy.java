package Codestudio_ProblemOfTheDay.Easy;

// maximum height of a triangle that can be formed using 'n' ninja stars.
/*
In other words, we want to solve for 'h' in the triangular number formula:
n = (h * (h + 1)) / 2
Where 'n' is the given number of stars and 'h' is the height of the triangle.
 */
public class Aug26_Easy {
    int ninjaAndTriangle(int n) {
        int maxHeight = (-1 + (int)(Math.sqrt(8 * n + 1))) / 2;
        return maxHeight;
    }
}
