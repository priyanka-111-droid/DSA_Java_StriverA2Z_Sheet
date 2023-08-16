public class PlanetMisery {
    static int planetMisery(int n, int m) {
        /*
        uses the smaller solar system count to visit all its planets,
        then visits all planets from the larger solar system.
            if max and min same return maxPlanets,
            otherwise add 1 to show planet where solar systems meet.
         */
        int smallerSolarSystem = Math.min(n, m);
        int largerSolarSystem = Math.max(n, m);
        int maxPlanets = smallerSolarSystem * 2;
        if(smallerSolarSystem==largerSolarSystem)
            return maxPlanets;

        return maxPlanets+1;
    }
}